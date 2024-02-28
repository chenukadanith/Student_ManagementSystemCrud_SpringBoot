package com.bank.costomer_crud.repository;

import com.bank.costomer_crud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Optional <Student>findByEmail(String email) ;

}
