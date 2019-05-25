//package com.sellNBye.model;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import java.util.Date;
//
//@Entity
//public class ShoppingCart {
//
//    @Id
//    @Column(name = "uId")
//    private User user;
//
//    @Id
//    @Column(name = "item_id")
//    private Item item;
//
//    @Column(name = "added_date")
//    @NotNull
//    private Date addedDate;
//
//    @Column(name = "qty")
//    @NotNull
//    private Integer qty;
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Item getItem() {
//        return item;
//    }
//
//    public void setItem(Item item) {
//        this.item = item;
//    }
//
//    public Date getAddedDate() {
//        return addedDate;
//    }
//
//    public void setAddedDate(Date addedDate) {
//        this.addedDate = addedDate;
//    }
//
//    public Integer getQty() {
//        return qty;
//    }
//
//    public void setQty(Integer qty) {
//        this.qty = qty;
//    }
//}
