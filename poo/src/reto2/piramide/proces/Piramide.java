package reto2.piramide.proces;
import reto2.piramide.ui.CLI;
import reto2.piramide.Main;
public class Piramide {
public static void printPyramid(int numRenglon){
    System.out.println();
    for (int i =0;i<10;i++){
        for (int j=0;j<i+1;j++){
            if (i>5 && i<7){
                continue;
            }
            System.out.println("*");
        }
        System.out.println();
    }
}
}
