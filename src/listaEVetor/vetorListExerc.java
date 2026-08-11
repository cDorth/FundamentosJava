import listaEVetor.entities.Employee;
import listaEVetor.entities.Room;

void main() {
    Locale.setDefault(Locale.US);

//    ------------------------- Vetor
//    exercise1();
//    exercise2();
//    exercise3();
//    exercise4();
//    exercise5();
//    exercise6();
//    exercise7();
//    exercise8();
//    ------------------------estrutura for each
//    forEachExemplo();
//    ------------------------ List
//    listExemplo();
//    desafio1();
//    ------------------------ Matrix
    exercMatrix();

}

public void exercise1() {
    Scanner input = new Scanner(System.in);
    System.out.println("digite quantas alturas vão ser analisadas");
    int n = input.nextInt();

    double[] vect = new double[n];

    for (int i = 0; i < n; i++) {
        System.out.printf("digite a %d° altura %n",(i+1));
        vect[i] = input.nextDouble();
    }
    double sum = 0.0;

    for (int i = 0;i<n;i++ ) {
        sum +=vect[i];
    }
    double avg = sum/n;
    System.out.println("media das alturas é "+ avg);
}
// é possivel instanciar um vetor em uma classe, sintaxe similar a Account[] contas = new Account[n];
// formando um vetor que em suas posições guarda objetos


public void exercise2(){
    Scanner input = new Scanner(System.in);
    System.out.println("quantos numeros quer digitar?");
    int n = input.nextInt();
    System.out.println("digite os numeros:");
    int[] numero = new int[n];

    for (int i = 0;i < numero.length;i++){
        numero[i] = input.nextInt();
    }
    System.out.println("estes são os numeros impares:");
    for (int x = 0;x <numero.length;x ++){
        if (numero[x] < 0){
            System.out.println(numero[x]);

        }
    }

}


public void exercise3(){
    Scanner input = new Scanner(System.in);
    System.out.println("quantos numeros quer digitar?");
    int n = input.nextInt();
    System.out.println("digite os numeros:");
    double[] numero = new double[n];

    for (int i = 0;i < numero.length;i++){
        numero[i] = input.nextInt();
    }
    double sum = 0;
    System.out.println("valores:");
    for (int x = 0;x <numero.length;x ++){
        System.out.println(numero[x]);
        sum += numero[x];
    }
    System.out.println("soma dos valores = " + sum);
    System.out.println("media dos valores = " + (sum/numero.length));

}

public void exercise4(){
    Scanner input = new Scanner(System.in);
    System.out.println("quantas pessoas serão digitadas?");
    int n = input.nextInt();

    String[] nomes = new String[n];
    int[] idades = new int[n];
    double[] alturas = new double[n];

    for (int i =0;i < nomes.length;i++){
        System.out.printf("digite a %da pessoa %n",i +1);
        input.nextLine();
        System.out.print("nome: ");
        nomes[i] = input.nextLine();
        System.out.print("idade: ");
        idades[i] = input.nextInt();
        System.out.print("altura: ");
        alturas[i] = input.nextDouble();
    }
    double sum = 0;
    for(int x = 0;x < alturas.length;x++){
        sum +=  alturas[x];
    }
    System.out.println("media das alturas: "+ sum/alturas.length);
    double porcentagem = 0;

    System.out.println("menos de 16 anos: ");
    for (int z = 0; z< idades.length; z++){
        if(idades[z] < 16 ){
            porcentagem += 1;
            System.out.println(nomes[z]);
        }
    }
    System.out.println("porcentagem: "+ (porcentagem / idades.length) * 100);

}

public void exercise5(){
    Scanner input = new Scanner(System.in);
    System.out.println("quantos numeros quer digitar?");
    int n = input.nextInt();
    double[] numeros = new double[n];
    for (int i = 0;i< numeros.length;i++ ){
        System.out.println("digite um numero:");
        numeros[i] = input.nextDouble();
    }

    double maior = numeros[0];
    int indice = 0;

    for (int i = 1; i < numeros.length; i++) {

        if (numeros[i] > maior) {
            maior = numeros[i];
            indice = i;
        }
    }

    System.out.println("Maior valor: " + maior);
    System.out.println("Índice: " + indice);
}

