package com.mzw.controller;

import com.mzw.entity.Auction;
import com.mzw.entity.AuctionRecord;
import com.mzw.entity.AutionQuery;
import com.mzw.service.AuctionRecordService;
import com.mzw.service.AuctionService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.rtf.RTFEditorKit;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;
@Controller
@RequestMapping("auction")
public class AuctionController {
    @Autowired
    private AuctionService auctionService ;
    @Autowired
    private AuctionRecordService recordService;

    @RequestMapping("selectAll")
    private String selectAll(Map map, @RequestParam(defaultValue = "1")Integer pageIndex, @RequestParam(defaultValue = "6")Integer pageSize){
        List<Auction> list = auctionService.selectAll(pageIndex, pageSize, null);
        map.put("list",list);
        return "forward:/main/webapp/Regist.html";
    }
    @RequestMapping("selectOne")
    private String selectOne(Map map,Integer id){
        Auction auction = auctionService.selectOne(id);
        map.put("auction",auction);
        return "转发到修改";
    }
    @RequestMapping("update")
    private String update(Auction auction){

        auctionService.update(auction);
        return "重定向到查所有";
    }
    @RequestMapping("insert")
    private String  insert(Auction auction){
        auctionService.insert(auction);
        return "重定向到查所有";
    }
    @RequestMapping("delete")
    private String delete(Integer id){
        auctionService.delete(id);
        return "重定向到查所有";
    }
    @RequestMapping("deleteMany")
    private String deleteMany(int[] ids){
        return null;
    }

}
