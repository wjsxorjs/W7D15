package com.sist.jpa_ex2.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.jpa_ex2.repository.EmpRepository;
import com.sist.jpa_ex2.store.Emp;

@Service
public class EmpService {
    @Autowired
    private EmpRepository empRepository;

    public Emp[] getAll(){
        Emp[] e_ar = null;

        List<Emp> e_list = empRepository.findAll();
        if(e_list != null && e_list.size() >0){
            e_ar = new Emp[e_list.size()];
            e_list.toArray(e_ar);
        }

        return e_ar;
    }

    public Emp[] searchName(String ename){
        Emp[] e_ar = null;

        List<Emp> e_list = empRepository.findByEname(ename);
        if(e_list != null && e_list.size() >0){
            e_ar = new Emp[e_list.size()];
            e_list.toArray(e_ar);
        }

        return e_ar;
    }

    public Emp[] searchNameContain(String ename){
        Emp[] e_ar = null;

        List<Emp> e_list = empRepository.findByEnameContaining(ename);
        if(e_list != null && e_list.size() >0){
            e_ar = new Emp[e_list.size()];
            e_list.toArray(e_ar);
        }

        return e_ar;
    }
    

}
