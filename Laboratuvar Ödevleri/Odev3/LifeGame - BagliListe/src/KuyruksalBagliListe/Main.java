package KuyruksalBagliListe;

public class Main {
    public static void main(String[] args) {
        Eleman kisi1 = new Eleman("Fatih", "Kocamaz",112, 2011);
        Eleman kisi2 = new Eleman("Fatih", "Talu",155,  2009);
        Eleman kisi3 = new Eleman("AA", "Aydın",187, 2013);
        Eleman kisi4 = new Eleman("Cengiz", "Hark",171, 2015);
        Eleman kisi5 = new Eleman("Erhan", "Akkaya", 123, 2014);

        KuyruksalBagliListe kuyruksalBagliListe = new KuyruksalBagliListe();
        kuyruksalBagliListe.ekle(kisi1);
        kuyruksalBagliListe.ekle(kisi2);
        kuyruksalBagliListe.ekle(kisi3);
        kuyruksalBagliListe.ekle(kisi4);
        kuyruksalBagliListe.ekle(kisi5);
        System.out.println(kuyruksalBagliListe.getElemanSayisi());

        kuyruksalBagliListe.listeYazdir();

        kuyruksalBagliListe.sil();
        kuyruksalBagliListe.sil();
        System.out.println(kuyruksalBagliListe.getElemanSayisi());

        kuyruksalBagliListe.listeYazdir();

        kuyruksalBagliListe.ekle(kisi1);
        kuyruksalBagliListe.ekle(kisi2);
        System.out.println(kuyruksalBagliListe.getElemanSayisi());

        kuyruksalBagliListe.listeYazdir();
    }
}
