import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad1 {

    public static void imiona(){
        System.out.println("Podaj imiona do listy:\n aby zakończyć wpisz '-'");
    Scanner scanner=new Scanner(System.in);
    String imie=" ";
        List<String> ListaImion = new ArrayList<>();
    while(!imie.equals("-")) {

        imie = scanner.nextLine();
        if (!imie.equals("-")) ListaImion.add(imie);
    }
        System.out.println(ListaImion);
    }
}
