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
 * MasterStockin generated by hbm2java
 */
@Entity
@Table(name="master_stockin"
    ,catalog="e2rp"
)
public class MasterStockin  implements java.io.Serializable {


     private Integer MStockinId;
     private int companyId;
     private int divitionId;
     private int itemId;
     private BigDecimal quantity;
     private String unit;
     private Date mstkDate;
     private int wodtlsId;
     private String challanNo;
     private BigDecimal unitPrice;
     private BigDecimal totalPrice;
     private String c3;
     private String c4;
     private int c5;
     private Date inDt;
     private int createdBy;
     private Date createdDt;

    public MasterStockin() {
    }

	
    public MasterStockin(int companyId, int divitionId, int itemId, BigDecimal quantity, String unit, Date mstkDate, int wodtlsId, String challanNo, BigDecimal unitPrice, BigDecimal totalPrice, String c3, int c5, Date inDt, int createdBy, Date createdDt) {
        this.companyId = companyId;
        this.divitionId = divitionId;
        this.itemId = itemId;
        this.quantity = quantity;
        this.unit = unit;
        this.mstkDate = mstkDate;
        this.wodtlsId = wodtlsId;
        this.challanNo = challanNo;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.c3 = c3;
        this.c5 = c5;
        this.inDt = inDt;
        this.createdBy = createdBy;
        this.createdDt = createdDt;
    }
    public MasterStockin(int companyId, int divitionId, int itemId, BigDecimal quantity, String unit, Date mstkDate, int wodtlsId, String challanNo, BigDecimal unitPrice, BigDecimal totalPrice, String c3, String c4, int c5, Date inDt, int createdBy, Date createdDt) {
       this.companyId = companyId;
       this.divitionId = divitionId;
       this.itemId = itemId;
       this.quantity = quantity;
       this.unit = unit;
       this.mstkDate = mstkDate;
       this.wodtlsId = wodtlsId;
       this.challanNo = challanNo;
       this.unitPrice = unitPrice;
       this.totalPrice = totalPrice;
       this.c3 = c3;
       this.c4 = c4;
       this.c5 = c5;
       this.inDt = inDt;
       this.createdBy = createdBy;
       this.createdDt = createdDt;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="M_STOCKIN_ID", unique=true, nullable=false)
    public Integer getMStockinId() {
        return this.MStockinId;
    }
    
    public void setMStockinId(Integer MStockinId) {
        this.MStockinId = MStockinId;
    }

    
    @Column(name="COMPANY_ID", nullable=false)
    public int getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    
    @Column(name="DIVITION_ID", nullable=false)
    public int getDivitionId() {
        return this.divitionId;
    }
    
    public void setDivitionId(int divitionId) {
        this.divitionId = divitionId;
    }

    
    @Column(name="ITEM_ID", nullable=false)
    public int getItemId() {
        return this.itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    
    @Column(name="QUANTITY", nullable=false, precision=18)
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    
    @Column(name="UNIT", nullable=false, length=50)
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MSTK_DATE", nullable=false, length=19)
    public Date getMstkDate() {
        return this.mstkDate;
    }
    
    public void setMstkDate(Date mstkDate) {
        this.mstkDate = mstkDate;
    }

    
    @Column(name="WODTLS_ID", nullable=false)
    public int getWodtlsId() {
        return this.wodtlsId;
    }
    
    public void setWodtlsId(int wodtlsId) {
        this.wodtlsId = wodtlsId;
    }

    
    @Column(name="CHALLAN_NO", nullable=false, length=50)
    public String getChallanNo() {
        return this.challanNo;
    }
    
    public void setChallanNo(String challanNo) {
        this.challanNo = challanNo;
    }

    
    @Column(name="UNIT_PRICE", nullable=false, precision=18)
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    
    @Column(name="TOTAL_PRICE", nullable=false, precision=18)
    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    
    @Column(name="C3", nullable=false, length=50)
    public String getC3() {
        return this.c3;
    }
    
    public void setC3(String c3) {
        this.c3 = c3;
    }

    
    @Column(name="C4", length=50)
    public String getC4() {
        return this.c4;
    }
    
    public void setC4(String c4) {
        this.c4 = c4;
    }

    
    @Column(name="C5", nullable=false)
    public int getC5() {
        return this.c5;
    }
    
    public void setC5(int c5) {
        this.c5 = c5;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="IN_DT", nullable=false, length=19)
    public Date getInDt() {
        return this.inDt;
    }
    
    public void setInDt(Date inDt) {
        this.inDt = inDt;
    }

    
    @Column(name="CREATED_BY", nullable=false)
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
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


