package KuyruksalBagliListe;

public class KuyruksalBagliListe {
    private Eleman bas;
    private Eleman son;
    private int elemanSayisi;

    KuyruksalBagliListe() {
        bas = null;
        son = null;
        elemanSayisi = 0;
    }

    void ekle(Eleman yeni) {
        if (bas == null) {
            bas = yeni;
        }
        else {
            son.sonraki = yeni;
        }
        son = yeni;
        elemanSayisi++;
    }

    void sil() {
        if (bas == null) {
            System.out.println("Liste Boş");
        }
        else {
            Eleman tmp;
            tmp = bas;
            bas = bas.sonraki;
            tmp.sonraki = null;

            elemanSayisi--;
        }
    }

    void listeYazdir() {
        Eleman temp = bas;

        while (temp != null) {
            System.out.println(temp.ad + " " + temp.soyad + " " + temp.telno + " " + temp.dt);
            temp = temp.sonraki;
        }
        System.out.println("-----------------------------");

    }

    int getElemanSayisi() {
        return elemanSayisi;
    }
}
