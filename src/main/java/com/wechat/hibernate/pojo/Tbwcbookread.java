package com.wechat.hibernate.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Pettyfer on 2017/3/30.
 */
@Entity
public class Tbwcbookread {
    private int rid;
    private String title;
    private String context;
    private Integer recordid;
    private Timestamp recorddt;
    private Integer lstmodifid;
    private Timestamp lstmodifdt;
    private Integer isvalid;
    private String tsm5;
    private String coverImg;
    private String picture;
    private Integer likeNum;
    private String tsm1;
    private String tsm2;
    private String tsm3;
    private String tsm4;
    private String tsm6;
    private String tsm7;
    private String tsm8;
    private String tsm9;
    private Integer classify;
    private String keyword;

    @Id
    @Column(name = "rid")
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Basic
    @Column(name = "recordid")
    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    @Basic
    @Column(name = "recorddt")
    public Timestamp getRecorddt() {
        return recorddt;
    }

    public void setRecorddt(Timestamp recorddt) {
        this.recorddt = recorddt;
    }

    @Basic
    @Column(name = "lstmodifid")
    public Integer getLstmodifid() {
        return lstmodifid;
    }

    public void setLstmodifid(Integer lstmodifid) {
        this.lstmodifid = lstmodifid;
    }

    @Basic
    @Column(name = "lstmodifdt")
    public Timestamp getLstmodifdt() {
        return lstmodifdt;
    }

    public void setLstmodifdt(Timestamp lstmodifdt) {
        this.lstmodifdt = lstmodifdt;
    }

    @Basic
    @Column(name = "isvalid")
    public Integer getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Integer isvalid) {
        this.isvalid = isvalid;
    }

    @Basic
    @Column(name = "tsm5")
    public String getTsm5() {
        return tsm5;
    }

    public void setTsm5(String tsm5) {
        this.tsm5 = tsm5;
    }

    @Basic
    @Column(name = "cover_img")
    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    @Basic
    @Column(name = "picture")
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "like_num")
    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    @Basic
    @Column(name = "tsm1")
    public String getTsm1() {
        return tsm1;
    }

    public void setTsm1(String tsm1) {
        this.tsm1 = tsm1;
    }

    @Basic
    @Column(name = "tsm2")
    public String getTsm2() {
        return tsm2;
    }

    public void setTsm2(String tsm2) {
        this.tsm2 = tsm2;
    }

    @Basic
    @Column(name = "tsm3")
    public String getTsm3() {
        return tsm3;
    }

    public void setTsm3(String tsm3) {
        this.tsm3 = tsm3;
    }

    @Basic
    @Column(name = "tsm4")
    public String getTsm4() {
        return tsm4;
    }

    public void setTsm4(String tsm4) {
        this.tsm4 = tsm4;
    }

    @Basic
    @Column(name = "tsm6")
    public String getTsm6() {
        return tsm6;
    }

    public void setTsm6(String tsm6) {
        this.tsm6 = tsm6;
    }

    @Basic
    @Column(name = "tsm7")
    public String getTsm7() {
        return tsm7;
    }

    public void setTsm7(String tsm7) {
        this.tsm7 = tsm7;
    }

    @Basic
    @Column(name = "tsm8")
    public String getTsm8() {
        return tsm8;
    }

    public void setTsm8(String tsm8) {
        this.tsm8 = tsm8;
    }

    @Basic
    @Column(name = "tsm9")
    public String getTsm9() {
        return tsm9;
    }

    public void setTsm9(String tsm9) {
        this.tsm9 = tsm9;
    }

    @Basic
    @Column(name = "classify")
    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    @Basic
    @Column(name = "keyword")
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tbwcbookread that = (Tbwcbookread) o;

        if (rid != that.rid) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (context != null ? !context.equals(that.context) : that.context != null) return false;
        if (recordid != null ? !recordid.equals(that.recordid) : that.recordid != null) return false;
        if (recorddt != null ? !recorddt.equals(that.recorddt) : that.recorddt != null) return false;
        if (lstmodifid != null ? !lstmodifid.equals(that.lstmodifid) : that.lstmodifid != null) return false;
        if (lstmodifdt != null ? !lstmodifdt.equals(that.lstmodifdt) : that.lstmodifdt != null) return false;
        if (isvalid != null ? !isvalid.equals(that.isvalid) : that.isvalid != null) return false;
        if (tsm5 != null ? !tsm5.equals(that.tsm5) : that.tsm5 != null) return false;
        if (coverImg != null ? !coverImg.equals(that.coverImg) : that.coverImg != null) return false;
        if (picture != null ? !picture.equals(that.picture) : that.picture != null) return false;
        if (likeNum != null ? !likeNum.equals(that.likeNum) : that.likeNum != null) return false;
        if (tsm1 != null ? !tsm1.equals(that.tsm1) : that.tsm1 != null) return false;
        if (tsm2 != null ? !tsm2.equals(that.tsm2) : that.tsm2 != null) return false;
        if (tsm3 != null ? !tsm3.equals(that.tsm3) : that.tsm3 != null) return false;
        if (tsm4 != null ? !tsm4.equals(that.tsm4) : that.tsm4 != null) return false;
        if (tsm6 != null ? !tsm6.equals(that.tsm6) : that.tsm6 != null) return false;
        if (tsm7 != null ? !tsm7.equals(that.tsm7) : that.tsm7 != null) return false;
        if (tsm8 != null ? !tsm8.equals(that.tsm8) : that.tsm8 != null) return false;
        if (tsm9 != null ? !tsm9.equals(that.tsm9) : that.tsm9 != null) return false;
        if (classify != null ? !classify.equals(that.classify) : that.classify != null) return false;
        if (keyword != null ? !keyword.equals(that.keyword) : that.keyword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (context != null ? context.hashCode() : 0);
        result = 31 * result + (recordid != null ? recordid.hashCode() : 0);
        result = 31 * result + (recorddt != null ? recorddt.hashCode() : 0);
        result = 31 * result + (lstmodifid != null ? lstmodifid.hashCode() : 0);
        result = 31 * result + (lstmodifdt != null ? lstmodifdt.hashCode() : 0);
        result = 31 * result + (isvalid != null ? isvalid.hashCode() : 0);
        result = 31 * result + (tsm5 != null ? tsm5.hashCode() : 0);
        result = 31 * result + (coverImg != null ? coverImg.hashCode() : 0);
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        result = 31 * result + (likeNum != null ? likeNum.hashCode() : 0);
        result = 31 * result + (tsm1 != null ? tsm1.hashCode() : 0);
        result = 31 * result + (tsm2 != null ? tsm2.hashCode() : 0);
        result = 31 * result + (tsm3 != null ? tsm3.hashCode() : 0);
        result = 31 * result + (tsm4 != null ? tsm4.hashCode() : 0);
        result = 31 * result + (tsm6 != null ? tsm6.hashCode() : 0);
        result = 31 * result + (tsm7 != null ? tsm7.hashCode() : 0);
        result = 31 * result + (tsm8 != null ? tsm8.hashCode() : 0);
        result = 31 * result + (tsm9 != null ? tsm9.hashCode() : 0);
        result = 31 * result + (classify != null ? classify.hashCode() : 0);
        result = 31 * result + (keyword != null ? keyword.hashCode() : 0);
        return result;
    }
}
