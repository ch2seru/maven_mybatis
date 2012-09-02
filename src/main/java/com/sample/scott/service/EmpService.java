package com.sample.scott.service;

import com.sample.scott.dao.IEmpDao;
import com.sample.scott.model.EmpModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Subject :
 * User: lke
 * Date: 12. 3. 26
 */
@Transactional
@Service
public class EmpService implements IEmpService {
    @Autowired private IEmpDao empDao;


    public List<EmpModel> getList() {
        return empDao.list();
    }

    public EmpModel get(int empno) {
        return empDao.get(empno);
    }

    public void save(EmpModel emp) {
        empDao.save(emp);
    }

    public void modify(EmpModel emp) {
        empDao.update(emp);
    }

    public void remove(int empno) {
        empDao.delete(empno);
    }
}
