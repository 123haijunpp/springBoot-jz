package com.qiuzq.jz.model;

public class ColumnSubitem {
    private Long csid;

    private Long columnId;

    private Long subitemId;

    public ColumnSubitem(Long csid, Long columnId, Long subitemId) {
        this.csid = csid;
        this.columnId = columnId;
        this.subitemId = subitemId;
    }

    public ColumnSubitem() {
        super();
    }

    public Long getCsid() {
        return csid;
    }

    public void setCsid(Long csid) {
        this.csid = csid;
    }

    public Long getColumnId() {
        return columnId;
    }

    public void setColumnId(Long columnId) {
        this.columnId = columnId;
    }

    public Long getSubitemId() {
        return subitemId;
    }

    public void setSubitemId(Long subitemId) {
        this.subitemId = subitemId;
    }
}