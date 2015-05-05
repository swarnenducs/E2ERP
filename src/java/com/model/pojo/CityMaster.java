package com.model.pojo;
// Generated 15 Apr, 2015 12:30:14 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CityMaster generated by hbm2java
 */
@Entity
@Table(name="city_master"
    ,catalog="e2rp"
)
public class CityMaster  implements java.io.Serializable {


     private Integer cityId;
     private int stateId;
     private String cityName;

    public CityMaster() {
    }

    public CityMaster(int stateId, String cityName) {
       this.stateId = stateId;
       this.cityName = cityName;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="CITY_ID", unique=true, nullable=false)
    public Integer getCityId() {
        return this.cityId;
    }
    
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    
    @Column(name="STATE_ID", nullable=false)
    public int getStateId() {
        return this.stateId;
    }
    
    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    
    @Column(name="CITY_NAME", nullable=false, length=50)
    public String getCityName() {
        return this.cityName;
    }
    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }




}


