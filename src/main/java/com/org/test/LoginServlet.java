/**
 * 
 */
package com.org.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * 
 */
@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Gson gson = new Gson();
		Employee employee = new Employee();
		employee.setEmpId(1001);
		employee.setName("Ritika");
		employee.setCity("Pune");
		employee.setGender("Female");
		System.out.println(employee.toString());
		PrintWriter out = resp.getWriter();
		out.write(gson.toJson(employee));
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy Called ");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init Called ");
	}

}
