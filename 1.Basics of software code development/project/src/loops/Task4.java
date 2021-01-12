
//4. Составить программу нахождения произведения квадратов первых двухсот чисел.

package loops;

import java.math.BigInteger;

public class Task4 {
    public static void main(final String[] args) {

        BigInteger result = BigInteger.valueOf(1);
        for (int index = 2; index <= 200; index++) {
            result = result.multiply(BigInteger.valueOf((long) index * index));
        }
        System.out.println(result);
    }
}


