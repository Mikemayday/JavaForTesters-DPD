package a_introduction;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(maxFrom(100.4, 20, 35));
    }

    public static double maxFrom(double a, double b, double c) {
        double currentmax;
    if (a>b) currentmax = a;
        else currentmax = b;
        if (currentmax<c) currentmax=c;
        return currentmax;
        }

    }
