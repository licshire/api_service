package com.wechat.hibernate.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Pettyfer on 2017/3/24.
 */
@Entity
@Table(name = "APP_USER")
public class AppUser implements Serializable{
    private int id;
    private String xm;
    private String sfzhm;
    private String sjhm;
    private String wxId;
    private String wxXm;
    private String pwd;
    private Integer qdcs;
    private Long jf;
    private Integer areaUnit;
    private Integer area1;
    private Timestamp recorddt;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "XM", nullable = true, length = 500)
    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    @Basic
    @Column(name = "SFZHM", nullable = true, length = 500)
    public String getSfzhm() {
        return sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    @Basic
    @Column(name = "SJHM", nullable = true, length = 500)
    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    @Basic
    @Column(name = "WX_ID", nullable = true, length = 500)
    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    @Basic
    @Column(name = "WX_XM", nullable = true, length = 500)
    public String getWxXm() {
        return wxXm;
    }

    public void setWxXm(String wxXm) {
        this.wxXm = wxXm;
    }

    @Basic
    @Column(name = "pwd", nullable = true, length = 500)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "QDCS", nullable = true)
    public Integer getQdcs() {
        return qdcs;
    }

    public void setQdcs(Integer qdcs) {
        this.qdcs = qdcs;
    }

    @Basic
    @Column(name = "JF", nullable = true)
    public Long getJf() {
        return jf;
    }

    public void setJf(Long jf) {
        this.jf = jf;
    }

    @Basic
    @Column(name = "AREA_UNIT", nullable = true)
    public Integer getAreaUnit() {
        return areaUnit;
    }

    public void setAreaUnit(Integer areaUnit) {
        this.areaUnit = areaUnit;
    }

    @Basic
    @Column(name = "AREA1", nullable = true)
    public Integer getArea1() {
        return area1;
    }

    public void setArea1(Integer area1) {
        this.area1 = area1;
    }

    @Basic
    @Column(name = "RECORDDT", nullable = true)
    public Timestamp getRecorddt() {
        return recorddt;
    }

    public void setRecorddt(Timestamp recorddt) {
        this.recorddt = recorddt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppUser appUser = (AppUser) o;

        if (id != appUser.id) return false;
        if (xm != null ? !xm.equals(appUser.xm) : appUser.xm != null) return false;
        if (sfzhm != null ? !sfzhm.equals(appUser.sfzhm) : appUser.sfzhm != null) return false;
        if (sjhm != null ? !sjhm.equals(appUser.sjhm) : appUser.sjhm != null) return false;
        if (wxId != null ? !wxId.equals(appUser.wxId) : appUser.wxId != null) return false;
        if (wxXm != null ? !wxXm.equals(appUser.wxXm) : appUser.wxXm != null) return false;
        if (pwd != null ? !pwd.equals(appUser.pwd) : appUser.pwd != null) return false;
        if (qdcs != null ? !qdcs.equals(appUser.qdcs) : appUser.qdcs != null) return false;
        if (jf != null ? !jf.equals(appUser.jf) : appUser.jf != null) return false;
        if (areaUnit != null ? !areaUnit.equals(appUser.areaUnit) : appUser.areaUnit != null) return false;
        if (area1 != null ? !area1.equals(appUser.area1) : appUser.area1 != null) return false;
        if (recorddt != null ? !recorddt.equals(appUser.recorddt) : appUser.recorddt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (xm != null ? xm.hashCode() : 0);
        result = 31 * result + (sfzhm != null ? sfzhm.hashCode() : 0);
        result = 31 * result + (sjhm != null ? sjhm.hashCode() : 0);
        result = 31 * result + (wxId != null ? wxId.hashCode() : 0);
        result = 31 * result + (wxXm != null ? wxXm.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (qdcs != null ? qdcs.hashCode() : 0);
        result = 31 * result + (jf != null ? jf.hashCode() : 0);
        result = 31 * result + (areaUnit != null ? areaUnit.hashCode() : 0);
        result = 31 * result + (area1 != null ? area1.hashCode() : 0);
        result = 31 * result + (recorddt != null ? recorddt.hashCode() : 0);
        return result;
    }
}
