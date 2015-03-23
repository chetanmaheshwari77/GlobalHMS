package com.cts.mfrp.dao;

import java.util.Date;
import java.sql.*;

import com.cts.mfrp.connection.databaseconnection;
import com.cts.mfrp.nameto.NameToAddorg;
import com.cts.mfrp.userto.UserToAddorg;

public class AddOrgDao {

	//public int addValidate(NameToAddorg ton)
	public int addValidate(UserToAddorg ton) {
		// TODO Auto-generated method stub
		//long orgId = ton.getOrgid();
		System.out.println("Inside DAO");
		String orgNm = ton.getOrgnm();
		String strln1Adr = ton.getStrln1adr();
		String strln2Adr = ton.getStrln2adr();
		String cityNm = ton.getCitynm();
		String state = ton.getState();
		String cntryName = ton.getCntryname();
		String pstlCde = ton.getPstlcde();
		String pstlpls4Cde = ton.getPstlpls4cde();
		String actvInd = ton.getActvind();
		Date crteDt = ton.getCrtedt();
		Date updDt = ton.getUpddt();

		System.out.println(orgNm+" "+strln1Adr+" "+strln2Adr+" "+cityNm+" "+state+" "+cntryName+" "+pstlCde+" "+pstlpls4Cde+" "+actvInd+" "+crteDt+" "+updDt);
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@PC199062:1521:XE","ORCL", "password-1");			
			//databaseconnection dbc=new databaseconnection();
			//java.sql.Connection con=dbc.database();
			/*System.out.println(("Connection"+con));
			System.out.println("In DAO"+new java.sql.Date(crteDt.getTime()));
			*/
			String sql = "insert into USR_ORG (ORG_NM,STR_LN_1_ADR,STR_LN_2_ADR,CITY_NM,STATE,CNTRY_NAME,PSTL_CDE,PSTL_PLS_4_CDE,ACTV_IND,CRTE_DT,UPD_DT) values (?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, orgNm);
			ps.setString(2, strln1Adr);
			ps.setString(3, strln2Adr);
			ps.setString(4, cityNm);
			ps.setString(5, state);
			ps.setString(6, cntryName);
			ps.setString(7, pstlCde);
			ps.setString(8, pstlpls4Cde);
			ps.setString(9, actvInd);
			ps.setDate(10, new java.sql.Date(crteDt.getTime()));
			ps.setDate(11, new java.sql.Date(updDt.getTime()) );

			int rowsUpdated = ps.executeUpdate();
			ps.close();
			con.close();
			return rowsUpdated;
			

		}

		catch (ClassNotFoundException e) {
			System.out.println("CNF Error"+e);
		}
		catch(SQLException ex)
		{
			System.out.println("SQL Exception"+ex);
		}

		return -1;
	}

}
