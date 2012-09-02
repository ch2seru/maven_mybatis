package com.sample.scott.service;

import com.sample.scott.model.EmpModel;

import java.util.List;

/**
 * Subject :
 * User: lke
 * Date: 12. 3. 26
 */
public interface IEmpService {

    public List<EmpModel> getList();
    public EmpModel get(int empno);
    public int save(EmpModel emp);
    public int modify(EmpModel emp);
    public int remove(int empno);

    public int getTotalCount();
}
