void main() {
//    exercise1();
    exercise2();
}
public void exercise1(){
    Scanner input = new Scanner(System.in);
    System.out.println("digite uma senha: ");
    int senha = input.nextInt();

    while(senha != 2007){
        System.out.println("senha errada, digite outra senha");
        senha = input.nextInt();
    }
    System.out.println("senha correta!");
}

public void exercise2(){
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();

    while (x != 0 && y != 0) {
        if (x > 0 && y > 0) {
            System.out.println("primeiro");
        }
        else if (x < 0 && y > 0) {
            System.out.println("segundo");
        }
        else if (x < 0 && y < 0) {
            System.out.println("terceiro");
        }
        else {
            System.out.println("quarto");
        }
        x = sc.nextInt();
        y = sc.nextInt();
    }
}
