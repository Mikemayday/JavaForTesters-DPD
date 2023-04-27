package a_introduction;

public class Task8 {

    public static void main(String[] args) {
        double finalprice = calculatePrice(16, 0.23);
        System.out.println(finalprice);
    }


        public static double calculatePrice(int price, double discount) {
        double finalprice = price*discount;
        return finalprice;

        }
    }


