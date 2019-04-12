package com.mzw.service;

import com.mzw.entity.Auction;
import com.mzw.entity.AuctionRecord;

import java.util.List;

public interface AuctionRecordService {
    void insert(AuctionRecord auction);
    List<AuctionRecord> selectAll(Integer id);
}
