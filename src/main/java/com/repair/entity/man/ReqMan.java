package com.repair.entity.man;

import java.math.BigInteger;

public class ReqMan {
    private Integer jobNumber;
    private String name;
    private String office;
    private BigInteger phone;

    public ReqMan() {
    }

    public ReqMan(Integer jobNumber, String name, String office, BigInteger phone) {
        this.jobNumber = jobNumber;
        this.name = name;
        this.office = office;
        this.phone = phone;
    }

    public Integer getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(Integer jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }
}
