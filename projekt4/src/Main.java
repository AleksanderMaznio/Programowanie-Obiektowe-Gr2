import osoby.Osoba;
import osoby.Student;

public class Main {
    public static void main(String[] args) {
            Osoba obiekt1= new Osoba("Aleksander","Maźnio",21);
            Osoba obiekt2=new Osoba("Gabriel",21);
        Student student1=new Student("Aleksander","Maźnio",137137,"IiE",1);
        Student student2=new Student("Michał","Czaha",2137420);
        Student student3=new Student("Bartosz","Bieszczak");
        Student student4=new Student(1223456,1);
        student1.wypisz_s();
        student2.wypisz_s();
        student3.wypisz_s();
        student4.wypisz_s();
    }

}