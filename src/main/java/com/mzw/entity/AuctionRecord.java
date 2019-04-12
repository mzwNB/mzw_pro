package com.mzw.entity;

import java.util.Date;

public class AuctionRecord {
    private Integer id;
    private Integer userId;
    private Integer auctionId;
    private Date auctionTime;
    private Double auctionPrice;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AuctionRecord{" +
                "id=" + id +
                ", userId=" + userId +
                ", auctionId=" + auctionId +
                ", auctionTime=" + auctionTime +
                ", auctionPrice=" + auctionPrice +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }

    public Date getAuctionTime() {
        return auctionTime;
    }

    public void setAuctionTime(Date auctionTime) {
        this.auctionTime = auctionTime;
    }

    public Double getAuctionPrice() {
        return auctionPrice;
    }

    public void setAuctionPrice(Double auctionPrice) {
        this.auctionPrice = auctionPrice;
    }
}
