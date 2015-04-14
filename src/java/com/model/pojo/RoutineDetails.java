package com.model.pojo;
// Generated 13 Apr, 2015 11:03:03 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RoutineDetails generated by hbm2java
 */
@Entity
@Table(name="routine_details"
    ,catalog="e2rp"
)
public class RoutineDetails  implements java.io.Serializable {


     private Integer rdId;
     private RoutineMaster routineMaster;
     private String day;
     private String period;
     private int subjectId;
     private int teacherId;
     private int createdBy;
     private Date createdOn;
     private String rdIsactive;

    public RoutineDetails() {
    }

    public RoutineDetails(RoutineMaster routineMaster, String day, String period, int subjectId, int teacherId, int createdBy, Date createdOn, String rdIsactive) {
       this.routineMaster = routineMaster;
       this.day = day;
       this.period = period;
       this.subjectId = subjectId;
       this.teacherId = teacherId;
       this.createdBy = createdBy;
       this.createdOn = createdOn;
       this.rdIsactive = rdIsactive;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="RD_ID", unique=true, nullable=false)
    public Integer getRdId() {
        return this.rdId;
    }
    
    public void setRdId(Integer rdId) {
        this.rdId = rdId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RM_ID", nullable=false)
    public RoutineMaster getRoutineMaster() {
        return this.routineMaster;
    }
    
    public void setRoutineMaster(RoutineMaster routineMaster) {
        this.routineMaster = routineMaster;
    }

    
    @Column(name="DAY", nullable=false, length=20)
    public String getDay() {
        return this.day;
    }
    
    public void setDay(String day) {
        this.day = day;
    }

    
    @Column(name="PERIOD", nullable=false, length=20)
    public String getPeriod() {
        return this.period;
    }
    
    public void setPeriod(String period) {
        this.period = period;
    }

    
    @Column(name="SUBJECT_ID", nullable=false)
    public int getSubjectId() {
        return this.subjectId;
    }
    
    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    
    @Column(name="TEACHER_ID", nullable=false)
    public int getTeacherId() {
        return this.teacherId;
    }
    
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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

    
    @Column(name="RD_ISACTIVE", nullable=false, length=10)
    public String getRdIsactive() {
        return this.rdIsactive;
    }
    
    public void setRdIsactive(String rdIsactive) {
        this.rdIsactive = rdIsactive;
    }




}

