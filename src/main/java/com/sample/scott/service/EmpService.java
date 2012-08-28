package com.sample.scott.service;

import com.sample.scott.domain.Emp;

import java.util.List;

/**
 * Subject :
 * User: lke
 * Date: 12. 3. 26
 */
public interface EmpService {

    public List<Emp> getList();
    public Emp get(int empno);
    public void save(Emp emp);
    public void modify(Emp emp);
    public void remove(int empno);

}
