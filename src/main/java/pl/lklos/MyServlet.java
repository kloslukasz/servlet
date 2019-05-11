package pl.lklos;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
//        String name = req.getParameter("name");
//        out.println("Siema " + name);

        //1.
        //resp.sendRedirect(req.getContextPath() + "/another");

        //2.
        //getServletContext().getRequestDispatcher("/another").forward(req, resp);

        //3.
        //getServletContext().getRequestDispatcher("/another").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("Siema from post");
    }
}
