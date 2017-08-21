

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CommentServlet")
public class CommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CommentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String tname = request.getParameter("tname");
		CommentDao commentDao=new CommentDao();
		TopicDao topicDao=new TopicDao();
		
		int id=TopicDao.getTopicId(tname);
		String cmt=CommentDao.getLatestComment(id);
		request.setAttribute("Mes",cmt); 

		   RequestDispatcher dispatcher = request.getRequestDispatcher("/ViewComment.jsp");

		   dispatcher.forward( request, response);
		System.out.println(cmt);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String tname = request.getParameter("tname");
		String comment = request.getParameter("comment");
		
		CommentDao commentDao=new CommentDao();
		TopicDao topicDao=new TopicDao();
		
		int id=TopicDao.getTopicId(tname);
		
		try {
			if(CommentDao.insertComment(comment,id))

			{

			        request.setAttribute("Message","Comment Posted Successfully"); 

   RequestDispatcher dispatcher = request.getRequestDispatcher("/PostComment.jsp");

   dispatcher.forward( request, response);

			}

			else

			{

			        System.out.println("Not inserted");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
