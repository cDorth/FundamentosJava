void main() {
//    exercise1();
    exercise2();
}

public void exercise1(){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int num = input.nextInt();

    if (num>=1 && num<=1000){
        int i;

        for (i=0;i < num; i++){
            if ((i%2) == 1){
                System.out.println(i);
            }
        }
    }

}

public void exercise2(){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int in = 0;
    int out = 0;

    for (int i=0; i<n; i++) {
        int x = sc.nextInt();
        if (x >= 10 && x <= 20) {
            in = in + 1;
        }
        else {
            out = out + 1;
        }
    }

    System.out.println(in + " in");
    System.out.println(out + " out");

}
public void exercise3(){

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i=0; i<n; i++) {

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

        System.out.printf("%.1f%n", media);
    }

}

