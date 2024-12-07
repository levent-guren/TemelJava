package tr.com.ornek;

import tr.com.ornek.entity.Department;
import tr.com.ornek.entity.Employee;
import tr.com.ornek.util.DBUtils;
import tr.com.ornek.util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        test();
        HibernateUtil.closeSession();
    }

    private static void test() {
        List<Object> liste = DBUtils.get("employees", Employee.class);
        liste.forEach(System.out::println);

        List<Object> liste2 = DBUtils.get("departments", Department.class);
        liste2.forEach(System.out::println);
        System.out.println("*****************");
        Employee emp = (Employee) liste.get(0);
        // Okunan bir entity üzerinde get fonksiyonu çağırıldığında otomarik olarak
        // sql çalıştırılıp ilgili kayıtlar okunuyor.
        System.out.println(emp.getDepartment().getEmployees().size());
    }
}