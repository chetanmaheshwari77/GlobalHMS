package com.cts.mfrp.controller;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.cts.mfrp.bo.AddBo;
import com.cts.mfrp.userto.UserToAddorg;

/**
 * Servlet implementation class AddOrgController
 */
public class AddOrgController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOrgController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		try
		{
			System.out.println("IN CONTROLLER");
		//long orgid=Integer.parseInt(request.getParameter("orgid"));
		
		//System.out.println(orgid);
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		
		String orgNm=request.getParameter("orgnm");
		//System.out.println(orgnm);
		
		String strln1Adr=request.getParameter("strln1adr");
		String strln2Adr=request.getParameter("strln2adr");
		String cityNm=request.getParameter("citynm");
		String state=request.getParameter("state");
		String cntryName=request.getParameter("cntryname");
		String pstlCde=request.getParameter("pstlcde");
		String pstlpls4Cde=request.getParameter("pstlpls4cde");
		//String actvInd=request.getParameter("actvind");
		
		String actvInd="A";
		
	//	Date crtedt= sdf.parse(request.getParameter("crtedt").toString());
		Date crteDt=new java.util.Date();
		
		//System.out.println("create date" +crteDt);
		
		Date updDt= sdf.parse(request.getParameter("upddt"));
		//System.out.println(updDt);
		
		
		UserToAddorg toadd=new UserToAddorg();
		
		toadd.setActvind(actvInd);
		toadd.setCitynm(cityNm);
		toadd.setCntryname(cntryName);
		toadd.setCrtedt(crteDt);
		toadd.setOrgnm(orgNm);
		toadd.setPstlcde(pstlCde);
		toadd.setPstlpls4cde(pstlpls4Cde);
		toadd.setState(state);
		toadd.setStrln1adr(strln1Adr);
		toadd.setStrln2adr(strln2Adr);
		toadd.setUpddt(updDt);
		
		
		AddBo bo=new AddBo();
		
		
		boolean b=bo.validatebo(toadd);
		
		   if(b)
			{
				response.sendRedirect("OrgSuccess.jsp");
			}
			else
			{
				System.out.println("Error found");
				response.sendRedirect("OrgError.jsp");
				//PrintWriter pw=response.getWriter();
				
				//pw.print("<html><body>");
				//pw.print("Please enter correct username/password");
				//pw.print("</body></html>");
			}
		
		}
		catch(Exception e)
		{
			
			
		}		
		
		
	}

}
