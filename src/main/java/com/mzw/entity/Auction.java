package com.mzw.entity;

import java.util.Date;

public class Auction {
    private Integer auctionId;
    private String auctionName;
    private Double auctionStarPrice;
    private Double auctionUpset;
    private Date   auctionStarTime;
    private Date auctionEndTime;
    private String auctionPic;
    private String auctionPicNew;
    private String auctionDesc;

    public Integer getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }

    public String getAuctionName() {
        return auctionName;
    }

    public void setAuctionName(String auctionName) {
        this.auctionName = auctionName;
    }

    public Double getAuctionStarPrice() {
        return auctionStarPrice;
    }

    public void setAuctionStarPrice(Double auctionStarPrice) {
        this.auctionStarPrice = auctionStarPrice;
    }

    public Double getAuctionUpset() {
        return auctionUpset;
    }

    public void setAuctionUpset(Double auctionUpset) {
        this.auctionUpset = auctionUpset;
    }

    public Date getAuctionStarTime() {
        return auctionStarTime;
    }

    public void setAuctionStarTime(Date auctionStarTime) {
        this.auctionStarTime = auctionStarTime;
    }

    public Date getAuctionEndTime() {
        return auctionEndTime;
    }

    public void setAuctionEndTime(Date auctionEndTime) {
        this.auctionEndTime = auctionEndTime;
    }

    public String getAuctionPic() {
        return auctionPic;
    }

    public void setAuctionPic(String auctionPic) {
        this.auctionPic = auctionPic;
    }

    public String getAuctionPicNew() {
        return auctionPicNew;
    }

    public void setAuctionPicNew(String auctionPicNew) {
        this.auctionPicNew = auctionPicNew;
    }

    public String getAuctionDesc() {
        return auctionDesc;
    }

    public void setAuctionDesc(String auctionDesc) {
        this.auctionDesc = auctionDesc;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "auctionId=" + auctionId +
                ", auctionName='" + auctionName + '\'' +
                ", auctionStarPrice=" + auctionStarPrice +
                ", auctionUpset=" + auctionUpset +
                ", auctionStarTime=" + auctionStarTime +
                ", auctionEndTime=" + auctionEndTime +
                ", auctionPic='" + auctionPic + '\'' +
                ", auctionPicNew='" + auctionPicNew + '\'' +
                ", auctionDesc='" + auctionDesc + '\'' +
                '}';
    }
}
