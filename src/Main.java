public class Main {

    public static Employee[] employee = new Employee[10];

    public static void main(String[] arg) {;
        employee[0] = new Employee("Petr Ivanovich Beck", 1, 30000);
        employee[1] = new Employee("Sergei Ivanovich Beck", 1, 20000);
        employee[2] = new Employee("Inna Ivanovna Beck", 1, 10000);
        employee[3] = new Employee("Petr Ivanovich Beck", 2, 50000);
        employee[4] = new Employee("Petr Ivanovich Snur", 3, 70000);
        employee[5] = new Employee("Petr Ivanovich Kobson", 4, 60000);
        employee[6] = new Employee("Vera Ivanovna Kobsom", 3, 100000);
        employee[7] = new Employee("Oleg Sergeevich Beck", 2, 80000);
        employee[8] = new Employee("Elena Swegeevna Noname", 2, 90000);
        employee[9] = new Employee("Irina Petrovna Be", 2, 90000);

        printAll();
        System.out.println("Общее значение зарплаты равно " + totalSalary());
        System.out.println("Минимальное значение зарплаты равно " + getMinSalary());
        System.out.println("Максимальное значение зарплаты равно " + getMaxSalary());
        System.out.println("Среднее значение зарплаты равно " + averageSalary());
        getFullname();
    }

    public static void printAll() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
    public static int totalSalary () {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        return sum;
    }

    public static Employee getMinSalary () {
        Employee emploeeMinSalary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < emploeeMinSalary.getSalary()) {
                emploeeMinSalary = employee[i];
            }

        }
        return emploeeMinSalary;
    }
    public static Employee getMaxSalary () {
        Employee emploeeMaxSalary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > emploeeMaxSalary.getSalary()) {
                emploeeMaxSalary = employee[i];
            }

        }
        return emploeeMaxSalary;
    }
    public static double averageSalary () {
        int salary = totalSalary();
        return salary/ employee.length;
    }
    public static void getFullname () {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullName());
        }
    }
}