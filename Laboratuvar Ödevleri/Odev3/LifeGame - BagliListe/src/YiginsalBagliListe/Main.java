package YiginsalBagliListe;

public class Main {
    public static void main(String[] args) {
        Eleman kisi1 = new Eleman("Fatih", "Kocamaz",112, 2011);
        Eleman kisi2 = new Eleman("Fatih", "Talu",155,  2009);
        Eleman kisi3 = new Eleman("AA", "Aydın",187, 2013);
        Eleman kisi4 = new Eleman("Cengiz", "Hark",171, 2015);
        Eleman kisi5 = new Eleman("Erhan", "Akkaya", 123, 2014);

        YiginsalBagliListe yiginsalBagliListe = new YiginsalBagliListe();
        yiginsalBagliListe.ekle(kisi1);
        yiginsalBagliListe.ekle(kisi2);
        yiginsalBagliListe.ekle(kisi3);
        yiginsalBagliListe.ekle(kisi4);
        yiginsalBagliListe.ekle(kisi5);
        System.out.println(yiginsalBagliListe.getElemanSayisi());

        yiginsalBagliListe.listeYazdir();

        yiginsalBagliListe.sil();
        yiginsalBagliListe.sil();
        System.out.println(yiginsalBagliListe.getElemanSayisi());

        yiginsalBagliListe.listeYazdir();

        yiginsalBagliListe.ekle(kisi5);
        yiginsalBagliListe.ekle(kisi4);
        System.out.println(yiginsalBagliListe.getElemanSayisi());


        yiginsalBagliListe.listeYazdir();
    }
}
