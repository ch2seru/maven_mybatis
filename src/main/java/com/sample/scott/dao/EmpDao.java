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
        EmpModel emp = (EmpModel) sqlSession.selectOne("com.sample.scott.dao.sqlMap.Emp.selectOne",empno);
        return emp;
    }

    public int save(EmpModel model) {
        int result = 0;
        result = sqlSession.insert("com.sample.scott.dao.sqlMap.Emp.insert", model);
        return result;
    }

    public int update(EmpModel model) {
        int result = 0;
        result = sqlSession.update("com.sample.scott.dao.sqlMap.Emp.update", model);
        return result;
    }

    public int delete(int empno) {
        int result = 0;
        result = sqlSession.delete("com.sample.scott.dao.sqlMap.Emp.delete", empno);
        return result;
    }

    public int getTotalCount() {
        int result = 0;
        result = Integer.parseInt(sqlSession.selectOne("com.sample.scott.dao.sqlMap.Emp.totalCount").toString());
        return result;
    }

}
