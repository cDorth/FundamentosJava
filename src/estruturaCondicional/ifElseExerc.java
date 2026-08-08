void main() {
//     exercise1();
//    exercise2();
//    exercise3();
//    exercise4();
//    exercise5();

}

public void exercise1(){
    Scanner input = new Scanner(System.in);

    System.out.println("digite um numero");
    int num = input.nextInt();

    if (num >= 0 ){
        System.out.println("numero positivo");
    }else {
        System.out.println("numero negativo");
    }
}

public void exercise2(){
    Scanner input = new Scanner(System.in);

    System.out.println("digite um numero");
    int num = input.nextInt();

    if ((num%2) == 0 ){
        System.out.println("numero par");
    }else {
        System.out.println("numero impar");
    }
}
public void exercise3(){
    Scanner input = new Scanner(System.in);

    System.out.println("digite um numero");
    int num = input.nextInt();

    System.out.println("digite outro numero");
    int num2 = input.nextInt();

    if((Math.max(num,num2)%Math.min(num,num2)) == 0 ){
        System.out.println("numero divisivel");
    }else{
        System.out.println("numero não divisivel");
    }

//    if ((num%num2) == 0 ){
//        System.out.println("numero divisivel");
//
//    } else if ((num2%num) == 0 ){
//        System.out.println("numero divisivel");
//
//    }else {
//        System.out.println("numero não divisivel");
//    }
}
public void exercise4(){
    Scanner input = new Scanner(System.in);

    System.out.println("digite hora de inicio");
    int num = input.nextInt();

    System.out.println("digite hora de termino");
    int num2 = input.nextInt();
    int horario;
    if(num >= num2){
         horario =  24 - (num - num2) ;

    }else {
         horario = num2 - num;

    }
    System.out.printf("durou %d horas", horario);

}
public void exercise5(){
    Scanner input = new Scanner(System.in);


    Double[] precos = {4.00,4.50,5.00,2.00,1.50};

    System.out.println("digite o item e a quantidade");
    int num = input.nextInt();
    int qtd = input.nextInt();

   double valor = precos[num - 1] * qtd;
    System.out.printf("valor total é  %.2f R$", valor);

}


