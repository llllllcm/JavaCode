/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86136
 * Date: 2022-11-29
 * Time: 9:59
 */
abstract class Employee {
    public abstract double earnings();
}

class YearWorker extends Employee {
    public double earnings() {
        return 12000;
    }
}

class MonthWorker extends Employee {
    public double earnings() {
        return 12 * 6730;
    }
}

class Company {
    //声明一个名字是employee类型是Employee的数组
    Employee[] employee;
    double salaries = 0;

    Company(Employee[] employee) {
        this.employee = employee;
    }

    public double salariesPay() {
        salaries = 0;

        //计算salaries
        for (int i = 0; i < employee.length; i++) {
            salaries += employee[i].earnings();
        }
        return salaries;
    }
}

public class CompanySalary {
    public static void main(String[] args) {
        Employee[] employee = new Employee[129];
        for (int i = 0; i < employee.length; i++) {
            if (i % 2 == 0)
                employee[i] = new YearWorker();
            else if (i % 2 == 1)
                employee[i] = new MonthWorker();
        }
        Company company = new Company(employee);
        System.out.println("The company's salary is " + company.salariesPay());
    }
}