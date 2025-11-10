//LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;
import java.util.Random;

// Classe principale, con metodo main
class Esercizio {

    public static Scanner in = new Scanner( System.in );

    public static void assegnaMatrice( int[][] M, int RIGHE, int COLONNE, int valore ) {
    for (int i=0; i <= RIGHE-1; i=i+1 ) {
        for (int j=0; j <= COLONNE-1; j=j+1) {
            M[i][j] = valore;
        }
    }
}

    public static void azzera( int[][] M, int RIGHE, int COLONNE, int valore ) {
    for (int i=0; i <= RIGHE-1; i=i+1 ) {
        for (int j=0; j <= COLONNE-1; j=j+1) {
            M[i][j] = 0;
        }
    }
}

    public static void riempiCasuale( int[][] M, int RIGHE, int COLONNE, int valMin, int valMax) {
    Random rand = new Random();
    for (int i=0; i <= RIGHE-1; i=i+1 ) {
        for (int j=0; j <= COLONNE-1; j=j+1) {
            M[i][j] = valMin + rand.nextInt((valMax+1)-valMin);
        }
    }
}

    public static void main(String args[]) {
int[][] matR = new int[RIGHE][COLONNE];
  int valMin = 10;
  int valMax = RIGHE*COLONNE*10;
  riempiCasuale(matR, RIGHE, COLONNE, valMin, valMax);
  System.out.println("Contenuto della matrice matR:");
  UtilsMatrice.visualizza(matR);    
    }
}

