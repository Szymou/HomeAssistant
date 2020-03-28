package com.java.szymou.test;

import com.java.szymou.bean.UserInfo;
import com.java.szymou.dao.EventsMapper;
import com.java.szymou.dao.UserInfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    SqlSession sqlSession;
    @Test
    public void test(){
//        //1、创建springIOC容器
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2、从容器中获得mapper
//        Events bean = ioc.getBean(Events.class);
        System.out.println(userInfoMapper);
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        String uid;
        for (int i = 0; i < 20; i++){
            uid = UUID.randomUUID().toString().substring(0,3);
            mapper.insert(new UserInfo(uid+"name", "M", uid+"@szymou.com"));
        }

    }
}
