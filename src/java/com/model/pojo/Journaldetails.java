package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Journaldetails generated by hbm2java
 */
@Entity
@Table(name="journaldetails"
    ,catalog="e2rp"
)
public class Journaldetails  implements java.io.Serializable {


     private JournaldetailsId id;
     private String jouByorto;
     private String jouNature;
     private String jouParticulars;
     private int jouAccId;
     private BigDecimal jouDramount;
     private BigDecimal jouCramount;

    public Journaldetails() {
    }

	
    public Journaldetails(JournaldetailsId id, String jouByorto, String jouNature, String jouParticulars, int jouAccId) {
        this.id = id;
        this.jouByorto = jouByorto;
        this.jouNature = jouNature;
        this.jouParticulars = jouParticulars;
        this.jouAccId = jouAccId;
    }
    public Journaldetails(JournaldetailsId id, String jouByorto, String jouNature, String jouParticulars, int jouAccId, BigDecimal jouDramount, BigDecimal jouCramount) {
       this.id = id;
       this.jouByorto = jouByorto;
       this.jouNature = jouNature;
       this.jouParticulars = jouParticulars;
       this.jouAccId = jouAccId;
       this.jouDramount = jouDramount;
       this.jouCramount = jouCramount;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="jouDtlid", column=@Column(name="JOU_DTLID", nullable=false) ), 
        @AttributeOverride(name="jouId", column=@Column(name="JOU_ID", nullable=false) ) } )
    public JournaldetailsId getId() {
        return this.id;
    }
    
    public void setId(JournaldetailsId id) {
        this.id = id;
    }

    
    @Column(name="JOU_BYORTO", nullable=false, length=20)
    public String getJouByorto() {
        return this.jouByorto;
    }
    
    public void setJouByorto(String jouByorto) {
        this.jouByorto = jouByorto;
    }

    
    @Column(name="JOU_NATURE", nullable=false, length=50)
    public String getJouNature() {
        return this.jouNature;
    }
    
    public void setJouNature(String jouNature) {
        this.jouNature = jouNature;
    }

    
    @Column(name="JOU_PARTICULARS", nullable=false, length=50)
    public String getJouParticulars() {
        return this.jouParticulars;
    }
    
    public void setJouParticulars(String jouParticulars) {
        this.jouParticulars = jouParticulars;
    }

    
    @Column(name="JOU_ACC_ID", nullable=false)
    public int getJouAccId() {
        return this.jouAccId;
    }
    
    public void setJouAccId(int jouAccId) {
        this.jouAccId = jouAccId;
    }

    
    @Column(name="JOU_DRAMOUNT", precision=18)
    public BigDecimal getJouDramount() {
        return this.jouDramount;
    }
    
    public void setJouDramount(BigDecimal jouDramount) {
        this.jouDramount = jouDramount;
    }

    
    @Column(name="JOU_CRAMOUNT", precision=18)
    public BigDecimal getJouCramount() {
        return this.jouCramount;
    }
    
    public void setJouCramount(BigDecimal jouCramount) {
        this.jouCramount = jouCramount;
    }




}


