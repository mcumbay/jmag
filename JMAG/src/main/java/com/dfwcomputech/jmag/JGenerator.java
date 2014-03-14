package com.dfwcomputech.jmag;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dfwcomputech.jmag.components.ArchetypeGenerator;
import com.dfwcomputech.jmag.enums.ApplicationType;

/**
 * Servlet implementation class JGenerator
 */
@WebServlet(urlPatterns ="/generate.do")
public class JGenerator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(JGenerator.class);

	/**
	 * Default constructor.
	 */
	public JGenerator() {

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		log.debug("DOGET");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		log.info("Init: JGenerator");
		
		String appType= request.getParameter("r_typeApp");
		String initialPackage = request.getParameter("t_package");
		String appName =  request.getParameter("t_appname");
		
		
		ArchetypeGenerator generator = new ArchetypeGenerator(ApplicationType.get(appType),initialPackage,appName);
		String code = generator.generateArchetype();
		log.info(code);
		request.setAttribute("codegenerated", code);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/results.jsp");  
        if (dispatcher != null){  
         dispatcher.forward(request, response);  
         }   
		
	}

}
