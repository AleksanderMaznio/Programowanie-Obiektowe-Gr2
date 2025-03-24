package osoby;

public class Osoba {
    String imie=" ";
    String nazwisko=" ";
    int wiek=0;

    public Osoba(String imie,String nazwisko, int wiek){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
    }
    public Osoba(String imie,int wiek){
        this.imie=imie;
        this.wiek=wiek;
    }
    public Osoba(){
        this.imie="";
        this.nazwisko="";
        this.wiek=0;
    }
    public void wypisz(){
        System.out.println("Imię i nazwsko: "+imie+" "+nazwisko+"\n"+"Wiek: "+wiek);
    }

}



