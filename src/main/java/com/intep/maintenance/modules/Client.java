package com.intep.maintenance.modules;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String siteAddress;
    private Integer siteFrequency;
    private String responseTime;
    private String endOfLicence;
    private Integer maintenanceFee;
    private String paymentAgreement;


    public Client(String name, String siteAddress, Integer siteFrequency, String responseTime, String endOfLicence, Integer maintenanceFee, String paymentAgreement) {
        this.name = name;
        this.siteAddress = siteAddress;
        this.siteFrequency = siteFrequency;
        this.responseTime = responseTime;
        this.endOfLicence = endOfLicence;
        this.maintenanceFee = maintenanceFee;
        this.paymentAgreement = paymentAgreement;
    }

    public Client() {
        this.name = "default";
        this.siteAddress = "default";
        this.siteFrequency = 1;
        this.responseTime = "default";
        this.endOfLicence = "default";
        this.maintenanceFee = 0;
        this.paymentAgreement = "default";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    public Integer getSiteFrequency() {
        return siteFrequency;
    }

    public void setSiteFrequency(Integer siteFrequency) {
        this.siteFrequency = siteFrequency;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getEndOfLicence() {
        return endOfLicence;
    }

    public void setEndOfLicence(String endOfLicence) {
        this.endOfLicence = endOfLicence;
    }

    public Integer getMaintenanceFee() {
        return maintenanceFee;
    }

    public void setMaintenanceFee(Integer maintenanceFee) {
        this.maintenanceFee = maintenanceFee;
    }

    public String getPaymentAgreement() {
        return paymentAgreement;
    }

    public void setPaymentAgreement(String paymentAgreement) {
        this.paymentAgreement = paymentAgreement;
    }
}