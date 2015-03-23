package com.cts.mfrp.nameto;

import java.util.Date;



public class NameToAddorg 
{
	private long orgid;
	private String orgnm;
	private String strln1adr;
	private String strln2adr;
	private String citynm;
	private String state;
	private String cntryname;
	private String pstlcde;
	private String pstlpls4cde;
	private String actvind;
	private Date crtedt;
	private Date upddt;
	
	
	public long getOrgid() {
		return orgid;
	}
	public void setOrgid(long orgid) {
		this.orgid = orgid;
	}
	public String getOrgnm() {
		return orgnm;
	}
	public void setOrgnm(String orgnm) {
		this.orgnm = orgnm;
	}
	public String getStrln1adr() {
		return strln1adr;
	}
	public void setStrln1adr(String strln1adr) {
		this.strln1adr = strln1adr;
	}
	public String getStrln2adr() {
		return strln2adr;
	}
	public void setStrln2adr(String strln2adr) {
		this.strln2adr = strln2adr;
	}
	public String getCitynm() {
		return citynm;
	}
	public void setCitynm(String citynm) {
		this.citynm = citynm;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCntryname() {
		return cntryname;
	}
	public void setCntryname(String cntryname) {
		this.cntryname = cntryname;
	}
	public String getPstlcde() {
		return pstlcde;
	}
	public void setPstlcde(String pstlcde) {
		this.pstlcde = pstlcde;
	}
	public String getPstlpls4cde() {
		return pstlpls4cde;
	}
	public void setPstlpls4cde(String pstlpls4cde) {
		this.pstlpls4cde = pstlpls4cde;
	}
	public String getActvind() {
		return actvind;
	}
	public void setActvind(String actvind) {
		this.actvind = actvind;
	}
	public Date getCrtedt() {
		return crtedt;
	}
	public void setCrtedt(Date crtedt) {
		this.crtedt = crtedt;
		System.out.println("  To  : "+this.crtedt);
	}
	public Date getUpddt() {
		return upddt;
	}
	public void setUpddt(Date upddt) {
		this.upddt = upddt;
		System.out.println("  To  : "+this.upddt);
	}
	
	
}
