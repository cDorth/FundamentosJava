import listaEVetor.entities.Employee;

void main() {
    Locale.setDefault(Locale.US);
//    exercise1();
    exercise2();
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

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            List<Employee> list = new ArrayList<>();

            System.out.print("How many employees will be registered? ");
            int N = sc.nextInt();

            for (int i=0; i<N; i++) {

                System.out.println();
                System.out.println("Emplyoee #" + (i + 1) + ":");
                System.out.print("Id: ");
                Integer id = sc.nextInt();
                while (hasId(list, id)) {
                    System.out.println("Id already taken! Try again: ");
                    id = sc.nextInt();
                }

                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Salary: ");
                Double salary = sc.nextDouble();

                Employee emp = new Employee(id, name, salary);

                list.add(emp);
            }

            System.out.println();
            System.out.print("Enter the employee id that will have salary increase : ");
            int idsalary = sc.nextInt();

            // Integer pos = position(list, idsalary);

            Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

            // if (pos == null) {
            if (emp == null) {
                System.out.println("This id does not exist!");
            }
            else {
                System.out.print("Enter the percentage: ");
                double percent = sc.nextDouble();
                //list.get(pos).increaseSalary(percent);
                emp.increaseSalary(percent);
            }

            System.out.println();
            System.out.println("List of employees:");
            for (Employee e : list) {
                System.out.println(e);
            }

            sc.close();
        }

        public static Integer position(List<Employee> list, int id) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    return i;
                }
            }
            return null;
        }

        public static boolean hasId(List<Employee> list, int id) {
            Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            return emp != null;


}
