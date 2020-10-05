/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lendle
 */
@WebServlet(name = "HelloServlet", urlPatterns = {"/"})// *代表全部都可以 /第一層是可以和*同樣效果but第二層是無法的
public class HelloServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        try(PrintWriter out=resp.getWriter()){
            out.println("<html>");
            out.println("<body>");
            out.println(req.getRequestURI());
            out.println("</body>");
            out.println("</html>");
            //輸出
            // <html>
            // <body>
            //  <h1>Hello!</h1>
            // </body>
            // </html>
        }
    }
    
}
