import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("message","hello");

        Map<String,String> mm=new HashMap<String,String>();
        mm.put("a1","aa");
        mm.put("a2","bb");
        req.setAttribute("list",mm);
        req.getRequestDispatcher("view/HelloWorld.jsp").forward(req,resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}  