package a_introduction;

import static java.lang.Math.round;

public class Task11 {
    public static void main(String[] args) {
        boolean test3 = validateSumWithDiscount(10, 10, 0.15, 85);
        System.out.println(test3);
    }

    public static boolean validateSumWithDiscount(int pcs, double price, double discount, double expectedSum) {
        double finalsum = (pcs * price) - (pcs * price * discount);
        round(expectedSum);
        round(finalsum);
        boolean check = false;
        if (finalsum==expectedSum) check = true;
        return check;
    }
}
