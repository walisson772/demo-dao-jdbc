package model.dao;

import com.mysql.cj.xdevapi.Client;
import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    Department findById(Integer id);
    List<Department> findAll();

}
