package com.java.szymou.bean;

import java.util.Date;

public class RecorderRun {
    private Integer runId;

    private Date start;

    private Date end;

    private Boolean closedIncorrect;

    private Date created;

    public Integer getRunId() {
        return runId;
    }

    public void setRunId(Integer runId) {
        this.runId = runId;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Boolean getClosedIncorrect() {
        return closedIncorrect;
    }

    public void setClosedIncorrect(Boolean closedIncorrect) {
        this.closedIncorrect = closedIncorrect;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}