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
@WebServlet("/HelloWorld") // helloworld라고 url에 표시해주어야  이 서블릿 클래스가 실행 됨.
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
		// 화면에 Helloworld라고 출력
		String msg="Hello world";
		
		//jsp쪽으로 데이터를 request에 부착하여 넘겨줌
		request.setAttribute("msg", msg);
		
		// 서블릿에서 jsp를 호출하면서 같이 넘겨주는 객체를 선언
		RequestDispatcher dis= request.getRequestDispatcher("HelloWorld.jsp");
		dis.forward(request, response);
	}

}
