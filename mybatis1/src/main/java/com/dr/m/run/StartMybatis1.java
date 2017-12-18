package com.dr.m.run;

import com.dr.m.entity.Employee;
import com.dr.m.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.IOException;
import java.io.InputStream;

public class StartMybatis1 {

    public static void main(String args[]) throws IOException {
        String source="m-config.xml";
        InputStream in = Resources.getResourceAsStream(source);
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();
//      Employee emp =session.selectOne("com.dr.m.entity.EmployeeMapper.getEmpById",1);
//        EmployeeMapper mapper=session.getMapper(EmployeeMapper.class);
//        Employee emp=mapper.getEmpById(1);
        EmployeeMapper mapper=session.getMapper(EmployeeMapper.class);
        Employee emp=mapper.getEmpByIdAndName(1,"xiaoming");
        System.out.println(emp);
    }
}
