package com.java.szymou.bean;

import java.util.Date;

public class Events {
    private Integer eventId;

    private String eventType;

    private String origin;

    private Date timeFired;

    private Date created;

    private String contextId;

    private String contextUserId;

    private String eventData;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Date getTimeFired() {
        return timeFired;
    }

    public void setTimeFired(Date timeFired) {
        this.timeFired = timeFired;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getContextId() {
        return contextId;
    }

    public void setContextId(String contextId) {
        this.contextId = contextId;
    }

    public String getContextUserId() {
        return contextUserId;
    }

    public void setContextUserId(String contextUserId) {
        this.contextUserId = contextUserId;
    }

    public String getEventData() {
        return eventData;
    }

    public void setEventData(String eventData) {
        this.eventData = eventData;
    }
}