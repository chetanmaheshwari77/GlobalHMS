package com.cts.mfrp.controller;

import java.io.IOException;

import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.mfrp.bo.AddBo;
import com.cts.mfrp.bo.AddBoEmp;
import com.cts.mfrp.userto.UserToAddemp;
import com.cts.mfrp.userto.UserToAddorg;

/**
 * Servlet implementation class AddEmpController
 */
public class AddEmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		
		
		String lognUid=request.getParameter("lognuid");
		
		//crtetms
		Date crteTms=new java.util.Date();
		
		String orgId=request.getParameter("orgid");
		
		//authststdt
		Date authststdDt=new java.util.Date();
		//authstst code
		String authststCode="AUTH";
		
		String fstNm=request.getParameter("fstnm");
		String lstNm =request.getParameter("lstnm");
		
		//updtms
		Date updTms=new java.util.Date();
		
		String emailadrTxt=request.getParameter("email");
		
		
	
		UserToAddemp toaddemp=new UserToAddemp();
		
		toaddemp.setAuthststcode(authststCode);
		toaddemp.setAuthststddt(authststdDt);
		toaddemp.setCrtetms(crteTms);
		toaddemp.setEmailadrtxt(emailadrTxt);
		toaddemp.setFstnm(fstNm);
		toaddemp.setLognuid(lognUid);
		toaddemp.setLstnm(lstNm);
		toaddemp.setOrgid(orgId);
		toaddemp.setUpdtms(updTms);
		
		
		AddBoEmp empbo=new AddBoEmp();
		
		boolean b=empbo.validatebo(toaddemp);
		
		   if(b)
			{
				response.sendRedirect("UserSuccess.jsp");
			}
			else
			{
				response.sendRedirect("UserError.jsp");
				//PrintWriter pw=response.getWriter();
				
				//pw.print("<html><body>");
				//pw.print("Please enter correct username/password");
				//pw.print("</body></html>");
			}
		
		
		
		
		
		
	}

}
