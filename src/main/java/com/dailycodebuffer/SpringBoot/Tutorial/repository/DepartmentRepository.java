/* a repository is an interface that provides methods for accessing and
manipulating data in a database.The JpaRepository provides several methods
 for CRUD operations, such as save(), findById(), findAll(), deleteById(),
  etc.
  The repository interface extends the CrudRepository or JpaRepository
   interface provided by Spring Data JPA


 */

package com.dailycodebuffer.SpringBoot.Tutorial.repository;
import com.dailycodebuffer.SpringBoot.Tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository <Department, Long>{
}
