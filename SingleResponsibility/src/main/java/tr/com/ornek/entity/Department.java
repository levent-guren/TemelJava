package tr.com.ornek.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@EqualsAndHashCode(exclude = "employees")
@ToString(exclude = "employees")
@Table(name="departments")
public class Department {
    @Id
    @Column(name = "department_id")
    private int departmentId;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "manager_id")
    private Integer managerId;
    @Column(name = "location_id")
    private Integer locationId;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
