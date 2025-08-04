package com.example.loganalysis.model;

import java.util.Date;

public class LogResponse {
    private Date date;
    private String requestType;
    private String status;
    private String data;

    public LogResponse(Date date, String requestType, String status, String data) {
        this.date = date;
        this.requestType = requestType;
        this.status = status;
        this.data = data;
    }

    public Date getDate() {
        return date;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getStatus() {
        return status;
    }

    public String getData() {
        return data;
    }
}
