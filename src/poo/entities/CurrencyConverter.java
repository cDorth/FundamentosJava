package poo.entities;

public class CurrencyConverter {

    public static double dollarToReais(double price, double dollar){
         double total = price * dollar;
         double taxa = 0.06 * total;
         return total + taxa;
    }

}
