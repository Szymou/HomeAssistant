package com.java.szymou.service;

import com.java.szymou.bean.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserInfoService {
    public List<UserInfo> getAll();
}
