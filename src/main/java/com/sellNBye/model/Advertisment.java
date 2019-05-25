//package com.sellNBye.model;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import java.util.Date;
//
//@Entity
//public class Advertisment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    @Column(name = "pub_date")
//    @NotNull
//    private Date pubDate;
//
//    @Column(name = "uId")
//    @NotNull
//    private User user;
//
//    @Column(name = "ad_desc", length = 128)
//    private String adDesc;
//
//    @Column(name = "imgs_links", length = 512)
//    private String imgsLinks;
//
//    public long getAdId() {
//        return id;
//    }
//
//    public void setAdId(long adId) {
//        this.id = adId;
//    }
//
//    public Date getPubDate() {
//        return pubDate;
//    }
//
//    public void setPubDate(Date pubDate) {
//        this.pubDate = pubDate;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public String getAdDesc() {
//        return adDesc;
//    }
//
//    public void setAdDesc(String adDesc) {
//        this.adDesc = adDesc;
//    }
//
//    public String getImgsLinks() {
//        return imgsLinks;
//    }
//
//    public void setImgsLinks(String imgsLinks) {
//        this.imgsLinks = imgsLinks;
//    }
//}
