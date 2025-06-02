import java.util.*;

public class Zad2 {
    public static void pary(){
        System.out.println("Podaj imiona par: \n aby zakonczyć wpisz '-'");
        Scanner scanner=new Scanner(System.in);
        String imie1=" ";
        String imie2=" ";
        List<String> ListaImion1 = new ArrayList<>();
        List<String>ListaImion2=new ArrayList<>();
        while(!imie1.equals("-") || !imie2.equals("-")) {

            imie1 = scanner.nextLine();
            if (!imie1.equals("-")) ListaImion1.add(imie1);
            imie2=scanner.nextLine();
            if (!imie2.equals("-")) ListaImion2.add(imie2);
        }

        System.out.println(ListaImion1);
        System.out.println(ListaImion2);
        System.out.println("Podaj imie z listy");
        String test;
        test=scanner.nextLine();
        System.out.println(ListaImion1.indexOf(test));
        int index=ListaImion1.indexOf(test);
        System.out.println(ListaImion2.get(index));
    }
}

