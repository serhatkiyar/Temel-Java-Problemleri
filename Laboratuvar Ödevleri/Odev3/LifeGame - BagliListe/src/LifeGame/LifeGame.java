package LifeGame;

public class LifeGame {
    final int habitatSutun = 19;
    final int habitatSatir = 19;

    int[][] hucreHabitat;
    int[][] hucreHabitatTmp;
    int[] pulsarColumn;
    int[] pulsarSatir;
    int[] pSatir;

    public LifeGame() {
        pSatir = new int[] {3, 8, 10, 15};
        pulsarSatir = new int[] {0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0};
        pulsarColumn = new int[] {0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0};

        hucreHabitat = new int[habitatSatir][habitatSutun];
        hucreHabitatTmp = new int[habitatSatir][habitatSutun];

        for (int i = 0; i < habitatSatir; i++) {
            for (int j = 0; j < habitatSutun; j++) {

                hucreHabitat[i][j] = 0;
                hucreHabitatTmp[i][j] = 0;
            }
        }

        for (int row : pSatir) {
            for (int column = 0; column < habitatSutun; column++) {
                hucreHabitat[row][column] = pulsarSatir[column];
            }
        }

        for (int column : pSatir) {
            for (int row = 0; row < habitatSatir; row++) {
                hucreHabitat[row][column] = pulsarColumn[row];
            }
        }

        this.copyHabitat(hucreHabitatTmp, hucreHabitat);


    }

    public void drawHabitat(){
        for (int row = 0; row < habitatSatir; row++) {
            for (int column = 0; column < habitatSutun; column++) {
                System.out.print((hucreHabitat[row][column] == 0) ? "-" : "#" );
            }
            System.out.println();
        }

    }

    public int komsuCanliSayisi(int row, int column){
        int cks = 0;


        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {

                if (i == 0 && j == 0) {
                    continue;
                }

                if ((0 < (row + i)) && ((row + i) < (habitatSatir - 1)) && (0 < (column + j)) && ((column + j) < (habitatSutun - 1))) {
                    if (hucreHabitat[row + i][column + j] == 1) {
                        cks++;
                    }
                }
            }
        }
        return cks;
    }

    public void newHabitatRule(){
        for(int row = 1; row < habitatSatir - 1; row++){
            for (int column = 1; column < habitatSutun - 1; column++){
                int cks = this.komsuCanliSayisi(row, column);

                boolean state1 = (cks < 2);
                boolean state2 = (cks > 3);
                boolean state3 = (cks == 3);


                if(state1 || state2) {
                    hucreHabitatTmp[row][column] = 0;
                }

                if (state3 && !(hucreHabitat[row][column] == 1)) {
                    hucreHabitatTmp[row][column] = 1;
                }
            }
        }

        this.copyHabitat(hucreHabitat, hucreHabitatTmp);

    }

    public void copyHabitat(int[][] habibat1, int[][] habibat2){
        for (int i = 1; i < habitatSatir - 1; i++) {
            for (int j = 1; j < habitatSutun - 1; j++) {
                habibat1[i][j] = habibat2[i][j];
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {

        LifeGame lg = new LifeGame();
        for (int i = 0; i < 20; i++) {
            lg.drawHabitat();
            lg.newHabitatRule();
            System.out.println();
            Thread.sleep(1500);

        }
    }
}
