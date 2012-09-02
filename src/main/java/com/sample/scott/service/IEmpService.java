package com.sample.scott.service;

import com.sample.scott.domain.EmpModel;

import java.util.List;

/**
 * Subject :
 * User: lke
 * Date: 12. 3. 26
 */
public interface IEmpService {

    public List<EmpModel> getList();
    public EmpModel get(int empno);
    public void save(EmpModel emp);
    public void modify(EmpModel emp);
    public void remove(int empno);

}
