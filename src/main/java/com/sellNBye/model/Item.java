//package com.sellNBye.model;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//
//@Entity
//public class Item {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column(name = "item_desc", length = 128)
//    private String itemDesc;
//
//    @Column(name = "ad_id")
//    @NotNull
//    private Advertisment advertisment;
//
//    @Column(name = "tot_qty")
//    @NotNull
//    private int totQty;
//
//    @Column(name = "avail_qty")
//    @NotNull
//    private int availQty;
//
//    @Column(name = "price")
//    @NotNull
//    private Double price;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getItemDesc() {
//        return itemDesc;
//    }
//
//    public void setItemDesc(String itemDesc) {
//        this.itemDesc = itemDesc;
//    }
//
//    public Advertisment getAdvertisment() {
//        return advertisment;
//    }
//
//    public void setAdvertisment(Advertisment advertisment) {
//        this.advertisment = advertisment;
//    }
//
//    public int getTotQty() {
//        return totQty;
//    }
//
//    public void setTotQty(int totQty) {
//        this.totQty = totQty;
//    }
//
//    public int getAvailQty() {
//        return availQty;
//    }
//
//    public void setAvailQty(int availQty) {
//        this.availQty = availQty;
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//}
