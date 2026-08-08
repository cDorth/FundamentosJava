import poo.entities.CurrencyConverter;

void main() {
    Locale.setDefault(Locale.US);
    exercise1();
}

public void exercise1(){
    Scanner input = new Scanner(System.in);
    System.out.println("qual o valor do dolar atual?");
    double price = input.nextDouble();

    System.out.println("quantos dolares voce quer?");
    double dollar = input.nextDouble();

    System.out.printf("o valor a ser pago é %.2f" , CurrencyConverter.dollarToReais(price,dollar));

}