package com.java.szymou.dao;

import com.java.szymou.bean.States;
import java.util.List;

public interface StatesMapper {
    int deleteByPrimaryKey(Integer stateId);

    int insert(States record);

    States selectByPrimaryKey(Integer stateId);

    List<States> selectAll();

    int updateByPrimaryKey(States record);
}