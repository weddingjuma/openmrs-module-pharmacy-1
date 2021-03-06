package org.openmrs.module.pharmacy.api.OtherModels;

import org.openmrs.BaseOpenmrsObject;
import org.openmrs.module.pharmacy.Pharmacy;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kinyua on 5/27/15.
 */
public class DispenseDrug extends BaseOpenmrsObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private  Integer id;
    private Integer patientID;
    private Date dateOfDispense;
    private Integer drugId;
    private int unitsDispensed;
    private Integer transactionId;
    private boolean paymentStatus;
    private boolean issueStatus;
    private String comments;

    private Pharmacy pharmacy;

    public boolean isIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(boolean issueStatus) {
        this.issueStatus = issueStatus;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public Date getDateOfDispense() {
        return dateOfDispense;
    }

    public void setDateOfDispense(Date dateOfDispense) {
        this.dateOfDispense = dateOfDispense;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public int getUnitsDispensed() {
        return unitsDispensed;
    }

    public void setUnitsDispensed(int unitsDispensed) {
        this.unitsDispensed = unitsDispensed;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id= id;
    }
}