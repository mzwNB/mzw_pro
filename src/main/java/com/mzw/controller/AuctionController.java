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
    private List<AuctionRecord> recordList;
    private AuctionRecord record;

    private Integer id;
    private List<Auction> list;
    private Integer pageIndex=1;
    private Integer pageSize=5;
    private Integer totalPage;
    private Auction auction;
    private AutionQuery query;
    private File file;
    private String fileFileName;

    public String selectAll(){
       int count =auctionService.selectNumber(query);
       if(count%pageSize==0){
           totalPage = count/pageSize;
       }else{
           totalPage = count/pageSize+1;
       }
        list = auctionService.selectAll(pageIndex,pageSize,query);

        return "selectAllOk";
    }
    public String selectOne(){
        auction = auctionService.selectOne(id);
        return "toupdate";

    }
    public String update() throws Exception{
        System.out.println(file);
        if(file!= null){
            String uuid = UUID.randomUUID().toString();
            String picNew = uuid+fileFileName.substring(fileFileName.lastIndexOf("."));
            auction.setAuctionPic(fileFileName);
            auction.setAuctionPicNew(picNew);
            FileUtils.copyFile(file,new File("E:\\服务器\\"+picNew));
        }
        auctionService.update(auction);
        return "toselectAll";

    }
    public String delete(){
        auctionService.delete(id);
        return "toselectAll";

    }
    public String insert() throws Exception{
        String uuid = UUID.randomUUID().toString();
        String picNew = uuid+fileFileName.substring(fileFileName.lastIndexOf("."));
        auction.setAuctionPic(fileFileName);
        auction.setAuctionPicNew(picNew);
        FileUtils.copyFile(file,new File("E:\\服务器\\"+picNew));
        auctionService.insert(auction);
        return "toselectAll";
    }
    public String  selectRecord(){
        auction = auctionService.selectOne(id);
        recordList = recordService.selectAll(id);
        return "selectRecordOk";
    }
    public String addRecord(){
        recordService.insert(record);
        return "toselectRecord";
    }
    public AutionQuery getQuery() {
        return query;
    }

    public void setQuery(AutionQuery query) {
        this.query = query;
    }

    public AuctionService getAuctionService() {
        return auctionService;
    }

    public void setAuctionService(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Auction> getList() {
        return list;
    }

    public void setList(List<Auction> list) {
        this.list = list;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }
}
