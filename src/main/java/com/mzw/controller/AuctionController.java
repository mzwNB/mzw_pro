package com.mzw.controller;

import com.mzw.entity.Auction;
import com.mzw.entity.AuctionRecord;
import com.mzw.entity.AutionQuery;
import com.mzw.service.AuctionRecordService;
import com.mzw.service.AuctionService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.List;
import java.util.UUID;

public class AuctionController {
    @Autowired
    private AuctionService auctionService ;
    @Autowired
    private AuctionRecordService recordService;



}
