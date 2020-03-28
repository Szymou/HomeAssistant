package com.java.szymou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.java.szymou.bean.UserInfo;
import com.java.szymou.service.UserInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 查询人员信息
 * @author szymou
 */
@Controller
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @ApiOperation("台账表头")
    @GetMapping("/users")
    public String getUser(@RequestParam(value = "page",defaultValue = "1")Integer page, Model model){
        //引入分页插件(查询之前调用PageHelper方法,如下)
        PageHelper.startPage(page, 5);
        //startPage紧跟着的查询就是一个分页查询
        List<UserInfo> userInfos = userInfoService.getAll();
        //使用PageInfo包装查询后的结果,只需要将pageInfo交给页面就可以了
        //封装了详细的分页查询信息，和查询出来的数据
        PageInfo pageinfo = new PageInfo(userInfos,5);//这里的5是指传入连续5页的数据
        model.addAttribute("pageinfo",pageinfo);

        return  "list";//这里的list是指list页面。因为有WEB-INF/dispatcherServlet-servlet.xml的视图解析器，所以会return都配置下的页面
    }
}