public void exercise6(){

        Scanner sc = new Scanner(System.in);

        int n;
        double media;

        System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            sc.nextLine();
            nomes[i] = sc.nextLine();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");

        for (int i=0; i<n; i++) {
            media = (notas1[i] + notas2[i]) / 2;

            if(media >= 6.0) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

}

public void exercise7(){

    Scanner sc = new Scanner(System.in);

    int n, qtdhomens, qtdmulheres;
    double menoraltura, maioraltura, alturafemMedia, alturafemtotal;

    System.out.print("Quantas pessoas serao digitadas? ");
    n = sc.nextInt();

    double[] alturas = new double[n];
    char[] generos = new char[n];

    for (int i=0; i<n; i++) {
        System.out.printf("Altura da %da pessoa: ", i + 1);
        alturas[i] = sc.nextDouble();
        System.out.printf("Genero da %da pessoa: ", i + 1);
        generos[i] = sc.next().charAt(0);
    }

    menoraltura = alturas[0];
    maioraltura = alturas[0];

    for (int i=1; i<n; i++) {
        if (alturas[i] > maioraltura) {
            maioraltura = alturas[i];
        }
        if (alturas[i] < menoraltura) {
            menoraltura = alturas[i];
        }
    }

    qtdhomens = 0;
    qtdmulheres = 0;
    alturafemtotal = 0;
    for (int i=0; i<n; i++) {
        if (generos[i]=='M') {
            qtdhomens++;
        }
        else {
            qtdmulheres++;
            alturafemtotal = alturafemtotal + alturas[i];
        }
    }

    alturafemMedia = alturafemtotal / qtdmulheres;

    System.out.printf("Menor altura = %.2f\n", menoraltura);
    System.out.printf("Maior altura = %.2f\n", maioraltura);
    System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
    System.out.printf("Numero de homens = %d\n", qtdhomens);


}

public void exercise8(){
    String name,email;
    int room;

    Scanner input = new Scanner(System.in);
    System.out.println("quantos quartos quer alugar?");
    int n = input.nextInt();
    Room[] rooms = new Room[n];
    room = 0;
    for (int i = 0; i < n; i ++){
        System.out.printf("Digite o nome,email e quarto do %do cliente %n",i);
        input.nextLine();
        name = input.nextLine();
        email = input.nextLine();
        room = input.nextInt();
        rooms[i] = new Room();
        rooms[i].register(name,email,room);
    }

    System.out.println("Quartos registrados: ");
    for (int x = 0; x < rooms.length;x++){
        System.out.println("#"+x);
        System.out.println(rooms[x].getRoom());
    }

}

//____________________ FOR EACH

public void forEachExemplo(){

    String[] vect = new String[] {"Carlos", "Pedro", "Lucas"};

//    ------------------------ for(Tipo obj : vect)

    for(String obj : vect){
        System.out.println(obj);
    }

}


//____________________ LISTA

public void listExemplo(){

    List<String> list = new ArrayList<>();
    list.add("teste1");
    list.add("teste2");
    list.add("teste3");
    list.add("teste4");

    for(String x : list){
        System.out.println(x);
    }

}








public void desafio1(){

            Locale.setDefault(Locale.US);
            Scanner input = new Scanner(System.in);

            // lista de objetos employee
            List<Employee> list = new ArrayList<>();

            System.out.print("How many employees will be registered? ");
            int N = input.nextInt();

            for (int i=0; i<N; i++) {

                System.out.println();
                System.out.println("Emplyoee #" + (i + 1) + ":");
                System.out.print("Id: ");
                Integer id = input.nextInt();

                while (hasId(list, id)) {
                    System.out.println("Id already taken! Try again: ");
                    id = input.nextInt();
                }

                System.out.print("Name: ");
                input.nextLine();
                String name = input.nextLine();
                System.out.print("Salary: ");
                Double salary = input.nextDouble();

                Employee emp = new Employee(id, name, salary);

                list.add(emp);
            }

            System.out.println();
            System.out.print("Enter the employee id that will have salary increase : ");
            int idsalary = input.nextInt();

            // ------------

            Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

            // if (pos == null) {
            if (emp == null) {
                System.out.println("This id does not exist!");
            }
            else {
                System.out.print("Enter the percentage: ");
                double percent = input.nextDouble();
                //list.get(pos).increaseSalary(percent);
                emp.increaseSalary(percent);
            }

            System.out.println();
            System.out.println("List of employees:");
            for (Employee e : list) {
                System.out.println(e);
            }

    input.close();
        }


        public static boolean hasId(List<Employee> list, int id) {
            Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            return emp != null;


}


public void exercMatrix(){
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] mat = new int[m][n];

    for (int i=0; i<mat.length; i++) {
        for (int j=0; j<mat[i].length; j++) {
            mat[i][j] = sc.nextInt();
        }
    }

    int x = sc.nextInt();

    for (int i=0; i<mat.length; i++) {
        for (int j=0; j<mat[i].length; j++) {
            if (mat[i][j] == x) {
                System.out.println("Position " + i + "," + j + ":");
                if (j > 0) {
                    System.out.println("Left: " + mat[i][j-1]);
                }
                if (i > 0) {
                    System.out.println("Up: " + mat[i-1][j]);
                }
                if (j < mat[i].length-1) {
                    System.out.println("Right: " + mat[i][j+1]);
                }
                if (i < mat.length-1) {
                    System.out.println("Down: " + mat[i+1][j]);
                }
            }
        }
    }
}