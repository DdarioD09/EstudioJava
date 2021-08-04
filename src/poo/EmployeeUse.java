package poo;

public class EmployeeUse {
    public static void main(String[] args) {

        Boss rhBoss = new Boss("Andres Gonzáles", 2000, 1998, 3, 16);
        rhBoss.setIncentive(2570);
        Employee[] employees = new Employee[6];
        employees[0] = new Employee("Paco Gómez", 85000, 1990, 2, 3);
        employees[1] = new Employee("Ana López", 95000, 1995, 8, 13);
        employees[2] = new Employee("María Martín", 105000, 2002, 12, 23);
        employees[3] = new Employee("Camila Medina");
        employees[4] = rhBoss;
        employees[5] = new Boss("María", 95000, 1999, 5, 26);
        Boss bossFinan = (Boss) employees[5];
        bossFinan.setIncentive(55000);

        for (Employee e : employees) {
            e.incrementSalary(5);
        }

        for (Employee e : employees) {
            System.out.println("ID " + e.getId() + " nombre " + e.getName() + " Sueldo " + e.getSalary()
                    + " Fecha de alta " + e.getContractDay());
        }
    }
}
