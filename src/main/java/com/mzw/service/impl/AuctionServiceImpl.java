package com.mzw.service.impl;

import com.mzw.dao.AuctionDao;
import com.mzw.entity.Auction;
import com.mzw.entity.AutionQuery;
import com.mzw.service.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuctionServiceImpl implements AuctionService {
    @Autowired
    private AuctionDao auctionDao ;

    @Override
    public void insert(Auction auction) {
        auctionDao.insert(auction);
    }

    @Override
    public void update(Auction auction) {
        auctionDao.update(auction);
    }

    @Override
    public void delete(Integer id) {
        auctionDao.delete(id);
    }

    @Override
    public Auction selectOne(Integer id) {
        Auction auction =auctionDao.selectOne(id);
        return auction;
    }

    @Override
    public List<Auction> selectAll(Integer pageIndex, Integer pageSize, AutionQuery query) {
        int star = (pageIndex-1)*pageSize+1;
        int end = pageIndex*pageSize;

         List<Auction> list = auctionDao.selectAll(star,end,query);

        return list;
    }

    @Override
    public int selectNumber(AutionQuery query) {
      int i =  auctionDao.selectNumber(query);
        return i;
    }
}
