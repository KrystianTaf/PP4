public class Cena {
    public static double obliczCeneNetto(double cenaBrutto, double stawkaPodatku) {
        return cenaBrutto / (1 + stawkaPodatku);
    }

    public static void main(String[] args) {
        System.out.println(Cena.obliczCeneNetto(100, 0.17));
    }
}