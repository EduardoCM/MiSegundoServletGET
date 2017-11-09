package org.tesji;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClienteServlet
 */
@WebServlet("/getCliente")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClienteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idTicket = request.getParameter("idTicket");
		System.out.println("Realizando busqueda de ticket: " + idTicket);

		String opcion = request.getParameter("op");
		if (opcion != null) {

			switch (opcion) {

			case "1":
				System.out.println(":: Guardar");
				String nombre = request.getParameter("nombre");
				String apellido = request.getParameter("apellido");
				System.out.println("Guardar: " + nombre + " " + apellido);
				break;
			case "2":
				System.out.println(":: Consultar");
				String id = request.getParameter("id");
				System.out.println("Buscar Id: " + id);
				break;
			case "3":
				System.out.println(":: Eliminar");
				String idEliminar = request.getParameter("id");
				System.out.println("Eliminar por Id: " + idEliminar);
				break;

			default:
				break;

			}

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
