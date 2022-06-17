package com.ahimdata;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ahimdata.model.Datas;
import com.dao.Dao;

/**
 * Servlet implementation class MavenData
 */
public class MavenData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id= Integer.parseInt(request.getParameter("id"));
		Dao dao = new Dao();
		Datas d= dao.getDatas(id);
		
		request.setAttribute("anydatas",d);
		RequestDispatcher rd= request.getRequestDispatcher("showData.jsp");
		rd.forward(request, response);
		
	}
	}

