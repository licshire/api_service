package com.wechat.hibernate.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Pettyfer on 2017/4/5.
 */
@Entity
public class Tbwcbookreadvoteinfo {
    private int rid;
    private int tplx;
    private String tprwx;
    private String tprxm;
    private Date tprq;
    private String fktsm5;
    private Timestamp recorddt;
    private String tsm1;
    private String tsm2;
    private String tsm3;
    private String tsm4;
    private String tsm5;
    private String tsm6;
    private String tsm7;
    private String tsm8;
    private String tsm9;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RID")
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "TPLX")
    public int getTplx() {
        return tplx;
    }

    public void setTplx(int tplx) {
        this.tplx = tplx;
    }

    @Basic
    @Column(name = "TPRWX")
    public String getTprwx() {
        return tprwx;
    }

    public void setTprwx(String tprwx) {
        this.tprwx = tprwx;
    }

    @Basic
    @Column(name = "TPRXM")
    public String getTprxm() {
        return tprxm;
    }

    public void setTprxm(String tprxm) {
        this.tprxm = tprxm;
    }

    @Basic
    @Column(name = "TPRQ")
    public Date getTprq() {
        return tprq;
    }

    public void setTprq(Date tprq) {
        this.tprq = tprq;
    }

    @Basic
    @Column(name = "FKTSM5")
    public String getFktsm5() {
        return fktsm5;
    }

    public void setFktsm5(String fktsm5) {
        this.fktsm5 = fktsm5;
    }

    @Basic
    @Column(name = "RECORDDT")
    public Timestamp getRecorddt() {
        return recorddt;
    }

    public void setRecorddt(Timestamp recorddt) {
        this.recorddt = recorddt;
    }

    @Basic
    @Column(name = "TSM1")
    public String getTsm1() {
        return tsm1;
    }

    public void setTsm1(String tsm1) {
        this.tsm1 = tsm1;
    }

    @Basic
    @Column(name = "TSM2")
    public String getTsm2() {
        return tsm2;
    }

    public void setTsm2(String tsm2) {
        this.tsm2 = tsm2;
    }

    @Basic
    @Column(name = "TSM3")
    public String getTsm3() {
        return tsm3;
    }

    public void setTsm3(String tsm3) {
        this.tsm3 = tsm3;
    }

    @Basic
    @Column(name = "TSM4")
    public String getTsm4() {
        return tsm4;
    }

    public void setTsm4(String tsm4) {
        this.tsm4 = tsm4;
    }

    @Basic
    @Column(name = "TSM5")
    public String getTsm5() {
        return tsm5;
    }

    public void setTsm5(String tsm5) {
        this.tsm5 = tsm5;
    }

    @Basic
    @Column(name = "TSM6")
    public String getTsm6() {
        return tsm6;
    }

    public void setTsm6(String tsm6) {
        this.tsm6 = tsm6;
    }

    @Basic
    @Column(name = "TSM7")
    public String getTsm7() {
        return tsm7;
    }

    public void setTsm7(String tsm7) {
        this.tsm7 = tsm7;
    }

    @Basic
    @Column(name = "TSM8")
    public String getTsm8() {
        return tsm8;
    }

    public void setTsm8(String tsm8) {
        this.tsm8 = tsm8;
    }

    @Basic
    @Column(name = "TSM9")
    public String getTsm9() {
        return tsm9;
    }

    public void setTsm9(String tsm9) {
        this.tsm9 = tsm9;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tbwcbookreadvoteinfo that = (Tbwcbookreadvoteinfo) o;

        if (rid != that.rid) return false;
        if (tplx != that.tplx) return false;
        if (tprwx != null ? !tprwx.equals(that.tprwx) : that.tprwx != null) return false;
        if (tprxm != null ? !tprxm.equals(that.tprxm) : that.tprxm != null) return false;
        if (tprq != null ? !tprq.equals(that.tprq) : that.tprq != null) return false;
        if (fktsm5 != null ? !fktsm5.equals(that.fktsm5) : that.fktsm5 != null) return false;
        if (recorddt != null ? !recorddt.equals(that.recorddt) : that.recorddt != null) return false;
        if (tsm1 != null ? !tsm1.equals(that.tsm1) : that.tsm1 != null) return false;
        if (tsm2 != null ? !tsm2.equals(that.tsm2) : that.tsm2 != null) return false;
        if (tsm3 != null ? !tsm3.equals(that.tsm3) : that.tsm3 != null) return false;
        if (tsm4 != null ? !tsm4.equals(that.tsm4) : that.tsm4 != null) return false;
        if (tsm5 != null ? !tsm5.equals(that.tsm5) : that.tsm5 != null) return false;
        if (tsm6 != null ? !tsm6.equals(that.tsm6) : that.tsm6 != null) return false;
        if (tsm7 != null ? !tsm7.equals(that.tsm7) : that.tsm7 != null) return false;
        if (tsm8 != null ? !tsm8.equals(that.tsm8) : that.tsm8 != null) return false;
        if (tsm9 != null ? !tsm9.equals(that.tsm9) : that.tsm9 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid;
        result = 31 * result + tplx;
        result = 31 * result + (tprwx != null ? tprwx.hashCode() : 0);
        result = 31 * result + (tprxm != null ? tprxm.hashCode() : 0);
        result = 31 * result + (tprq != null ? tprq.hashCode() : 0);
        result = 31 * result + (fktsm5 != null ? fktsm5.hashCode() : 0);
        result = 31 * result + (recorddt != null ? recorddt.hashCode() : 0);
        result = 31 * result + (tsm1 != null ? tsm1.hashCode() : 0);
        result = 31 * result + (tsm2 != null ? tsm2.hashCode() : 0);
        result = 31 * result + (tsm3 != null ? tsm3.hashCode() : 0);
        result = 31 * result + (tsm4 != null ? tsm4.hashCode() : 0);
        result = 31 * result + (tsm5 != null ? tsm5.hashCode() : 0);
        result = 31 * result + (tsm6 != null ? tsm6.hashCode() : 0);
        result = 31 * result + (tsm7 != null ? tsm7.hashCode() : 0);
        result = 31 * result + (tsm8 != null ? tsm8.hashCode() : 0);
        result = 31 * result + (tsm9 != null ? tsm9.hashCode() : 0);
        return result;
    }
}
