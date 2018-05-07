import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

    @EJB
    private EjbUnsecured unsecured;

    @EJB
    private EjbSecured secured;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getOutputStream().println("test:");
        resp.getOutputStream().println("unsecured: " + unsecured.test());
        resp.getOutputStream().println("secured: " + secured.test());
    }

}
