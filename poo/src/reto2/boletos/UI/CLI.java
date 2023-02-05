package reto2.boletos.UI;
import reto2.boletos.proces.Boleto;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        salida:
        do{
            System.out.println("elige un boleto a comprar");
            System.out.println("N) Niño: $70");
            System.out.printf(" A) adulto: $100");
            System.out.printf(" INAPAM) adulto: $50");
            System.out.printf(" B) abuelito sin credencial: $70");
            System.out.println("S) salir");

            String tipoBoleto="";
            Scanner scanner = new Scanner(System.in);
            tipoBoleto=scanner.nextLine();
            if(tipoBoleto.equals("s")){
                break salida;
            }
            int child =0;
            switch (tipoBoleto){
                case "A": child++;

                    break;
                case "N": child++;

                    break;
                case "INAPAM": child++;

                    break;
                case "B": child++;

                    break;
            }


            while (true);
            Boleto.calcularCosto(child,0,0,0);

        }

    }
}