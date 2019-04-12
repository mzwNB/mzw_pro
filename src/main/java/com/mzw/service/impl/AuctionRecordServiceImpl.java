package com.mzw.service.impl;

import com.mzw.dao.AuctionRecordDao;
import com.mzw.entity.Auction;
import com.mzw.entity.AuctionRecord;
import com.mzw.service.AuctionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuctionRecordServiceImpl implements AuctionRecordService {
    @Autowired
    private AuctionRecordDao auctionRecordDao;

    @Override
    public void insert(AuctionRecord auction) {
        auctionRecordDao.insert(auction);
    }

    @Override
    public List<AuctionRecord> selectAll(Integer id) {
        List<AuctionRecord> list = auctionRecordDao.selectAllRecord(id);
        return list;
    }
}
