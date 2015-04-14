package com.model.pojo;
// Generated 13 Apr, 2015 11:03:03 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * WorkorderPurchase generated by hbm2java
 */
@Entity
@Table(name="workorder_purchase"
    ,catalog="e2rp"
)
public class WorkorderPurchase  implements java.io.Serializable {


     private Integer slNo;
     private int compId;
     private int divId;
     private int ledgerId;
     private int itemId;
     private String workorderNo;
     private String invoiceNo;
     private Date invoiceDate;
     private Date receivedDate;
     private BigDecimal grossAmount;
     private BigDecimal taxAmount;
     private BigDecimal roundOff;
     private BigDecimal othersAmount;
     private BigDecimal netAmount;
     private String narration;
     private Integer createdBy;
     private Date createdDt;

    public WorkorderPurchase() {
    }

	
    public WorkorderPurchase(int compId, int divId, int ledgerId, int itemId, String workorderNo, String invoiceNo, Date invoiceDate, Date receivedDate, BigDecimal grossAmount, BigDecimal taxAmount, BigDecimal netAmount, Date createdDt) {
        this.compId = compId;
        this.divId = divId;
        this.ledgerId = ledgerId;
        this.itemId = itemId;
        this.workorderNo = workorderNo;
        this.invoiceNo = invoiceNo;
        this.invoiceDate = invoiceDate;
        this.receivedDate = receivedDate;
        this.grossAmount = grossAmount;
        this.taxAmount = taxAmount;
        this.netAmount = netAmount;
        this.createdDt = createdDt;
    }
    public WorkorderPurchase(int compId, int divId, int ledgerId, int itemId, String workorderNo, String invoiceNo, Date invoiceDate, Date receivedDate, BigDecimal grossAmount, BigDecimal taxAmount, BigDecimal roundOff, BigDecimal othersAmount, BigDecimal netAmount, String narration, Integer createdBy, Date createdDt) {
       this.compId = compId;
       this.divId = divId;
       this.ledgerId = ledgerId;
       this.itemId = itemId;
       this.workorderNo = workorderNo;
       this.invoiceNo = invoiceNo;
       this.invoiceDate = invoiceDate;
       this.receivedDate = receivedDate;
       this.grossAmount = grossAmount;
       this.taxAmount = taxAmount;
       this.roundOff = roundOff;
       this.othersAmount = othersAmount;
       this.netAmount = netAmount;
       this.narration = narration;
       this.createdBy = createdBy;
       this.createdDt = createdDt;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="SL_NO", unique=true, nullable=false)
    public Integer getSlNo() {
        return this.slNo;
    }
    
    public void setSlNo(Integer slNo) {
        this.slNo = slNo;
    }

    
    @Column(name="COMP_ID", nullable=false)
    public int getCompId() {
        return this.compId;
    }
    
    public void setCompId(int compId) {
        this.compId = compId;
    }

    
    @Column(name="DIV_ID", nullable=false)
    public int getDivId() {
        return this.divId;
    }
    
    public void setDivId(int divId) {
        this.divId = divId;
    }

    
    @Column(name="LEDGER_ID", nullable=false)
    public int getLedgerId() {
        return this.ledgerId;
    }
    
    public void setLedgerId(int ledgerId) {
        this.ledgerId = ledgerId;
    }

    
    @Column(name="ITEM_ID", nullable=false)
    public int getItemId() {
        return this.itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    
    @Column(name="WORKORDER_NO", nullable=false, length=50)
    public String getWorkorderNo() {
        return this.workorderNo;
    }
    
    public void setWorkorderNo(String workorderNo) {
        this.workorderNo = workorderNo;
    }

    
    @Column(name="INVOICE_NO", nullable=false, length=50)
    public String getInvoiceNo() {
        return this.invoiceNo;
    }
    
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="INVOICE_DATE", nullable=false, length=19)
    public Date getInvoiceDate() {
        return this.invoiceDate;
    }
    
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECEIVED_DATE", nullable=false, length=19)
    public Date getReceivedDate() {
        return this.receivedDate;
    }
    
    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    
    @Column(name="GROSS_AMOUNT", nullable=false, precision=18)
    public BigDecimal getGrossAmount() {
        return this.grossAmount;
    }
    
    public void setGrossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
    }

    
    @Column(name="TAX_AMOUNT", nullable=false, precision=18)
    public BigDecimal getTaxAmount() {
        return this.taxAmount;
    }
    
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    
    @Column(name="ROUND_OFF", precision=18)
    public BigDecimal getRoundOff() {
        return this.roundOff;
    }
    
    public void setRoundOff(BigDecimal roundOff) {
        this.roundOff = roundOff;
    }

    
    @Column(name="OTHERS_AMOUNT", precision=18)
    public BigDecimal getOthersAmount() {
        return this.othersAmount;
    }
    
    public void setOthersAmount(BigDecimal othersAmount) {
        this.othersAmount = othersAmount;
    }

    
    @Column(name="NET_AMOUNT", nullable=false, precision=18)
    public BigDecimal getNetAmount() {
        return this.netAmount;
    }
    
    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    
    @Column(name="NARRATION", length=50)
    public String getNarration() {
        return this.narration;
    }
    
    public void setNarration(String narration) {
        this.narration = narration;
    }

    
    @Column(name="CREATED_BY")
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED_DT", nullable=false, length=19)
    public Date getCreatedDt() {
        return this.createdDt;
    }
    
    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }




}

