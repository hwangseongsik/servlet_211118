package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz05")
public class UrlMappingQuiz05 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>구구단</title><style type='text/css'>ul {list-style-type:none;}</style></head><body><ul>");
		for (int i = 2; i <= 9; i++) {
			out.print("<li><a href='#'>" + i + "단</li>");
		}
		out.print("</ul></body></html>");
		
		for (int i = 1; i <= 9; i++) {
			out.print("<li>" + " X " + i + " = " + "</li>");
		}
	}
}
