package com.mzw.service;

import com.mzw.entity.Auction;
import com.mzw.entity.AutionQuery;

import java.util.List;

public interface AuctionService {
    void insert(Auction auction);
    void update(Auction auction);
    void delete(Integer id);
    Auction selectOne(Integer id);
    List<Auction> selectAll(Integer pageIndex, Integer pageSize, AutionQuery query);
    int selectNumber(AutionQuery query);
}
