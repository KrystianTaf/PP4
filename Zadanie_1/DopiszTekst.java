import java.io.*;

public class DopiszTekst {

    public static void dopiszDoPliku(String tekst) {

        File plik = new File("tekst.txt");
        try {
            FileWriter writer = new FileWriter("tekst.txt", true);
            writer.write(tekst + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        dopiszDoPliku("abcd");
    }
}