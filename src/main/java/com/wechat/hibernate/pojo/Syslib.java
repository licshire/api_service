package com.wechat.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Syslib entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYSLIB")
public class Syslib implements java.io.Serializable {

	// Fields

	private Integer uid;
	private Integer rcode;
	private Integer pcode;
	private String rname;
	private String rdesp;
	private String tsm1;
	private String tsm2;
	private String tsm3;
	private String tsm4;
	private String tsm5;

	// Constructors

	/** default constructor */
	public Syslib() {
	}

	/** minimal constructor */
	public Syslib(Integer uid, Integer rcode, Integer pcode, String rname) {
		this.uid = uid;
		this.rcode = rcode;
		this.pcode = pcode;
		this.rname = rname;
	}

	/** full constructor */
	public Syslib(Integer uid, Integer rcode, Integer pcode, String rname,
			String rdesp, String tsm1, String tsm2, String tsm3, String tsm4,
			String tsm5) {
		this.uid = uid;
		this.rcode = rcode;
		this.pcode = pcode;
		this.rname = rname;
		this.rdesp = rdesp;
		this.tsm1 = tsm1;
		this.tsm2 = tsm2;
		this.tsm3 = tsm3;
		this.tsm4 = tsm4;
		this.tsm5 = tsm5;
	}

	// Property accessors
	@Id
	@Column(name = "UID", unique = true, nullable = false)
	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Column(name = "RCODE", nullable = false)
	public Integer getRcode() {
		return this.rcode;
	}

	public void setRcode(Integer rcode) {
		this.rcode = rcode;
	}

	@Column(name = "PCODE", nullable = false)
	public Integer getPcode() {
		return this.pcode;
	}

	public void setPcode(Integer pcode) {
		this.pcode = pcode;
	}

	@Column(name = "RNAME", nullable = false, length = 64)
	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	@Column(name = "RDESP", length = 64)
	public String getRdesp() {
		return this.rdesp;
	}

	public void setRdesp(String rdesp) {
		this.rdesp = rdesp;
	}

	@Column(name = "TSM1", length = 64)
	public String getTsm1() {
		return this.tsm1;
	}

	public void setTsm1(String tsm1) {
		this.tsm1 = tsm1;
	}

	@Column(name = "TSM2", length = 64)
	public String getTsm2() {
		return this.tsm2;
	}

	public void setTsm2(String tsm2) {
		this.tsm2 = tsm2;
	}

	@Column(name = "TSM3", length = 64)
	public String getTsm3() {
		return this.tsm3;
	}

	public void setTsm3(String tsm3) {
		this.tsm3 = tsm3;
	}

	@Column(name = "TSM4", length = 64)
	public String getTsm4() {
		return this.tsm4;
	}

	public void setTsm4(String tsm4) {
		this.tsm4 = tsm4;
	}

	@Column(name = "TSM5", length = 64)
	public String getTsm5() {
		return this.tsm5;
	}

	public void setTsm5(String tsm5) {
		this.tsm5 = tsm5;
	}

}