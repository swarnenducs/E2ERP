package com.model.pojo;
// Generated 13 Apr, 2015 11:03:03 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Itemmaster generated by hbm2java
 */
@Entity
@Table(name="itemmaster"
    ,catalog="e2rp"
)
public class Itemmaster  implements java.io.Serializable {


     private Integer itemId;
     private String itemCode;
     private String itemName;
     private String itemType;
     private int itemSuppid;
     private String itemDescr;
     private String itemSize;
     private String itemUom;
     private int itemCreatedby;
     private Date itemCreateddt;
     private String itemIsactive;
     private Set<Itemdtl> itemdtls = new HashSet<Itemdtl>(0);

    public Itemmaster() {
    }

	
    public Itemmaster(String itemCode, String itemName, String itemType, int itemSuppid, String itemDescr, String itemSize, String itemUom, int itemCreatedby, Date itemCreateddt, String itemIsactive) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemSuppid = itemSuppid;
        this.itemDescr = itemDescr;
        this.itemSize = itemSize;
        this.itemUom = itemUom;
        this.itemCreatedby = itemCreatedby;
        this.itemCreateddt = itemCreateddt;
        this.itemIsactive = itemIsactive;
    }
    public Itemmaster(String itemCode, String itemName, String itemType, int itemSuppid, String itemDescr, String itemSize, String itemUom, int itemCreatedby, Date itemCreateddt, String itemIsactive, Set<Itemdtl> itemdtls) {
       this.itemCode = itemCode;
       this.itemName = itemName;
       this.itemType = itemType;
       this.itemSuppid = itemSuppid;
       this.itemDescr = itemDescr;
       this.itemSize = itemSize;
       this.itemUom = itemUom;
       this.itemCreatedby = itemCreatedby;
       this.itemCreateddt = itemCreateddt;
       this.itemIsactive = itemIsactive;
       this.itemdtls = itemdtls;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ITEM_ID", unique=true, nullable=false)
    public Integer getItemId() {
        return this.itemId;
    }
    
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    
    @Column(name="ITEM_CODE", nullable=false, length=20)
    public String getItemCode() {
        return this.itemCode;
    }
    
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    
    @Column(name="ITEM_NAME", nullable=false, length=100)
    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    
    @Column(name="ITEM_TYPE", nullable=false, length=50)
    public String getItemType() {
        return this.itemType;
    }
    
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    
    @Column(name="ITEM_SUPPID", nullable=false)
    public int getItemSuppid() {
        return this.itemSuppid;
    }
    
    public void setItemSuppid(int itemSuppid) {
        this.itemSuppid = itemSuppid;
    }

    
    @Column(name="ITEM_DESCR", nullable=false)
    public String getItemDescr() {
        return this.itemDescr;
    }
    
    public void setItemDescr(String itemDescr) {
        this.itemDescr = itemDescr;
    }

    
    @Column(name="ITEM_SIZE", nullable=false, length=50)
    public String getItemSize() {
        return this.itemSize;
    }
    
    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    
    @Column(name="ITEM_UOM", nullable=false, length=10)
    public String getItemUom() {
        return this.itemUom;
    }
    
    public void setItemUom(String itemUom) {
        this.itemUom = itemUom;
    }

    
    @Column(name="ITEM_CREATEDBY", nullable=false)
    public int getItemCreatedby() {
        return this.itemCreatedby;
    }
    
    public void setItemCreatedby(int itemCreatedby) {
        this.itemCreatedby = itemCreatedby;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ITEM_CREATEDDT", nullable=false, length=19)
    public Date getItemCreateddt() {
        return this.itemCreateddt;
    }
    
    public void setItemCreateddt(Date itemCreateddt) {
        this.itemCreateddt = itemCreateddt;
    }

    
    @Column(name="ITEM_ISACTIVE", nullable=false, length=1)
    public String getItemIsactive() {
        return this.itemIsactive;
    }
    
    public void setItemIsactive(String itemIsactive) {
        this.itemIsactive = itemIsactive;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="itemmaster")
    public Set<Itemdtl> getItemdtls() {
        return this.itemdtls;
    }
    
    public void setItemdtls(Set<Itemdtl> itemdtls) {
        this.itemdtls = itemdtls;
    }




}


