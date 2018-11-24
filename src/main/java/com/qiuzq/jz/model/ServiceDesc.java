package com.qiuzq.jz.model;

public class ServiceDesc {
    private Long descId;

    private Long serviceId;

    private String descName;

    private String descText;

    private String descImage;

    private String descIcon;

    private String remark;

    public ServiceDesc(Long descId, Long serviceId, String descName, String descText, String descImage, String descIcon, String remark) {
        this.descId = descId;
        this.serviceId = serviceId;
        this.descName = descName;
        this.descText = descText;
        this.descImage = descImage;
        this.descIcon = descIcon;
        this.remark = remark;
    }

    public ServiceDesc() {
        super();
    }

    public Long getDescId() {
        return descId;
    }

    public void setDescId(Long descId) {
        this.descId = descId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getDescName() {
        return descName;
    }

    public void setDescName(String descName) {
        this.descName = descName;
    }

    public String getDescText() {
        return descText;
    }

    public void setDescText(String descText) {
        this.descText = descText;
    }

    public String getDescImage() {
        return descImage;
    }

    public void setDescImage(String descImage) {
        this.descImage = descImage;
    }

    public String getDescIcon() {
        return descIcon;
    }

    public void setDescIcon(String descIcon) {
        this.descIcon = descIcon;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}