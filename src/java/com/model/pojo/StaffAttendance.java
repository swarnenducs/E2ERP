package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


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
 * StaffAttendance generated by hbm2java
 */
@Entity
@Table(name="staff_attendance"
    ,catalog="e2rp"
)
public class StaffAttendance  implements java.io.Serializable {


     private Integer attenId;
     private int staffId;
     private Date attenDate;
     private int attendancestatus;
     private int leaveStatuts;

    public StaffAttendance() {
    }

    public StaffAttendance(int staffId, Date attenDate, int attendancestatus, int leaveStatuts) {
       this.staffId = staffId;
       this.attenDate = attenDate;
       this.attendancestatus = attendancestatus;
       this.leaveStatuts = leaveStatuts;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ATTEN_ID", unique=true, nullable=false)
    public Integer getAttenId() {
        return this.attenId;
    }
    
    public void setAttenId(Integer attenId) {
        this.attenId = attenId;
    }

    
    @Column(name="STAFF_ID", nullable=false)
    public int getStaffId() {
        return this.staffId;
    }
    
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ATTEN_DATE", nullable=false, length=19)
    public Date getAttenDate() {
        return this.attenDate;
    }
    
    public void setAttenDate(Date attenDate) {
        this.attenDate = attenDate;
    }

    
    @Column(name="ATTENDANCESTATUS", nullable=false)
    public int getAttendancestatus() {
        return this.attendancestatus;
    }
    
    public void setAttendancestatus(int attendancestatus) {
        this.attendancestatus = attendancestatus;
    }

    
    @Column(name="LEAVE_STATUTS", nullable=false)
    public int getLeaveStatuts() {
        return this.leaveStatuts;
    }
    
    public void setLeaveStatuts(int leaveStatuts) {
        this.leaveStatuts = leaveStatuts;
    }




}


