package servlets;

import service.TimeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/time1")
public class TimeServletТask1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html charset=utf-8 ");
        PrintWriter writer = resp.getWriter();
        writer.write(TimeService.getTimeDateByUTC());
        writer.close();
    }
}
