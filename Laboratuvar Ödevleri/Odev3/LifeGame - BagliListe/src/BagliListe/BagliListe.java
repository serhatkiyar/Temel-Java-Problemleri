package BagliListe;

public class BagliListe {
    Eleman bas;
    Eleman son;

    BagliListe() {
        bas = null;
        son = null;
    }

    void basaEkle(Eleman yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
            return;
        }

        yeni.sonraki = bas;
        bas = yeni;
    }

    void sonaEkle(Eleman yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
            return;
        }

        son.sonraki = yeni;
        son = yeni;
    }

    void basSil() {
        if (bas == null) {
            System.out.println("Liste Boş");
            return;
        }

        Eleman tmp;
        tmp = bas;
        bas = bas.sonraki;
        tmp.sonraki = null;
    }

    void sonSil() {
        if (bas == null) {
            System.out.println("Liste Boş");
        }

        // ---------
    }

    void listeYazdir() {
        Eleman temp = bas;

        while (temp != null) {
            System.out.println(temp.ad + " " + temp.soyad + " " + temp.telno + " " + temp.dt);
            temp = temp.sonraki;
        }
        System.out.println("-----------------------------");

    }
}