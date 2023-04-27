package a_introduction;

public class Task5 {
    public static void main(String[] args) {
        String imie = "Michał";
        int wiek = 15;
        String pelnoletni = "";
        if (wiek < 18) pelnoletni = "nie";

       System.out.println(imie + ", ma " + wiek + " lat i " + pelnoletni + " jest pełnoletni");
    }
}
