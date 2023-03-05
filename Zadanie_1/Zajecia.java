import java.util.ArrayList;

public class Zajecia {

    private ArrayList<String> studenci = new ArrayList<String>();
    public void zapiszStudenta(String idStudenta) {
        if (studenci.size() >= 10) {
            System.out.println("Osiągnięto limit studentów na zajęciach");
            System.out.println("Student " + idStudenta + " nie został zapisany");
        }
        else {
            studenci.add(idStudenta);
            System.out.println("Zapisano studenta:" + idStudenta);
        }
    }
    public static void main(String[] args) {
        Zajecia z1 = new Zajecia();
        z1.zapiszStudenta("157656");
        z1.zapiszStudenta("129877");
        z1.zapiszStudenta("546879");
        z1.zapiszStudenta("567477");
        z1.zapiszStudenta("327690");
        z1.zapiszStudenta("988654");
        z1.zapiszStudenta("111111");
        z1.zapiszStudenta("624777");
        z1.zapiszStudenta("274896");
        z1.zapiszStudenta("214769");
        z1.zapiszStudenta("129380");
    
    }

}