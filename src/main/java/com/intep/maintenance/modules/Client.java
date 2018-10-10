package com.intep.maintenance.modules;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;

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
    private LocalDate lastMaintenance;
    private boolean heating = false;
    private boolean cooling = false;

    public Client(String name, String product, String siteAddress, Integer siteFrequency, String responseTime,
    		String endOfLicence, Integer maintenanceFee, String paymentAgreement, String comment, LocalDate lastMaintenance) {
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
        this.heating = false;
        this.cooling = false;
    }

    public Client() throws ParseException {
        this.name = "default";
        this.product = "default";
        this.siteAddress = "default";
        this.siteFrequency = 1;
        this.responseTime = "default";
        this.endOfLicence = "default";
        this.maintenanceFee = 0;
        this.paymentAgreement = "default";
        this.comment = "default";
        this.lastMaintenance = LocalDate.now();
        this.heating = false;
        this.cooling = false;
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
        this.heating = updatedClient.heating;
        this.cooling = updatedClient.cooling;
    }
    
    public boolean isItDue () throws ParseException {
    	double dueTime = this.siteFrequency * 15;
    	LocalDate currentDate = LocalDate.now();
    	if (lastMaintenance.getMonthValue() <= currentDate.getMonthValue() && Math.abs(lastMaintenance.getDayOfMonth() - currentDate.getDayOfMonth()) >= dueTime) {
    		return true;
    	} else { 		
    		return false;
    	}
    }

	public String getLastMaintenance() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return formatter.format(lastMaintenance);
	}

	public void setLastMaintenance(String lastMaintenance) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
		this.lastMaintenance = LocalDate.parse(lastMaintenance, formatter);
	}

	public boolean isHeating() {
		return heating;
	}

	public void setHeating(boolean heating) {
		this.heating = heating;
	}
	
	public boolean isCooling() {
		return cooling;
	}

	public void setCooling(boolean cooling) {
		this.cooling = cooling;
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