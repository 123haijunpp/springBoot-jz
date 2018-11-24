package com.qiuzq.jz.model;

public class ServiceSubitem {
    private Long subitemId;

    private Long serviceId;

    private Long itemId;

    private String subitemName;

    private String subitemIcon;

    private String serviceDesc;

    private Float servicePrice;

    private String priceUnit;

    private Float serviceFavorablePrice;

    private Long position;

    private Integer state;

    private String remark;

    private Integer isvoid;

    public ServiceSubitem(Long subitemId, Long serviceId, Long itemId, String subitemName, String subitemIcon, String serviceDesc, Float servicePrice, String priceUnit, Float serviceFavorablePrice, Long position, Integer state, String remark, Integer isvoid) {
        this.subitemId = subitemId;
        this.serviceId = serviceId;
        this.itemId = itemId;
        this.subitemName = subitemName;
        this.subitemIcon = subitemIcon;
        this.serviceDesc = serviceDesc;
        this.servicePrice = servicePrice;
        this.priceUnit = priceUnit;
        this.serviceFavorablePrice = serviceFavorablePrice;
        this.position = position;
        this.state = state;
        this.remark = remark;
        this.isvoid = isvoid;
    }

    public ServiceSubitem() {
        super();
    }

    public Long getSubitemId() {
        return subitemId;
    }

    public void setSubitemId(Long subitemId) {
        this.subitemId = subitemId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getSubitemName() {
        return subitemName;
    }

    public void setSubitemName(String subitemName) {
        this.subitemName = subitemName;
    }

    public String getSubitemIcon() {
        return subitemIcon;
    }

    public void setSubitemIcon(String subitemIcon) {
        this.subitemIcon = subitemIcon;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    public Float getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Float servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Float getServiceFavorablePrice() {
        return serviceFavorablePrice;
    }

    public void setServiceFavorablePrice(Float serviceFavorablePrice) {
        this.serviceFavorablePrice = serviceFavorablePrice;
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