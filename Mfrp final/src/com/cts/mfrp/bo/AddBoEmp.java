package com.cts.mfrp.bo;

import java.util.Date;

import com.cts.mfrp.dao.AddEmpDao;
import com.cts.mfrp.dao.AddOrgDao;
import com.cts.mfrp.nameto.NameToAddemp;
import com.cts.mfrp.nameto.NameToAddorg;
import com.cts.mfrp.userto.UserToAddemp;

public class AddBoEmp 
{

	public boolean validatebo(UserToAddemp toaddemp)
	
	{
		// TODO Auto-generated method stub
	   //  String lognuid=toaddemp.getLognuid();
		
	/*	Date crtetms=toaddemp.getCrtetms();
		String orgid=toaddemp.getOrgid();
		Date authststddt=toaddemp.getAuthststddt();
		String authststcode=toaddemp.getAuthststcode();
		String fstnm=toaddemp.getFstnm();
		String lstnm=toaddemp.getLstnm() ;
		Date updtms=toaddemp.getUpdtms();
		String emailadrtxt=toaddemp.getEmailadrtxt();
		   */
		   
		/*   
		   NameToAddemp tonemp = new NameToAddemp();
		   
		    tonemp.setAuthststcode(authststcode);
			tonemp.setAuthststddt(authststddt);
			tonemp.setCrtetms(crtetms);
			tonemp.setEmailadrtxt(emailadrtxt);
			tonemp.setFstnm(fstnm);
			tonemp.setLognuid(lognuid);
			tonemp.setLstnm(lstnm);
			tonemp.setOrgid(orgid);
			tonemp.setUpdtms(updtms);
			*/
			
			
			AddEmpDao daoemp = new AddEmpDao();
			int rowsUpdated = daoemp.addValidateemp(toaddemp);

			if (rowsUpdated > 0) {
				return true;
			} else {

				return false;
			}
		   
	}

	
	
	
}
