package com.sample.scott.dao;

import com.sample.scott.domain.Emp;

import java.util.List;

/**
 * Subject :
 * User: lke
 * Date: 12. 3. 26
 */
public interface IEmpDao {

    public List<Emp> list();
    public Emp get(int empno);
    public void save(Emp emp);
    public void update(Emp emp);
    public void delete(int id);

}
