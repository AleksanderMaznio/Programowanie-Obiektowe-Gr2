import java.util.Scanner;
import java.util.Random;

public class Task {
    public static void Zadanie1(){
        int l=0;
        int n;
        int k;
        double srednia;
        double suma=0;
        System.out.println("Podaj liuczbe n studentów: \n");
        Scanner input = new Scanner(System.in);
        n= input.nextInt();
        if (n<0){
            System.out.println("zła liczba studentów");
        }else{
            while (l<n){
                System.out.println("Podaj ocenę: ");
                k= input.nextInt();
                if (k>=0&&k<=10){
                    suma=suma+k;
                }else {
                    System.out.println("Zła liczba\n");
                    l--;
                }
                l++;
            }
        }
        srednia=suma/n;
        System.out.println("Średnia wynosi: "+srednia);
    }
    public static void Zadanie2(){
        int suma_d=0,suma_u=0;
        int ile_d=0,ile_u=0;
        int l;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczby do sumowania\n");
        for (int i=0;i<4;i++){
            l=input.nextInt();
            if(l<0){
                suma_u=suma_u+l;
                ile_u=ile_u+1;
            }else {
                suma_d=suma_d+l;
                ile_d=ile_d+1;
            }
        }
        System.out.println("Suma liczb dodatnich: "+suma_d);
        System.out.println("Suma liczb ujemnych: "+suma_u);
        System.out.println("liczba liczb dodatnich: "+ile_d);
        System.out.println("liczba liczb ujemnych: "+ile_u);
    }
    public static void Zadanie3(){
        int n;
        int l;
        int suma=0;
        System.out.println("podaj n:\n");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        while (n!=0){
            System.out.println("Podaj liczbę: \n");
            l=input.nextInt();
            if (l%2==0){
                suma=suma+l;
            }
            n--;
        }
        System.out.println("Suma liczb parzystych wynosi: "+suma);
    }
    public static void Zadanie4(){
        int n;
        int l;
        int x=-10;
        int y=45;

        int suma=0;
        System.out.println("podaj n:\n");
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        n=input.nextInt();
        while (n!=0){
            l=rand.nextInt(y-x+1)+x;
            System.out.println(+l);
            if (l%2==0){
                suma=suma+l;
            }
            n--;
        }
        System.out.println("Suma liczb parzystych wynosi: "+suma);
    }
        public static void Zadanie5(){
        Scanner scan = new Scanner(System.in);
           String p;
            String b="";
            char znak;
            System.out.println("Podaj wyraz: \n");
            p= scan.nextLine();
            for(int i=p.length()-1; i>=0; i--){
                znak=p.charAt(i);
                if (znak >= 65 && znak <= 90) znak += 32;
                b=b+znak;

            }
        if(p.equalsIgnoreCase(b)){
            System.out.println("Palindrom");
        }else {
            System.out.println("nie palindrom");
        }
        }
}


