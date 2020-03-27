package com.java.szymou.dao;

import com.java.szymou.bean.Events;
import java.util.List;

public interface EventsMapper {
    int deleteByPrimaryKey(Integer eventId);

    int insert(Events record);

    Events selectByPrimaryKey(Integer eventId);

    List<Events> selectAll();

    int updateByPrimaryKey(Events record);
}