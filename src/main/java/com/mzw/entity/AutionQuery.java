package com.mzw.entity;

import java.util.Date;

public class AutionQuery {
    String queryName;
    String queryDescr;
    Date queryStarTime;
    Date queryEndTime;

    @Override
    public String toString() {
        return "AutionQuery{" +
                "queryName='" + queryName + '\'' +
                ", queryDescr='" + queryDescr + '\'' +
                ", queryStarTime=" + queryStarTime +
                ", queryEndTime=" + queryEndTime +
                ", queryPrice=" + queryPrice +
                '}';
    }

    Double queryPrice;

    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    public String getQueryDescr() {
        return queryDescr;
    }

    public void setQueryDescr(String queryDescr) {
        this.queryDescr = queryDescr;
    }

    public Date getQueryStarTime() {
        return queryStarTime;
    }

    public void setQueryStarTime(Date queryStarTime) {
        this.queryStarTime = queryStarTime;
    }

    public Date getQueryEndTime() {
        return queryEndTime;
    }

    public void setQueryEndTime(Date queryEndTime) {
        this.queryEndTime = queryEndTime;
    }

    public Double getQueryPrice() {
        return queryPrice;
    }

    public void setQueryPrice(Double queryPrice) {
        this.queryPrice = queryPrice;
    }
}
