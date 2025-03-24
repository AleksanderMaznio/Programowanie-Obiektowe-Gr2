package zad4;

import osoby.Student;

import java.util.Scanner;

public class klasa {
    public static void main(String[] args) {
        Student[] w_stud=new Student[100];
        Scanner input=new Scanner(System.in);
        System.out.println("Co chcesz robić?\n" +
                "1.wypełnij tablice pustką\n" +
                "2.wprowadz nowego studenta\n" +
                "3.edytuj studenta\n" +
                "4.wyświetl studenta\n" +
                "5.wyświetl cała liste\n" +
                "6.wyświetl zakres\n");
        int wybor=input.nextInt();
        switch (wybor){
            case 1:
                wypelnij(w_stud);
                break;
            case 2:
                wprowadz(w_stud);
                break;
            case 3:
                edytuj(w_stud);
                break;
            case 4:
                odczytaj(w_stud);
                break;
            case 5:
                w_wszystko(w_stud);
                break;
            case 6:
                zakres(w_stud);
                break;

        }

    }

    public static void wypelnij(Student[] tablica){
        for (int i=0;i<tablica.length;i++){
            tablica[i]=new Student(" "," ",0," ",0);
        }
    }
    public static void wprowadz(Student[] tablica){
        Scanner input=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        System.out.println("Podaj numer studenta do wprowadzenia:\n");
        int nr_stud= input.nextInt();

        System.out.println("Podaj imie: \n");
        String imie=input2.nextLine();
        System.out.println("Podaj nazwisko: \n");
        String nazwisko=input2.nextLine();
        System.out.println("Podaj nazwę kierunku: \n");
        String nazwa=input2.nextLine();
        System.out.println("Podaj nr_albumu: \n");
        int nr_albumu=input.nextInt();
        System.out.println("Podaj Rok studiów: \n");
        int rok=input.nextInt();

        tablica[nr_stud]= new Student(imie,nazwisko,nr_albumu,nazwa,rok);
        System.out.println(tablica[nr_stud]);
    }
    public static void edytuj(Student[] tablica){
        Scanner input=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        System.out.println("Podaj numer studenta do edytowania:\n");
        int nr_stud= input.nextInt();

        System.out.println("Podaj imie: \n");
        String imie=input2.nextLine();
        System.out.println("Podaj nazwisko: \n");
        String nazwisko=input2.nextLine();
        System.out.println("Podaj nazwę kierunku: \n");
        String nazwa=input2.nextLine();
        System.out.println("Podaj nr_albumu: \n");
        int nr_albumu=input.nextInt();
        System.out.println("Podaj Rok studiów: \n");
        int rok=input.nextInt();

        tablica[nr_stud]= new Student(imie,nazwisko,nr_albumu,nazwa,rok);
        System.out.println(tablica[nr_stud]);
    }
    public static void odczytaj(Student[] tablica){
        Scanner input=new Scanner(System.in);
        int indeks= input.nextInt();
        System.out.println(tablica[indeks]);
    }
    public static void w_wszystko(Student[] tablica){
        for (int i=0;i<=tablica.length;i++){
            System.out.println(tablica[i]);
        }
    }
    public static void zakres(Student[] tablica){
        System.out.println("Podaj początek zakresu: \n");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println("Podaj koniec zakresu: \n");
        int b= input.nextInt();
        for (int i=a;i<=b;i++){
            System.out.println(tablica[i]);
        }
    }
}
