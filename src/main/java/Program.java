import java.io.IOException;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws IOException {
        int offset = 2;
        int readLength = 3;
        int discount = 1;

        Discount dis = new Discount();
        int[] price = {50, 100, 20, 66, 16};

        int[] amountWithDiscount = dis.discount(price, discount, offset, readLength);
        System.out.println(Arrays.toString(amountWithDiscount));
    }
}

