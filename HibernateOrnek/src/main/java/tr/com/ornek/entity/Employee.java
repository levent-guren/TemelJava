package tr.com.ornek.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(exclude = "department")
@ToString(exclude = "department")
@Table(name="employees")
public class Employee {
    @Id
    @Column(name="employee_id")
    private int employeeId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}
