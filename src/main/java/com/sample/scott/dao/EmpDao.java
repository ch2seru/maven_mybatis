package com.sample.scott.dao;

import com.sample.scott.model.EmpModel;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Subject :
 * User: lke
 * Date: 12. 3. 26
 */
@Repository
public class EmpDao implements IEmpDao {
    @Autowired
    private SqlSession sqlSession;

    public List<EmpModel> list() {
        List<EmpModel> list = sqlSession.selectList("com.sample.scott.dao.sqlMap.Emp.selectList");
        return list;
    }

    public EmpModel get(int empno) {
        //Emp emp = (Emp) sessionFactory.getCurrentSession().get(Emp.class,empno);
        //return emp;
        //DistOrder bean = (DistOrder) sqlSession.selectOne("com.wyzsoft.distribution.dao.sqlMap.DistOrder.selectOne", order_no);
        return null;
    }

    public void save(EmpModel emp) {
        //sessionFactory.getCurrentSession().save(emp);
        //int result = sqlSession.insert("com.wyzsoft.distribution.dao.sqlMap.DistOrdDtl.insert", distOrdDtlList);
    }

    public void update(EmpModel emp) {
        //sessionFactory.getCurrentSession().merge(emp);
        //int result = sqlSession.update("com.wyzsoft.distribution.dao.sqlMap.DistOrder.update", distOrder);
    }

    public void delete(int empno) {
        //Emp emp = (Emp) sessionFactory.getCurrentSession().load(Emp.class,empno);
        //if(empno>0){
        //    sessionFactory.getCurrentSession().delete(emp);
        //}
        //int result = sqlSession.delete("com.wyzsoft.distribution.dao.sqlMap.DistOrder.delete", order_no);
    }

}
