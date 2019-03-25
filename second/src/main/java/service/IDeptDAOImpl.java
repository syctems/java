package service;

import dao.IDeptDAO;
import entity.Dept;
import util.SessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class IDeptDAOImpl implements IDeptDAO {
    public List<Dept> findAll() {
        // 获取session
        SqlSession session = null;
        List<Dept> depts = null;
        try{
            session = SessionFactoryUtil.getSession();
            IDeptDAO mapper = session.getMapper(IDeptDAO.class);
            depts = mapper.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return depts;
    }
}