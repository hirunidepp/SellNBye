//package com.sellNBye.model;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import java.util.Date;
//
//@Entity
//public class Buying {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column(name = "payment_id")
//    @NotNull
//    private Payment payment;
//
//    @Column(name = "uId")
//    @NotNull
//    private User user;
//
//    @Column(name = "adId")
//    @NotNull
//    private Advertisment advertisment;
//
//    @Column(name = "bought_date")
//    @NotNull
//    private Date boughtDate;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Payment getPayment() {
//        return payment;
//    }
//
//    public void setPayment(Payment payment) {
//        this.payment = payment;
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
//    public Advertisment getAdvertisment() {
//        return advertisment;
//    }
//
//    public void setAdvertisment(Advertisment advertisment) {
//        this.advertisment = advertisment;
//    }
//
//    public Date getBoughtDate() {
//        return boughtDate;
//    }
//
//    public void setBoughtDate(Date boughtDate) {
//        this.boughtDate = boughtDate;
//    }
//}
