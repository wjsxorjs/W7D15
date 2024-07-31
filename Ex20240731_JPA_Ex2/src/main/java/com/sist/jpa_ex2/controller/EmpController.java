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
            sb.append(" || ");
            sb.append(emp.getJob());
            sb.append(" || ");
            sb.append(emp.getSal());
            sb.append(" || ");
            sb.append(emp.getDeptno());
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
                sb.append(" || ");
                sb.append(emp.getJob());
                sb.append(" || ");
                sb.append(emp.getSal());
                sb.append(" || ");
                sb.append(emp.getDeptno());
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
                sb.append(" || ");
                sb.append(emp.getJob());
                sb.append(" || ");
                sb.append(emp.getSal());
                sb.append(" || ");
                sb.append(emp.getDeptno());
                sb.append("<br/>");
            }
        } else{
            sb.append("검색결과가 없습니다.");
        }

        return sb.toString();
    }
    
    @GetMapping("searchNameLike")
    public String searchNameLike(String ename) {
        StringBuffer sb = new StringBuffer();

        Emp[] e_ar = empService.searchNameLike(ename);
        if(e_ar != null){
            for(Emp emp: e_ar){
                sb.append(emp.getEmpno());
                sb.append(" || ");
                sb.append(emp.getEname());
                sb.append(" || ");
                sb.append(emp.getJob());
                sb.append(" || ");
                sb.append(emp.getSal());
                sb.append(" || ");
                sb.append(emp.getDeptno());
                sb.append("<br/>");
            }
        } else{
            sb.append("검색결과가 없습니다.");
        }

        return sb.toString();
    }

    @GetMapping("searchJobLike")
    public String searchJobLike(String job) {
        StringBuffer sb = new StringBuffer();

        Emp[] e_ar = empService.searchJobLike(job);
        if(e_ar != null){
            for(Emp emp: e_ar){
                sb.append(emp.getEmpno());
                sb.append(" || ");
                sb.append(emp.getEname());
                sb.append(" || ");
                sb.append(emp.getJob());
                sb.append(" || ");
                sb.append(emp.getSal());
                sb.append(" || ");
                sb.append(emp.getDeptno());
                sb.append("<br/>");
            }
        } else{
            sb.append("검색결과가 없습니다.");
        }

        return sb.toString();
    }

    @GetMapping("searchJobLikeAndDeptno")
    public String searchJobLikeAndDeptno(String job, String deptno) {
        StringBuffer sb = new StringBuffer();

        Emp[] e_ar = empService.searchJobLikeAndDeptno(job, deptno);
        if(e_ar != null){
            for(Emp emp: e_ar){
                sb.append(emp.getEmpno());
                sb.append(" || ");
                sb.append(emp.getEname());
                sb.append(" || ");
                sb.append(emp.getJob());
                sb.append(" || ");
                sb.append(emp.getSal());
                sb.append(" || ");
                sb.append(emp.getDeptno());
                sb.append("<br/>");
            }
        } else{
            sb.append("검색결과가 없습니다.");
        }

        return sb.toString();
    }

    @GetMapping("searchJobLikeOrDeptno")
    public String searchJobLikeOrDeptno(String job, String deptno) {
        StringBuffer sb = new StringBuffer();

        Emp[] e_ar = empService.searchJobLikeOrDeptno(job, deptno);
        if(e_ar != null){
            for(Emp emp: e_ar){
                sb.append(emp.getEmpno());
                sb.append(" || ");
                sb.append(emp.getEname());
                sb.append(" || ");
                sb.append(emp.getJob());
                sb.append(" || ");
                sb.append(emp.getSal());
                sb.append(" || ");
                sb.append(emp.getDeptno());
                sb.append("<br/>");
            }
        } else{
            sb.append("검색결과가 없습니다.");
        }

        return sb.toString();
    }
    
    @GetMapping("searchSalLessThan")
    public String searchSalLessThan(int sal) {
        StringBuffer sb = new StringBuffer();

        Emp[] e_ar = empService.searchSalLessThan(sal);
        if(e_ar != null){
            for(Emp emp: e_ar){
                sb.append(emp.getEmpno());
                sb.append(" || ");
                sb.append(emp.getEname());
                sb.append(" || ");
                sb.append(emp.getJob());
                sb.append(" || ");
                sb.append(emp.getSal());
                sb.append(" || ");
                sb.append(emp.getDeptno());
                sb.append("<br/>");
            }
        } else{
            sb.append("검색결과가 없습니다.");
        }

        return sb.toString();
    }
    
    @GetMapping("searchSalLessThanEqual")
    public String searchSalLessThanEqual(int sal) {
        StringBuffer sb = new StringBuffer();

        Emp[] e_ar = empService.searchSalLessThanEqual(sal);
        if(e_ar != null){
            for(Emp emp: e_ar){
                sb.append(emp.getEmpno());
                sb.append(" || ");
                sb.append(emp.getEname());
                sb.append(" || ");
                sb.append(emp.getJob());
                sb.append(" || ");
                sb.append(emp.getSal());
                sb.append(" || ");
                sb.append(emp.getDeptno());
                sb.append("<br/>");
            }
        } else{
            sb.append("검색결과가 없습니다.");
        }

        return sb.toString();
    }
    
    @GetMapping("searchSalGreaterThan")
    public String searchSalGreaterThan(int sal) {
        StringBuffer sb = new StringBuffer();

        Emp[] e_ar = empService.searchSalGreaterThan(sal);
        if(e_ar != null){
            for(Emp emp: e_ar){
                sb.append(emp.getEmpno());
                sb.append(" || ");
                sb.append(emp.getEname());
                sb.append(" || ");
                sb.append(emp.getJob());
                sb.append(" || ");
                sb.append(emp.getSal());
                sb.append(" || ");
                sb.append(emp.getDeptno());
                sb.append("<br/>");
            }
        } else{
            sb.append("검색결과가 없습니다.");
        }

        return sb.toString();
    }
    
    @GetMapping("searchSalGreaterThanEqual")
    public String searchSalGreaterThanEqual(int sal) {
        StringBuffer sb = new StringBuffer();

        Emp[] e_ar = empService.searchSalGreaterThanEqual(sal);
        if(e_ar != null){
            for(Emp emp: e_ar){
                sb.append(emp.getEmpno());
                sb.append(" || ");
                sb.append(emp.getEname());
                sb.append(" || ");
                sb.append(emp.getJob());
                sb.append(" || ");
                sb.append(emp.getSal());
                sb.append(" || ");
                sb.append(emp.getDeptno());
                sb.append("<br/>");
            }
        } else{
            sb.append("검색결과가 없습니다.");
        }

        return sb.toString();
    }

}
