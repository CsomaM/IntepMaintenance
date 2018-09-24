package com.intep.maintenance.modules;

import java.util.Date;

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
    private String product;
    private String siteAddress;
    private Integer siteFrequency;
    private String responseTime;
    private String endOfLicence;
    private Integer maintenanceFee;
    private String paymentAgreement;
    private String comment;
    private Date lastMaintenance;
    private boolean isHeating;
    private boolean isCooling;
    private boolean isPendingMaintenance;


    public Client(String name, String product, String siteAddress, Integer siteFrequency, String responseTime,
    		String endOfLicence, Integer maintenanceFee, String paymentAgreement, String comment, Date lastMaintenance,
    		boolean isHeating, boolean isCooling, boolean isPendingMaintenance) {
        this.name = name;
        this.product = product;
        this.siteAddress = siteAddress;
        this.siteFrequency = siteFrequency;
        this.responseTime = responseTime;
        this.endOfLicence = endOfLicence;
        this.maintenanceFee = maintenanceFee;
        this.paymentAgreement = paymentAgreement;
        this.lastMaintenance = lastMaintenance;
        this.comment = comment;
        this.isHeating = isHeating;
        this.isCooling = isCooling;
        this.isPendingMaintenance = isPendingMaintenance;
    }

    public Client() {
        this.name = "default";
        this.product = "default";
        this.siteAddress = "default";
        this.siteFrequency = 1;
        this.responseTime = "default";
        this.endOfLicence = "default";
        this.maintenanceFee = 0;
        this.paymentAgreement = "default";
        this.comment = "default";
        this.lastMaintenance = new Date();
        this.isHeating = false;
        this.isCooling = false;
        this.isPendingMaintenance = false;
    }

    public void updateClient(Client updatedClient) {
        this.name = updatedClient.name;
        this.siteAddress = updatedClient.siteAddress;
        this.siteFrequency = updatedClient.siteFrequency;
        this.responseTime = updatedClient.responseTime;
        this.endOfLicence = updatedClient.endOfLicence;
        this.maintenanceFee = updatedClient.maintenanceFee;
        this.paymentAgreement = updatedClient.paymentAgreement;
        this.lastMaintenance = updatedClient.lastMaintenance;
        this.comment = updatedClient.comment;
        this.isHeating = updatedClient.isHeating;
        this.isCooling = updatedClient.isCooling;
        this.isPendingMaintenance = updatedClient.isPendingMaintenance;
    }
    
    

    public Date getLastMaintenance() {
		return lastMaintenance;
	}

	public void setLastMaintenance(Date lastMaintenance) {
		this.lastMaintenance = lastMaintenance;
	}

	public boolean isHeating() {
		return isHeating;
	}

	public void setHeating(boolean heating) {
		this.isHeating = heating;
	}

	public boolean isCooling() {
		return isCooling;
	}

	public void setCooling(boolean cooling) {
		this.isCooling = cooling;
	}

	public boolean isPendingMaintenance() {
		return isPendingMaintenance;
	}

	public void setPendingMaintenance(boolean pendingMaintenance) {
		this.isPendingMaintenance = pendingMaintenance;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setId(Long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
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