package YiginsalBagliListe;

public class Eleman {
    Eleman sonraki = null;
    String ad;
    String soyad;
    int telno;
    int dt;


    public Eleman(String ad, String soyad, int telno, int dt) {
        this.ad = ad;
        this.soyad = soyad;
        this.telno = telno;
        this.dt = dt;


    }
}