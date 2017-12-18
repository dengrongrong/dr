package com.dr.m.run;

import com.dr.m.entity.Employee;
import com.dr.m.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class ReturnMap {

    public static void main(String a[]) throws IOException {

        String source="m-config.xml";
        InputStream in= Resources.getResourceAsStream(source);
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();
        EmployeeMapper mapper=session.getMapper(EmployeeMapper.class);
        Map<Integer,Employee> map;
        map= mapper.getEmpReturnMap("µË%");
        for(Map.Entry<Integer,Employee> entry:map.entrySet()){
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }
    }
}
