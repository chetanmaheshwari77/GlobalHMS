package com.cts.mfrp.bo;

import java.util.Date;


import com.cts.mfrp.dao.AddOrgDao;
import com.cts.mfrp.nameto.NameToAddorg;
import com.cts.mfrp.userto.UserToAddorg;

public class AddBo {

	public boolean validatebo(UserToAddorg toadd) 
	{
		System.out.println("Inside BO");
		 /*long orgId=toadd.getOrgid();
		 String orgNm=toadd.getOrgnm();
		 String strln1Adr=toadd.getStrln1adr();
		 String strln2Adr=toadd.getStrln2adr();
		 String cityNm=toadd.getCitynm();
		 String state=toadd.getState();
		 String cntryName=toadd.getCntryname();
		 String pstlCde=toadd.getPstlcde();
		 String pstlpls4Cde=toadd.getPstlpls4cde();
		 String actvInd=toadd.getActvind();
		 Date crteDt=toadd.getCrtedt();
	     Date updDt=toadd.getUpddt();
		*/
		/* NameToAddorg ton = new NameToAddorg();
		 
		 ton.setActvind(actvind);
		 ton.setCitynm(citynm);
		 ton.setCntryname(cntryname);
		ton.setCrtedt(crtedt);
		 ton.setOrgid(orgid);
		 ton.setOrgnm(orgnm);
		 ton.setPstlcde(pstlcde);
		 ton.setPstlpls4cde(pstlpls4cde);
		 ton.setState(state);
		 ton.setStrln1adr(strln1adr);
		 ton.setStrln2adr(strln2adr);
		ton.setUpddt(upddt);
		 */
		 
		 AddOrgDao dao = new AddOrgDao();
			//int rowsUpdated = dao.addValidate(ton);
		 
		 int rowsUpdated = dao.addValidate(toadd);

			if (rowsUpdated > 0) {
				return true;
			} else {

				return false;
			}
			
	
	}

}
