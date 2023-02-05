package reto2.boletos.proces;

public class Boleto {

    public static double PRECIO_CHILD = 70;
    public static double PRECIO_ADULT = 100;
    public static double PRECIO_SENIOR = 50;
    public static double PRECIO_SENIORsn = 70;
    public static double calcularCosto(int numChild,int numAdult, int numSenior , int numSENIORsn ){
        return (numChild * PRECIO_CHILD) + (numAdult * PRECIO_ADULT) + (numSenior * PRECIO_SENIOR)+(numSENIORsn * PRECIO_SENIORsn);

    }
}