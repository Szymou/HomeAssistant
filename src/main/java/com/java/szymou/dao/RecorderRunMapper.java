package com.java.szymou.dao;

import com.java.szymou.bean.RecorderRun;
import java.util.List;

public interface RecorderRunMapper {
    int deleteByPrimaryKey(Integer runId);

    int insert(RecorderRun record);

    RecorderRun selectByPrimaryKey(Integer runId);

    List<RecorderRun> selectAll();

    int updateByPrimaryKey(RecorderRun record);
}