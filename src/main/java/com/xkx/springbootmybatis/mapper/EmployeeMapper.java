package com.xkx.springbootmybatis.mapper;

import com.xkx.springbootmybatis.bean.Employee;

public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
