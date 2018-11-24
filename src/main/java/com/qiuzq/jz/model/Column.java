package com.qiuzq.jz.model;

public class Column {
    private Long columnId;

    private String columnName;

    private Integer horizontal;

    private String remark;

    public Column(Long columnId, String columnName, Integer horizontal, String remark) {
        this.columnId = columnId;
        this.columnName = columnName;
        this.horizontal = horizontal;
        this.remark = remark;
    }

    public Column() {
        super();
    }

    public Long getColumnId() {
        return columnId;
    }

    public void setColumnId(Long columnId) {
        this.columnId = columnId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Integer getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(Integer horizontal) {
        this.horizontal = horizontal;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}