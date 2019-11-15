package app.servlets;

import app.service.UserServiceImpl;
import app.utils.ConnectionProvider;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userDelete")
public class UserDeleteServlet extends HttpServlet {

    private UserServiceImpl service = UserServiceImpl.getUserService(ConnectionProvider.getMysqlConnection());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String login = req.getParameter("login");
        service.deleteUser(login);
        req.setAttribute("DeleteUserLogin", login);
        resp.sendRedirect("/list?deletedLogin=" + login);
    }
}
