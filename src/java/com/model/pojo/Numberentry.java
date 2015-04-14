package com.model.pojo;
// Generated 13 Apr, 2015 11:03:03 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Numberentry generated by hbm2java
 */
@Entity
@Table(name="numberentry"
    ,catalog="e2rp"
)
public class Numberentry  implements java.io.Serializable {


     private Integer marksId;
     private String examType;
     private String stream;
     private String section;
     private String academicYear;
     private String className;
     private String roll;
     private String subjectName;
     private int subjectId;
     private String totalMarks;
     private String obtainMarks;

    public Numberentry() {
    }

    public Numberentry(String examType, String stream, String section, String academicYear, String className, String roll, String subjectName, int subjectId, String totalMarks, String obtainMarks) {
       this.examType = examType;
       this.stream = stream;
       this.section = section;
       this.academicYear = academicYear;
       this.className = className;
       this.roll = roll;
       this.subjectName = subjectName;
       this.subjectId = subjectId;
       this.totalMarks = totalMarks;
       this.obtainMarks = obtainMarks;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="MARKS_ID", unique=true, nullable=false)
    public Integer getMarksId() {
        return this.marksId;
    }
    
    public void setMarksId(Integer marksId) {
        this.marksId = marksId;
    }

    
    @Column(name="EXAM_TYPE", nullable=false, length=50)
    public String getExamType() {
        return this.examType;
    }
    
    public void setExamType(String examType) {
        this.examType = examType;
    }

    
    @Column(name="STREAM", nullable=false, length=50)
    public String getStream() {
        return this.stream;
    }
    
    public void setStream(String stream) {
        this.stream = stream;
    }

    
    @Column(name="SECTION", nullable=false, length=50)
    public String getSection() {
        return this.section;
    }
    
    public void setSection(String section) {
        this.section = section;
    }

    
    @Column(name="ACADEMIC_YEAR", nullable=false, length=50)
    public String getAcademicYear() {
        return this.academicYear;
    }
    
    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    
    @Column(name="CLASS_NAME", nullable=false, length=50)
    public String getClassName() {
        return this.className;
    }
    
    public void setClassName(String className) {
        this.className = className;
    }

    
    @Column(name="ROLL", nullable=false, length=50)
    public String getRoll() {
        return this.roll;
    }
    
    public void setRoll(String roll) {
        this.roll = roll;
    }

    
    @Column(name="SUBJECT_NAME", nullable=false, length=50)
    public String getSubjectName() {
        return this.subjectName;
    }
    
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    
    @Column(name="SUBJECT_ID", nullable=false)
    public int getSubjectId() {
        return this.subjectId;
    }
    
    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    
    @Column(name="TOTAL_MARKS", nullable=false, length=50)
    public String getTotalMarks() {
        return this.totalMarks;
    }
    
    public void setTotalMarks(String totalMarks) {
        this.totalMarks = totalMarks;
    }

    
    @Column(name="OBTAIN_MARKS", nullable=false, length=50)
    public String getObtainMarks() {
        return this.obtainMarks;
    }
    
    public void setObtainMarks(String obtainMarks) {
        this.obtainMarks = obtainMarks;
    }




}


