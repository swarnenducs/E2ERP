package com.model.pojo;
// Generated 13 Apr, 2015 11:03:03 PM by Hibernate Tools 4.3.1


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
 * Advertisement generated by hbm2java
 */
@Entity
@Table(name="advertisement"
    ,catalog="e2rp"
)
public class Advertisement  implements java.io.Serializable {


     private Integer serialAdId;
     private String adDetail;
     private int adPostId;
     private int createdBy;
     private Date createdOn;
     private String adIsactive;

    public Advertisement() {
    }

    public Advertisement(String adDetail, int adPostId, int createdBy, Date createdOn, String adIsactive) {
       this.adDetail = adDetail;
       this.adPostId = adPostId;
       this.createdBy = createdBy;
       this.createdOn = createdOn;
       this.adIsactive = adIsactive;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="SERIAL_AD_ID", unique=true, nullable=false)
    public Integer getSerialAdId() {
        return this.serialAdId;
    }
    
    public void setSerialAdId(Integer serialAdId) {
        this.serialAdId = serialAdId;
    }

    
    @Column(name="AD_DETAIL", nullable=false, length=4000)
    public String getAdDetail() {
        return this.adDetail;
    }
    
    public void setAdDetail(String adDetail) {
        this.adDetail = adDetail;
    }

    
    @Column(name="AD_POST_ID", nullable=false)
    public int getAdPostId() {
        return this.adPostId;
    }
    
    public void setAdPostId(int adPostId) {
        this.adPostId = adPostId;
    }

    
    @Column(name="CREATED_BY", nullable=false)
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED_ON", nullable=false, length=19)
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    
    @Column(name="AD_ISACTIVE", nullable=false, length=50)
    public String getAdIsactive() {
        return this.adIsactive;
    }
    
    public void setAdIsactive(String adIsactive) {
        this.adIsactive = adIsactive;
    }




}

