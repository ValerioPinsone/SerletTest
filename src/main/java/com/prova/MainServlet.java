package com.prova;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String parametro = request.getParameter("p");
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<String> carrello = (List<String>)request.getSession().getAttribute("carrello");
		if(carrello==null) {
			carrello = new ArrayList<String>();
			request.getSession().setAttribute("carrello", carrello);
		}
		
		String articolo = request.getParameter("prodotto");
		if(articolo!=null&&!articolo.trim().equals("")) {
			carrello.add(articolo);
		}
		request.getServletContext().getRequestDispatcher("/pagina.jsp").include(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
