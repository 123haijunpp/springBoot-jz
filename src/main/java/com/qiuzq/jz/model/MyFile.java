package com.qiuzq.jz.model;

import java.util.Date;

public class MyFile {
    private String fileId;

    private String fileName;

    private String contentType;

    private Long uploadUserId;

    private Date uploadTime;

    public MyFile(String fileId, String fileName, String contentType, Long uploadUserId, Date uploadTime) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.contentType = contentType;
        this.uploadUserId = uploadUserId;
        this.uploadTime = uploadTime;
    }

    public MyFile() {
        super();
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getUploadUserId() {
        return uploadUserId;
    }

    public void setUploadUserId(Long uploadUserId) {
        this.uploadUserId = uploadUserId;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}