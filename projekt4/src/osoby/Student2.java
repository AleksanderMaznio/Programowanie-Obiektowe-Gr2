package osoby;

import java.util.Scanner;

public class Student2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj imie: \n");
        String imie=input.nextLine();
        System.out.println("Podaj nazwisko: \n");
        String nazwisko=input.nextLine();
        System.out.println("Podaj nazwę kierunku: \n");
        String nazwa=input.nextLine();
        System.out.println("Podaj nr_albumu: \n");
        int nr_albumu=input.nextInt();
        System.out.println("Podaj Rok studiów: \n");
        int rok=input.nextInt();

        Student Student1= new Student(imie,nazwisko,nr_albumu,nazwa,rok);
        Student1.wypisz_s();

    }
}
