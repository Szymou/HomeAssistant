package com.java.szymou.service.impl;

import com.java.szymou.bean.UserInfo;
import com.java.szymou.dao.UserInfoMapper;
import com.java.szymou.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getAll() {

        return userInfoMapper.selectAll();
    }
}
