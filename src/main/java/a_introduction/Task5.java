package a_introduction;

public class Task5 {
    public static void main(String[] args) {
        String imie = "Michał";
        int wiek = 23;
        String pelnoletni;

        if (wiek > 17) {
            pelnoletni = "jest pełnoletni";
        }
        else pelnoletni = "nie jest pełnoletni";

       System.out.println(imie + ", ma " + wiek + " lat i " + pelnoletni);
    }
}
