package main.webapp.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends HttpServlet {
	
	private LoginDao service;
	
	public LoginAction(){
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		this.doGet(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		String path = req.getContextPath();
		String username = req.getParameter("username");
		String pswd = req.getParameter("pswd");
		
		List<Object> params = new ArrayList<Object>();
		params.add(username);
		params.add(pswd);
		boolean flag = service.login(params);
		
		if (flag) {
			
			req.getSession().setAttribute("username", username);
//			resp.sendRedirect(path+"/main.jsp");
		}else{
						
			resp.sendRedirect(path+"/index.jsp");
		}
		
		
		out.flush();
		out.close();
	}
	
	@Override
	public void init() throws ServletException {

		service = new LoginDao();
	}

}