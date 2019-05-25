package com.sellNBye.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence", sequenceName = "USER_SEQ")
    private Long id;

    @Column(name = "name", length = 128)
    @NotNull
    private String name;

    @Column(name = "address", length = 128)
    @NotNull
    private String address;

    @Column(name = "tel", length = 20, unique = true)
    @NotNull
    private String tel;

    @Column(name = "email", length = 50, unique = true)
    @NotNull
    private String email;

    @Column(name = "uname", length = 20, unique = true)
    @NotNull
    private String uname;

    @Column(name = "pw", length = 50)
    @NotNull
    private String pw;

    @Column(name = "is_valid")
    @NotNull
    private Boolean isValid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean valid) {
        isValid = valid;
    }
}
