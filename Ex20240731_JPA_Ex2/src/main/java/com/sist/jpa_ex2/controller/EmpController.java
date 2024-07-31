package com.sist.jpa_ex2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sist.jpa_ex2.service.EmpService;
import com.sist.jpa_ex2.store.Emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("all")
    public String all() {
        StringBuffer sb = new StringBuffer();

        Emp[] e_ar = empService.getAll();
        for(Emp emp: e_ar){
            sb.append(emp.getEmpno());
            sb.append(" || ");
            sb.append(emp.getEname());
            sb.append("<br/>");
        }

        return sb.toString();
    }

    @GetMapping("searchName")
    public String searchName(String ename) {
        StringBuffer sb = new StringBuffer();

        Emp[] e_ar = empService.searchName(ename);
        if(e_ar != null){
            for(Emp emp: e_ar){
                sb.append(emp.getEmpno());
                sb.append(" || ");
                sb.append(emp.getEname());
                sb.append("<br/>");
            }
        } else{
            sb.append("검색결과가 없습니다.");
        }

        return sb.toString();
    }
    @GetMapping("searchNameContain")
    public String searchNameContain(String ename) {
        StringBuffer sb = new StringBuffer();

        Emp[] e_ar = empService.searchNameContain(ename);
        if(e_ar != null){
            for(Emp emp: e_ar){
                sb.append(emp.getEmpno());
                sb.append(" || ");
                sb.append(emp.getEname());
                sb.append("<br/>");
            }
        } else{
            sb.append("검색결과가 없습니다.");
        }

        return sb.toString();
    }
    
}
