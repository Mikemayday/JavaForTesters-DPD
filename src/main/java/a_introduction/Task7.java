package a_introduction;

public class Task7 {
    public static void main(String[] args) {
int day = 6;
String dayname;

switch (day) {
    case 1:
        dayname = "Monday";
        break;
    case 2:
        dayname = "Tuesday";
        break;
    case 3:
        dayname = "Wednesday";
        break;
    case 4:
        dayname = "Thursday";
        break;
    case 5:
        dayname = "Friday";
        break;
    case 6:
        dayname = "Saturday";
        break;
    default:
        dayname = "Sunday";
        break;
}

        System.out.println("Today is "+ dayname);
    }
}
