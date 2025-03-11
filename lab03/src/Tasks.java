import java.util.Random;
public class Tasks {
    public static void Zadanie1(){
        float suma=0;
        float srednia;
        int [] tab=new int[5];
        int[] tab_e=new int[5];
        Random rand= new Random();
        System.out.println("Pętla for\n");
        for (int i=0;i<tab.length;i++){
            tab[i]=rand.nextInt(10);
            System.out.println("element tablicy: "+tab[i]);
            suma=suma+tab[i];
        }
        System.out.println("Suma elementów tablicy wynosi: "+suma);
        srednia=suma/tab.length;
        System.out.println("średnia elementow wynosi: "+srednia);
        suma=0;
        srednia=0;
        System.out.println("\nPętla for-each\n");
        for (int item : tab_e){
            tab_e[item]=rand.nextInt(10);
            System.out.println("element tablicy: "+tab_e[item]);
            suma=suma+tab_e[item];
        }
        System.out.println("Suma elementów tablicy wynosi: "+suma);
        srednia=suma/tab.length;
        System.out.println("średnia elementow wynosi: "+srednia);
    }




    public static void Zadanie2(){
        int [] tab_p={1,2,3,4,5,6,7,8};
        int [] tab_n={1,2,3,4,5,6,7};
        System.out.println("Wypisanie elementów z tablicy z parzystą liczbą elementów:\n");
        for (int i=0;i<=tab_p.length-1;){
            if (i%2==0){
                System.out.println("element tablicy "+i+" wynosi: "+tab_p[i]);
            }
            i++;
        }
        System.out.println("\nWypisanie elementów z tablicy z nieparzysta liczbą elementów:\n");
        for (int i=0;i<=tab_n.length-1;){
            if (i%2==0){
                System.out.println("element tablicy "+i+" wynosi: "+tab_n[i]);
            }
            i++;
        }
    }




    public static void Zadanie3(){
        String[] litery={"a","b","c","d"};

        for (String item :  litery){
            System.out.println(item.toUpperCase());
        }
    }
}
