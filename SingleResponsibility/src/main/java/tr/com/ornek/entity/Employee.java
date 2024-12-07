package tr.com.ornek.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.query.Query;
import tr.com.ornek.util.HibernateUtil;

@Entity
@Data
@EqualsAndHashCode(exclude = "department")
@ToString(exclude = "department")
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;
    // Employee sınıfını vertabanından okuyan kodun burada olmaması gerekiyor.
    // Single Responsibility prensibine aykırı.
    // DBUtils gibi veritabanı işlerini yapan bir sınıfın içine yazılması doğru olur.
    public static Employee getEmployeeById(int id) {
        Query<Employee> sorgu = HibernateUtil.getSession().createQuery("from Employee e where e.employeeId = :no", Employee.class);
        sorgu.setParameter("no", id);
        Employee employee = sorgu.getSingleResult();
        //Employee employee = HibernateUtil.getSession().find(Employee.class, id);
        System.out.println(employee);
        return employee;
    }
}
