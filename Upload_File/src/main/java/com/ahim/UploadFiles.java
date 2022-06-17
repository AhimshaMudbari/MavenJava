package com.ahim;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadFiles extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletFileUpload servletfile = new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<FileItem> mulfile= servletfile.parseRequest(request);
			for(FileItem i: mulfile) {
				i.write(new File("/home/ahimsha/eclipse-workspace/mavenProjects/Upload_File/"+ i.getName()));
			}
			PrintWriter out = response.getWriter();
			out.print("file uploaded successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
