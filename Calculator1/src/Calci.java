
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
		String A = request.getParameter("A");
		String B = request.getParameter("B");
		String Sum = request.getParameter("Sum");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Sum of Two Numbers:" + Sum);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
