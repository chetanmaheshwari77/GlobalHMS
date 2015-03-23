package com.cts.mfrp.userto;

import java.util.Date;


public class UserToAddorg

{
	private long orgId;
	private String orgNm;
	private String strln1Adr;
	private String strln2Adr;
	private String cityNm;
	private String state;
	private String cntryName;
	private String pstlCde;
	private String pstlpls4Cde;
	private String actvInd;
	private Date crteDt;
	private Date updDt;
	
	
	
	public long getOrgid() {
		return orgId;
	}
	public void setOrgid(long orgId) {
		this.orgId = orgId;
	}
	public String getOrgnm() {
		return orgNm;
	}
	public void setOrgnm(String orgNm) {
		this.orgNm = orgNm;
	}
	public String getStrln1adr() {
		return strln1Adr;
	}
	public void setStrln1adr(String strln1Adr) {
		this.strln1Adr = strln1Adr;
	}
	public String getStrln2adr() {
		return strln2Adr;
	}
	public void setStrln2adr(String strln2Adr) {
		this.strln2Adr = strln2Adr;
	}
	public String getCitynm() {
		return cityNm;
	}
	public void setCitynm(String cityNm) {
		this.cityNm = cityNm;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCntryname() {
		return cntryName;
	}
	public void setCntryname(String cntryName) {
		this.cntryName = cntryName;
	}
	public String getPstlcde() {
		return pstlCde;
	}
	public void setPstlcde(String pstlCde) {
		this.pstlCde = pstlCde;
	}
	public String getPstlpls4cde() {
		return pstlpls4Cde;
	}
	public void setPstlpls4cde(String pstlpls4Cde) {
		this.pstlpls4Cde = pstlpls4Cde;
	}
	public String getActvind() {
		return actvInd;
	}
	public void setActvind(String actvInd) {
		this.actvInd = actvInd;
	}
	public Date  getCrtedt() {
		return crteDt;
	}
	public void setCrtedt(Date crteDt) {
		this.crteDt = crteDt;
		System.out.println("  Bo  : "+this.crteDt);
	}
	public Date getUpddt() {
		return updDt;
	}
	public void setUpddt(Date updDt) {
		this.updDt = updDt;
		System.out.println("  Bo  : "+this.updDt);
	}
	
	
	
	
	
	

}
