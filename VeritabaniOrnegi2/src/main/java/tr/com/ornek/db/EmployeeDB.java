package tr.com.ornek.db;

import tr.com.ornek.entity.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDB extends BaseDB {
    public List<Employee> getEmployeeList() {
        List<Employee> result = new ArrayList<>();
        try {
            PreparedStatement stmt =  getConnection().prepareStatement("select * from employees");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                Employee employee = new Employee();
                employee.setEmployeeId(rs.getInt("employee_id"));
                employee.setFirstName(rs.getString("first_name"));
                employee.setLastName(rs.getString("last_name"));
                result.add(employee);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    return result;

    }
}
