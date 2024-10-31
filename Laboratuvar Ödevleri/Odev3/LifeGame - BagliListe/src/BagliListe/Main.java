package BagliListe;

public class Main {
    public static void main(String[] args) {
        Eleman kisi1 = new Eleman("Fatih", "Kocamaz",112, 2011);
        Eleman kisi2 = new Eleman("Fatih", "Talu",155,  2009);
        Eleman kisi3 = new Eleman("AA", "Aydın",187, 2013);

        BagliListe bagliListe = new BagliListe();

        bagliListe.sonaEkle(kisi1);
        bagliListe.sonaEkle(kisi2);
        bagliListe.sonaEkle(kisi3);

        bagliListe.listeYazdir();

        bagliListe.basSil();
        bagliListe.listeYazdir();
        bagliListe.basaEkle(kisi1);
        bagliListe.listeYazdir();
    }
}
