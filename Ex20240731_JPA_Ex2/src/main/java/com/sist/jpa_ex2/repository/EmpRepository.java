package com.sist.jpa_ex2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sist.jpa_ex2.store.Emp;
import java.util.List;


@Repository
public interface EmpRepository extends JpaRepository<Emp, String>{
    // 상속받은 findAll(), findById() 등이 있는 상태
    List<Emp> findByEname(String ename);
    
    List<Emp> findByEnameContaining(String ename);
    
} 
