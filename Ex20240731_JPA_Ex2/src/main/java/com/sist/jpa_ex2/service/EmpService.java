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

    public Emp[] searchNameLike(String ename){
        Emp[] e_ar = null;
        StringBuffer sb = new StringBuffer("%");
        sb.append(ename);
        sb.append("%");
        List<Emp> e_list = empRepository.findByEnameLike(sb.toString());
        if(e_list != null && e_list.size() >0){
            e_ar = new Emp[e_list.size()];
            e_list.toArray(e_ar);
        }

        return e_ar;
    }

    public Emp[] searchJobLike(String job){
        Emp[] e_ar = null;
        StringBuffer sb = new StringBuffer("%");
        sb.append(job);
        sb.append("%");
        List<Emp> e_list = empRepository.findByJobLike(sb.toString());
        if(e_list != null && e_list.size() >0){
            e_ar = new Emp[e_list.size()];
            e_list.toArray(e_ar);
        }

        return e_ar;
    }

    public Emp[] searchJobLikeAndDeptno(String job, String deptno){
        Emp[] e_ar = null;
        StringBuffer sb = new StringBuffer("%");
        sb.append(job);
        sb.append("%");
        List<Emp> e_list = empRepository.findByJobLikeAndDeptno(sb.toString(),deptno);
        if(e_list != null && e_list.size() >0){
            e_ar = new Emp[e_list.size()];
            e_list.toArray(e_ar);
        }

        return e_ar;
    }

    public Emp[] searchJobLikeOrDeptno(String job, String deptno){
        Emp[] e_ar = null;
        StringBuffer sb = new StringBuffer("%");
        sb.append(job);
        sb.append("%");
        List<Emp> e_list = empRepository.findByJobLikeOrDeptno(sb.toString(),deptno);
        if(e_list != null && e_list.size() >0){
            e_ar = new Emp[e_list.size()];
            e_list.toArray(e_ar);
        }

        return e_ar;
    }
    
    public Emp[] searchSalLessThan(int sal){
        Emp[] e_ar = null;
        List<Emp> e_list = empRepository.findBySalLessThan(sal);
        if(e_list != null && e_list.size() >0){
            e_ar = new Emp[e_list.size()];
            e_list.toArray(e_ar);
        }

        return e_ar;
    }
    
    public Emp[] searchSalLessThanEqual(int sal){
        Emp[] e_ar = null;
        List<Emp> e_list = empRepository.findBySalLessThanEqual(sal);
        if(e_list != null && e_list.size() >0){
            e_ar = new Emp[e_list.size()];
            e_list.toArray(e_ar);
        }

        return e_ar;
    }
    
    public Emp[] searchSalGreaterThan(int sal){
        Emp[] e_ar = null;
        List<Emp> e_list = empRepository.findBySalGreaterThan(sal);
        if(e_list != null && e_list.size() >0){
            e_ar = new Emp[e_list.size()];
            e_list.toArray(e_ar);
        }

        return e_ar;
    }
    
    public Emp[] searchSalGreaterThanEqual(int sal){
        Emp[] e_ar = null;
        List<Emp> e_list = empRepository.findBySalGreaterThanEqual(sal);
        if(e_list != null && e_list.size() >0){
            e_ar = new Emp[e_list.size()];
            e_list.toArray(e_ar);
        }

        return e_ar;
    }

}
