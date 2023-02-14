/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2023-02-13
 * Time: 19:27
 */
import java.util.Scanner;
class Employee {
    public int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
class Manager extends Employee {
    public Manager(int salary) {
        super(salary);
        this.salary = salary;
    }
    @Override
    public int getSalary() {
        return salary;
    }

}

class Salesman extends Employee {
    public int commission;

    public Salesman(int salary, int commission) {
        super(salary);
        this.commission = commission;
    }

    @Override
    public int getSalary() {
        return super.salary + commission;
    }
}

class Worker extends Employee {

    public int day;
    public int daySalary;

    public Worker(int day, int daySalary) {
        super(1);
        this.day = day;
        this.daySalary = daySalary;
    }

    public int getSalary() {
        return daySalary * day;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee m = new Manager(scanner.nextInt());
        Employee s = new Salesman(scanner.nextInt(), scanner.nextInt());
        Employee w = new Worker(scanner.nextInt(), scanner.nextInt());

        System.out.println(m.getSalary());
        System.out.println(s.getSalary());
        System.out.println(w.getSalary());
    }
}

