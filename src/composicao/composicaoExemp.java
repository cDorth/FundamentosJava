import composicao.entities.*;
import composicao.entities.enums.WorkerLevel;

void main() throws ParseException {
//    exemplo1();
    exemplo2();
}

public void exemplo1() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    IO.print("Entre o nome do departamento: ");
    String departmentName = sc.nextLine();

    Department dept = new Department(departmentName);

    IO.println("Entre os dados do trabalhador:");
    IO.print("Nome: ");
    String workerName = sc.nextLine();
    IO.print("Nivel: ");
    WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine());
    IO.print("Salario base: ");
    double baseSalary = sc.nextDouble();

    Worker worker = new Worker(workerName, workerLevel, baseSalary, dept);

    IO.print("Quantos contratos esse trabalhador tem? ");
    int n = sc.nextInt();

    for (int i=1; i<=n; i++) {
        IO.println("Entre com os dados do contrato #" + i + ":");
        IO.print("Data (DD/MM/YYYY): ");
        LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
        IO.print("Valor por hora: ");
        double valuePerHour = sc.nextDouble();
        IO.print("Duracao (horas): ");
        int hours = sc.nextInt();
        HourContract contract = new HourContract(contractDate, valuePerHour, hours);
        worker.addContract(contract);
    }

    IO.println();
    IO.print("Entre o ano e mes para calcular o ganho (MM/YYYY): ");
    String monthAndYear = sc.next();

    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));

    IO.println("Nome: " + worker.getName());
    IO.println("Departamento: " + worker.getDepartment().getName());
    IO.println("Ganho para " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

}

public void exemplo2() throws ParseException{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comment c1 = new Comment("Have a nice trip!");
    Comment c2 = new Comment("Wow that's awesome!");
    Post p1 = new Post(
            sdf.parse("21/06/2018 13:05:44"),
            "Traveling to New Zealand",
            "I'm going to visit this wonderful country!",
            12);
    p1.addComment(c1);
    p1.addComment(c2);

    Comment c3 = new Comment("Good night");
    Comment c4 = new Comment("May the Force be with you");
    Post p2 = new Post(
            sdf.parse("28/07/2018 23:14:19"),
            "Good night guys",
            "See you tomorrow",
            5);
    p2.addComment(c3);
    p2.addComment(c4);

    System.out.println(p1);
    System.out.println(p2);
}
