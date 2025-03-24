package osoby;

public class Student {
    String imie=" ";
    String nazwisko=" ";
    int nr_indeksu=0;
    String Nazwa="";
    int rok=0;
    public Student(String imie,String nazwisko,int nr_indeksu,String Nazwa, int rok){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.nr_indeksu=nr_indeksu;
        this.Nazwa=Nazwa;
        this.rok=rok;
    }
    public Student(String imie,String nazwisko,int nr_indeksu){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.nr_indeksu=nr_indeksu;
    }
    public Student(String imie,String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
    }
    public Student(int nr_indeksu,int rok){
        this.nr_indeksu=nr_indeksu;
        this.rok=rok;
    }
    public void wypisz_s(){
        System.out.println("Imię: "+imie+"\n"+"Nazwisko: "+nazwisko+"\n"+"Nr_indeksu: "+nr_indeksu+"\n"+"Nazwa kierunku: "+Nazwa+"\n"+"Rok: "+rok);
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public int getNr_indeksu() {
        return nr_indeksu;
    }
    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }
    public String getNazwa(){
        return Nazwa;
    }
    public void setNazwa(String Nazwa){
        this.Nazwa=Nazwa;
    }
    public int getRok(){
        return rok;
    }
    public void setRok(int rok){
        this.rok=rok;
    }
    @Override
    public String toString(){
        return imie+" "+nazwisko+" "+nr_indeksu+" "+Nazwa+" "+rok;
    }
}

