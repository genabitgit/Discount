import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import com.sun.istack.internal.Nullable;

public class Discount {
    /**
     * The method of "discount". Applies the discount "discount" to the price starting from the offset position
     * the number of readLength positions. New prices are rounded "down",
     * up to a smaller integer.
     *
     * @param price      - the price of the original.
     * @param discount   - % discount, from 1 to 99.
     * @param offset     - number of the position to apply the discount from.
     * @param readLength - the number of items to apply the discount to.
     * @return - array of new prices.
     */
    public @Nullable
    int[] discount(@NonNull int[] price,
                   @IntRange(from = 1) int discount,
                   @IntRange(from = 0) int offset,
                   @IntRange(from = 1) int readLength) {

        // Set the size of the array with the new prices. Array with discounted prices.
        int[] priceWithDiscount = new int[readLength];

        try {
            // In the array with the new prices copied the prices that will be discounted
            System.arraycopy(price, offset, priceWithDiscount, 0, priceWithDiscount.length);
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }

        try {
            // Filling in the array with discounted prices
            for (int i = 0; i < priceWithDiscount.length; i++) {

                // Сalculating the discount amount
                double amountOfDiscount = (discount * (priceWithDiscount[i] / 100.0f));

                // Subtract the discount amount from the price
                double priceWithDiscountDoubleType = (priceWithDiscount[i] - amountOfDiscount);

                // Rounding the price down
                priceWithDiscount[i] = (int) Math.floor(priceWithDiscountDoubleType);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //return price with discount
        return priceWithDiscount;
    }
}