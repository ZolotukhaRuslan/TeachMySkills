import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Servlett")
public class Servlett extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathLogin = "/login.jsp";
        String pathHello = "/Hello.jsp";
        String buttonOne = req.getParameter("entrance");
        String buttonTwo = req.getParameter("registration");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (buttonOne == null && buttonTwo == null) {
            ServletContext servCont = getServletContext();
            RequestDispatcher reqDisp = servCont.getRequestDispatcher(pathLogin);
            reqDisp.forward(req, resp);
        } else if (buttonOne != null) {
            JobMethod jm = new JobMethod();
            jm.entrance(login, password);
            String log = login;
            req.setAttribute("login", log);
            if (jm.react == true) {
                ServletContext servCont = getServletContext();
                RequestDispatcher reqDisp = servCont.getRequestDispatcher(pathHello);
                reqDisp.forward(req, resp);
            }
        } else if (buttonTwo != null) {
            JobMethod job = new JobMethod();
            job.newLogin(login, password);
            ServletContext servCont = getServletContext();
            RequestDispatcher reqDisp = servCont.getRequestDispatcher(pathLogin);
            reqDisp.forward(req, resp);
        }
    }
}

