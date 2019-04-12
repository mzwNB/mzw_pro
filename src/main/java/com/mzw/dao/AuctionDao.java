package com.mzw.dao;

import com.mzw.entity.Auction;
import com.mzw.entity.AutionQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuctionDao {
    void insert(Auction auction);
    void delete(Integer id);
    void update(Auction auction);
    Auction selectOne(Integer id);
    List<Auction> selectAll(@Param("star") Integer star, @Param("end") Integer end, @Param("query") AutionQuery query);
    int  selectNumber(@Param("query") AutionQuery query);
}
