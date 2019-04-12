package com.mzw.dao;

import com.mzw.entity.AuctionRecord;

import java.util.List;

public interface AuctionRecordDao {
    void insert(AuctionRecord ar);
    List<AuctionRecord> selectAllRecord(Integer id);
}
