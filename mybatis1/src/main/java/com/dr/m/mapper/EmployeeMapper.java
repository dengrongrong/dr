package com.dr.m.mapper;

import com.dr.m.entity.Employee;
import org.apache.ibatis.annotations.MapKey;

import java.util.Map;

public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public Employee getEmpByIdAndName(Integer id,String name);

    public Employee getEmpByMap(Map<String,Object> map);

    @MapKey("id")
    public Map<Integer,Employee> getEmpReturnMap(String like);
}
