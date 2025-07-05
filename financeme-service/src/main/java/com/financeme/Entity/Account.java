package com.financeme.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    private Long accountNo;
    private String holderName;
    private String policyName;
    private Double premiumAmount;

    // Default constructor (needed by JPA)
    public Account() {
    }

    // Constructor with fields (optional)
    public Account(Long accountNo, String holderName, String policyName, Double premiumAmount) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.policyName = policyName;
        this.premiumAmount = premiumAmount;
    }

    // Getters and setters (mandatory for your error)
    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public Double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(Double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }
}
