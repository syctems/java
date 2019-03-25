package dao;

import entity.Dept;

import java.util.List;

public interface IDeptDAO {
    // 查询所有的部门
    public List<Dept> findAll();
}