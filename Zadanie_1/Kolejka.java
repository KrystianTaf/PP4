import java.util.LinkedList;
public class Kolejka {

    private LinkedList<String> listaZakupy = new LinkedList<String>();

    public void dodajProdukt(String produkt) {
        listaZakupy.addLast(produkt);
    }

    public void skreslProdukt() {
        listaZakupy.removeFirst();
    }

    public String pokazListe() {
        StringBuilder sb = new StringBuilder();
        for (String produkt : listaZakupy) {
            sb.append(produkt).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Kolejka k1 = new Kolejka();
        k1.dodajProdukt("ser");
        k1.dodajProdukt("mleko");
        k1.dodajProdukt("chleb");
        System.out.println(k1.pokazListe());
        k1.skreslProdukt();
        System.out.println(k1.pokazListe());
    }
        
    
}