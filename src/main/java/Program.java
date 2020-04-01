import java.io.IOException;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws IOException {
        int offset = 1;
        int readLength = 3;
        int discount = 50;

        int[] price = {5,100,20,66,16};
        
        Discount dis = new Discount();

        int[] amountWithDiscount = dis.discount(price, discount, offset, readLength);
        System.out.println(Arrays.toString(amountWithDiscount));
    }
}

