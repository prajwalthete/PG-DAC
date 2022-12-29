package com.prajwal.serv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext sc = getServletContext();
		String filePath = sc.getRealPath("/images");
		
		Path path = Paths.get(filePath);
		if(!Files.exists(path)) {
			Files.createDirectory(path);
		}
		
		Part part = request.getPart("image");
		
		path = path.resolve(path+"/"+part.getSubmittedFileName());
		
		
		Files.copy(part.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println(path);
	}

}
