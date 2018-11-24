package com.qiuzq.jz.model;

public class ServiceItem {
    private Long itemId;

    private Long serviceId;

    private String itemName;

    private String itemIcon;

    private String itemBanner;

    private Long position;

    private Integer state;

    private String remark;

    private Integer isvoid;

    public ServiceItem(Long itemId, Long serviceId, String itemName, String itemIcon, String itemBanner, Long position, Integer state, String remark, Integer isvoid) {
        this.itemId = itemId;
        this.serviceId = serviceId;
        this.itemName = itemName;
        this.itemIcon = itemIcon;
        this.itemBanner = itemBanner;
        this.position = position;
        this.state = state;
        this.remark = remark;
        this.isvoid = isvoid;
    }

    public ServiceItem() {
        super();
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemIcon() {
        return itemIcon;
    }

    public void setItemIcon(String itemIcon) {
        this.itemIcon = itemIcon;
    }

    public String getItemBanner() {
        return itemBanner;
    }

    public void setItemBanner(String itemBanner) {
        this.itemBanner = itemBanner;
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