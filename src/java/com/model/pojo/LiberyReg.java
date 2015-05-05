package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LiberyReg generated by hbm2java
 */
@Entity
@Table(name="libery_reg"
    ,catalog="e2rp"
)
public class LiberyReg  implements java.io.Serializable {


     private Integer libregSlid;
     private String libCardNo;
     private int memtypeId;
     private int studentId;
     private int empId;

    public LiberyReg() {
    }

	
    public LiberyReg(int memtypeId, int studentId, int empId) {
        this.memtypeId = memtypeId;
        this.studentId = studentId;
        this.empId = empId;
    }
    public LiberyReg(String libCardNo, int memtypeId, int studentId, int empId) {
       this.libCardNo = libCardNo;
       this.memtypeId = memtypeId;
       this.studentId = studentId;
       this.empId = empId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="LIBREG_SLID", unique=true, nullable=false)
    public Integer getLibregSlid() {
        return this.libregSlid;
    }
    
    public void setLibregSlid(Integer libregSlid) {
        this.libregSlid = libregSlid;
    }

    
    @Column(name="LIB_CARD_NO", length=20)
    public String getLibCardNo() {
        return this.libCardNo;
    }
    
    public void setLibCardNo(String libCardNo) {
        this.libCardNo = libCardNo;
    }

    
    @Column(name="MEMTYPE_ID", nullable=false)
    public int getMemtypeId() {
        return this.memtypeId;
    }
    
    public void setMemtypeId(int memtypeId) {
        this.memtypeId = memtypeId;
    }

    
    @Column(name="STUDENT_ID", nullable=false)
    public int getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    
    @Column(name="EMP_ID", nullable=false)
    public int getEmpId() {
        return this.empId;
    }
    
    public void setEmpId(int empId) {
        this.empId = empId;
    }




}


