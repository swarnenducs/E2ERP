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
 * Studentattendence generated by hbm2java
 */
@Entity
@Table(name="studentattendence"
    ,catalog="e2rp"
)
public class Studentattendence  implements java.io.Serializable {


     private Integer attendanceId;
     private int classId;
     private String section;
     private int studentId;
     private int subjectId;
     private int teacherId;
     private int attendancestatus;
     private String attenDate;
     private int createdBy;
     private Date createdon;

    public Studentattendence() {
    }

	
    public Studentattendence(int classId, String section, int studentId, int subjectId, int teacherId, int attendancestatus, String attenDate, int createdBy) {
        this.classId = classId;
        this.section = section;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.teacherId = teacherId;
        this.attendancestatus = attendancestatus;
        this.attenDate = attenDate;
        this.createdBy = createdBy;
    }
    public Studentattendence(int classId, String section, int studentId, int subjectId, int teacherId, int attendancestatus, String attenDate, int createdBy, Date createdon) {
       this.classId = classId;
       this.section = section;
       this.studentId = studentId;
       this.subjectId = subjectId;
       this.teacherId = teacherId;
       this.attendancestatus = attendancestatus;
       this.attenDate = attenDate;
       this.createdBy = createdBy;
       this.createdon = createdon;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ATTENDANCE_ID", unique=true, nullable=false)
    public Integer getAttendanceId() {
        return this.attendanceId;
    }
    
    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    
    @Column(name="CLASS_ID", nullable=false)
    public int getClassId() {
        return this.classId;
    }
    
    public void setClassId(int classId) {
        this.classId = classId;
    }

    
    @Column(name="SECTION", nullable=false, length=50)
    public String getSection() {
        return this.section;
    }
    
    public void setSection(String section) {
        this.section = section;
    }

    
    @Column(name="STUDENT_ID", nullable=false)
    public int getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    
    @Column(name="ATTENDANCESTATUS", nullable=false)
    public int getAttendancestatus() {
        return this.attendancestatus;
    }
    
    public void setAttendancestatus(int attendancestatus) {
        this.attendancestatus = attendancestatus;
    }

    
    @Column(name="ATTEN_DATE", nullable=false, length=50)
    public String getAttenDate() {
        return this.attenDate;
    }
    
    public void setAttenDate(String attenDate) {
        this.attenDate = attenDate;
    }

    
    @Column(name="CREATED_BY", nullable=false)
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CREATEDON", length=10)
    public Date getCreatedon() {
        return this.createdon;
    }
    
    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }




}

