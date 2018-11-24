package com.qiuzq.jz.model;

public class Service {
    private Long serviceId;

    private String serviceName;

    private String serviceIcon;

    private String serviceBanner;

    private Long position;

    private Integer state;

    private String remark;

    private Integer isvoid;

    private String stateName;

    public Service(Long serviceId, String serviceName, String serviceIcon, String serviceBanner, Long position, Integer state, String remark, Integer isvoid) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceIcon = serviceIcon;
        this.serviceBanner = serviceBanner;
        this.position = position;
        this.state = state;
        this.remark = remark;
        this.isvoid = isvoid;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Service() {
        super();
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceIcon() {
        return serviceIcon;
    }

    public void setServiceIcon(String serviceIcon) {
        this.serviceIcon = serviceIcon;
    }

    public String getServiceBanner() {
        return serviceBanner;
    }

    public void setServiceBanner(String serviceBanner) {
        this.serviceBanner = serviceBanner;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsvoid() {
        return isvoid;
    }

    public void setIsvoid(Integer isvoid) {
        this.isvoid = isvoid;
    }
}