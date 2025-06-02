import java.util.ArrayList;
import java.util.List;

public class Zad3 {
    private final Number id;
    private final String imie;
    private final int wiek;

    public Zad3(int id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString(){
        return "ID: " + this.id +
                "\nImie: " + this.imie +
                "\nWiek: " + this.wiek;
    }

    public boolean equals(Zad3 object){
        return this.id.equals(object.id) && this.wiek == object.wiek && this.imie.equals(object.imie);
    }

    @Override
    public int hashCode(){
        return this.id.hashCode();
    }

    public static void main(String[] args) {
        List<Zad3> lista = new ArrayList<>();
        Zad3 a = new Zad3(113123, "A", 18);
        Zad3 b = new Zad3(2412312, "D", 20);
        System.out.println(a.toString());
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
    }
}
