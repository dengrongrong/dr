package com.dr.m.run;

import com.dr.m.entity.Human;
import com.dr.m.mapper.EmployeeMapper;
import com.dr.m.mapper.HumanMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class ResultMap {

    public static void main(String a[]) throws IOException {
        String source="m-config.xml";
        InputStream in= Resources.getResourceAsStream(source);
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();
        HumanMapper mapper=session.getMapper(HumanMapper.class);
        Human human=mapper.getHumanById(1);
        System.out.println(human);
    }

}
