package com.java.szymou.test;

import com.java.szymou.dao.EventsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    EventsMapper eventsMapper;
    @Test
    public void test(){
//        //1、创建springIOC容器
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2、从容器中获得mapper
//        Events bean = ioc.getBean(Events.class);
        System.out.println(eventsMapper);


    }
}
