import poo.entities.Account;
import poo.entities.CurrencyConverter;

void main() {
    Locale.setDefault(Locale.US);
//    exercise1();
//    exercise2();

}

public void exercise1(){
    Scanner input = new Scanner(System.in);
    System.out.println("qual o valor do dolar atual?");
    double price = input.nextDouble();

    System.out.println("quantos dolares voce quer?");
    double dollar = input.nextDouble();

    System.out.printf("o valor a ser pago é %.2f" , CurrencyConverter.dollarToReais(price,dollar));

}

public void exercise2(){
    Scanner input = new Scanner(System.in);
    System.out.println("Qual o numero da conta?");
    int accountNumber = input.nextInt();
    input.nextLine();
    System.out.println("Qual o proprietario da conta?");
    String accountOwner = input.nextLine();

    Account account = new Account(accountNumber,accountOwner);

    System.out.println("Qual valor deseja depositar?");
    double deposit = input.nextDouble();
    account.deposit(deposit);

    System.out.println(account.getAccount());

    System.out.println("Qual valor deseja sacar?");
    double withDraw = input.nextDouble();
    account.withDraw(withDraw);

    System.out.println(account.getAccount());


}