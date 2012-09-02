package com.sample.scott.dao;

import com.sample.scott.model.EmpModel;

import java.util.List;

/**
 * Subject :
 * User: lke
 * Date: 12. 3. 26
 */
public interface IEmpDao {

    public List<EmpModel> list();
    public EmpModel get(int empno);
    public int save(EmpModel model);
    public int update(EmpModel model);
    public int delete(int id);

    public int getTotalCount();
}
