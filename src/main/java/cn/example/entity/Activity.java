package cn.example.entity;

import java.util.Date;

public class Activity {
    private Long objectId;

    private String name;

    private String content;

    private String speaker;

    private Date startDate;

    private Date endDate;

    private Date createDate;

    private Date pushDate;

    private Byte status;

    private String place;

    public Activity(Long objectId, String name, String content, String speaker, Date startDate, Date endDate, Date createDate, Date pushDate, Byte status, String place) {
        this.objectId = objectId;
        this.name = name;
        this.content = content;
        this.speaker = speaker;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createDate = createDate;
        this.pushDate = pushDate;
        this.status = status;
        this.place = place;
    }

    public Activity() {
        super();
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker == null ? null : speaker.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getPushDate() {
        return pushDate;
    }

    public void setPushDate(Date pushDate) {
        this.pushDate = pushDate;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }
}