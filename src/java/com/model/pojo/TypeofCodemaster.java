package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TypeofCodemaster generated by hbm2java
 */
@Entity
@Table(name="typeof_codemaster"
    ,catalog="e2rp"
)
public class TypeofCodemaster  implements java.io.Serializable {


     private Integer tocmasId;
     private String tocmasDescr;
     private String tocmasTablename;
     private String tocmasFieldname;
     private String tocmasTocfieldname;

    public TypeofCodemaster() {
    }

    public TypeofCodemaster(String tocmasDescr, String tocmasTablename, String tocmasFieldname, String tocmasTocfieldname) {
       this.tocmasDescr = tocmasDescr;
       this.tocmasTablename = tocmasTablename;
       this.tocmasFieldname = tocmasFieldname;
       this.tocmasTocfieldname = tocmasTocfieldname;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="TOCMAS_ID", unique=true, nullable=false)
    public Integer getTocmasId() {
        return this.tocmasId;
    }
    
    public void setTocmasId(Integer tocmasId) {
        this.tocmasId = tocmasId;
    }

    
    @Column(name="TOCMAS_DESCR", nullable=false, length=50)
    public String getTocmasDescr() {
        return this.tocmasDescr;
    }
    
    public void setTocmasDescr(String tocmasDescr) {
        this.tocmasDescr = tocmasDescr;
    }

    
    @Column(name="TOCMAS_TABLENAME", nullable=false, length=50)
    public String getTocmasTablename() {
        return this.tocmasTablename;
    }
    
    public void setTocmasTablename(String tocmasTablename) {
        this.tocmasTablename = tocmasTablename;
    }

    
    @Column(name="TOCMAS_FIELDNAME", nullable=false, length=50)
    public String getTocmasFieldname() {
        return this.tocmasFieldname;
    }
    
    public void setTocmasFieldname(String tocmasFieldname) {
        this.tocmasFieldname = tocmasFieldname;
    }

    
    @Column(name="TOCMAS_TOCFIELDNAME", nullable=false, length=50)
    public String getTocmasTocfieldname() {
        return this.tocmasTocfieldname;
    }
    
    public void setTocmasTocfieldname(String tocmasTocfieldname) {
        this.tocmasTocfieldname = tocmasTocfieldname;
    }




}


