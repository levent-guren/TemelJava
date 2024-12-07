package tr.com.ornek;

import tr.com.ornek.entity.Employee;
import tr.com.ornek.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        Employee e = Employee.getEmployeeById(100);
        Employee e2 = Employee.getEmployeeById(100);
        System.out.println(e2.getDepartment());
        HibernateUtil.closeSession();
    }
}