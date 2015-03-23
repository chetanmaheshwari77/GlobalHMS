package com.cts.mfrp.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

import com.cts.mfrp.nameto.NameToAddemp;
import com.cts.mfrp.userto.UserToAddemp;

public class AddEmpDao
{

	//public int addValidateemp(NameToAddemp tonemp) 
	
	public int addValidateemp(UserToAddemp tonemp) 
	{
		
		// TODO Auto-generated method stub
		try{
		
		String lognUid= tonemp.getLognuid();
		Date crteTms= tonemp.getCrtetms();
		String orgId= tonemp.getOrgid();
		Date authststdDt= tonemp.getAuthststddt();
	    String authststCode= tonemp.getAuthststcode();
	    String fstNm= tonemp.getFstnm();
		String lstNm= tonemp.getLstnm() ;
		Date updTms= tonemp.getUpdtms();
		String emailadrTxt= tonemp.getEmailadrtxt();
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		java.sql.Connection con = DriverManager.getConnection(
			"jdbc:oracle:thin:@PC199062:1521:XE", "orcl", "password-1");
	//	"jdbc:oracle:thin:@PC199062:1521:MRCH", "mrch", "mrch");

		String sql = "insert into USR_AUTH (logn_uid,crte_tms,org_id,auth_stat_dt,auth_stat_cde,fst_nm,lst_nm,upd_tms,email_adr_txt) values (?,?,?,?,?,?,?,?,?)";

		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, lognUid);
		ps.setDate(2, new java.sql.Date(crteTms.getTime()));
		ps.setString(3, orgId);
		ps.setDate(4, new java.sql.Date(authststdDt.getTime()));
		ps.setString(5, authststCode);
		ps.setString(6, fstNm);
		ps.setString(7, lstNm);
		ps.setDate(8, new java.sql.Date(updTms.getTime()));
		ps.setString(9, emailadrTxt);
		
		int rowsUpdated = ps.executeUpdate();
		ps.close();
		con.close();
		return rowsUpdated;
		 
		 
		
	
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		return -1;
	}

}
