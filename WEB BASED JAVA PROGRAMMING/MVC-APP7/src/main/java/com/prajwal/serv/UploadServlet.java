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

import com.prajwal.service.ProductService;
import com.prajwal.service.ProductServiceImpl;

@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String p = request.getParameter("no");
		int no = Integer.parseInt(p);

		ServletContext sc = getServletContext();
		String filePath = sc.getRealPath("/images");

		Path path = Paths.get(filePath);

		if (!Files.exists(path)) {
			Files.createDirectory(path);
		}

		Part part = request.getPart("image");

		String fileName = part.getSubmittedFileName();
		fileName = fileName.substring(fileName.lastIndexOf('.'));
		fileName = no + fileName;

		path = path.resolve(path + "/" + fileName);

		Files.copy(part.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

		ProductService productService = new ProductServiceImpl();
		productService.upload(no, fileName);
		response.sendRedirect("product_list.jsp");
	}

}
