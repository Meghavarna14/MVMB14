
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calci")
public class Calci extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Calci() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int A, B, Sum;
		A = Integer.parseInt(request.getParameter("A"));
		B = Integer.parseInt(request.getParameter("B"));
		// Sum = Integer.parseInt(request.getParameter("Sum"));
		PrintWriter printWriter = response.getWriter();
		Sum = A + B;
		printWriter.println("Sum of Two Numbers" + A + " and " + B + "is:" + Sum);
	
	}

}
