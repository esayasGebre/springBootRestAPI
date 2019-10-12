package springbootrestservice.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootrestservice.app.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long>{

}
