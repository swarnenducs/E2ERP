package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ReceiptdetailsId generated by hbm2java
 */
@Embeddable
public class ReceiptdetailsId  implements java.io.Serializable {


     private int recDtlid;
     private int recId;

    public ReceiptdetailsId() {
    }

    public ReceiptdetailsId(int recDtlid, int recId) {
       this.recDtlid = recDtlid;
       this.recId = recId;
    }
   


    @Column(name="REC_DTLID", nullable=false)
    public int getRecDtlid() {
        return this.recDtlid;
    }
    
    public void setRecDtlid(int recDtlid) {
        this.recDtlid = recDtlid;
    }


    @Column(name="REC_ID", nullable=false)
    public int getRecId() {
        return this.recId;
    }
    
    public void setRecId(int recId) {
        this.recId = recId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ReceiptdetailsId) ) return false;
		 ReceiptdetailsId castOther = ( ReceiptdetailsId ) other; 
         
		 return (this.getRecDtlid()==castOther.getRecDtlid())
 && (this.getRecId()==castOther.getRecId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getRecDtlid();
         result = 37 * result + this.getRecId();
         return result;
   }   


}


