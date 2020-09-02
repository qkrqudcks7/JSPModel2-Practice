package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld") // helloworld��� url�� ǥ�����־��  �� ���� Ŭ������ ���� ��.
public class HelloWorld extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ȭ�鿡 Helloworld��� ���
		String msg="Hello world";
		
		//jsp������ �����͸� request�� �����Ͽ� �Ѱ���
		request.setAttribute("msg", msg);
		
		// �������� jsp�� ȣ���ϸ鼭 ���� �Ѱ��ִ� ��ü�� ����
		RequestDispatcher dis= request.getRequestDispatcher("HelloWorld.jsp");
		dis.forward(request, response);
	}

}
