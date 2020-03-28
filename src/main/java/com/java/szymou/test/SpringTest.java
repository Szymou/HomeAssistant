package com.java.szymou.test;

import com.github.pagehelper.PageInfo;
import com.java.szymou.bean.UserInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * Spring 测试模块
 * @author szymou
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","file:D:\\IDEA_MyProjects\\HomeAssistant\\src\\main\\webapp\\WEB-INF\\dispatcherServlet-servlet.xml"})
public class SpringTest {

    //传入SpringMvc的Ioc
    @Autowired
    WebApplicationContext context;
    //虚拟MVC请求
    MockMvc mockMvc;

    @Before
    public void initMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testPage() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/users").param("page", "1"))
                .andReturn();

        //请求成功后，请求域中会有pageinfo，我们可以取出pageinfo进行验证
        MockHttpServletRequest request = mvcResult.getRequest();
        PageInfo attribute = (PageInfo)request.getAttribute("pageinfo");
        System.out.println("当前页码："+attribute.getPageNum());
        System.out.println("总页数："+attribute.getPages());
        System.out.println("总记录数："+attribute.getTotal());
        System.out.println("在页面需要连续显示的页码："+attribute.getTotal());
        int[] nums = attribute.getNavigatepageNums();
        for(int i : nums){
            System.out.print("" + i);
        }

        //获取人员数据
        List <UserInfo> list= attribute.getList();
        for(UserInfo userInfo : list){
            System.out.println(userInfo);
        }
    }
}
