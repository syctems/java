package controlller;

import dao.IDeptDAO;
import service.IDeptDAOImpl;
import entity.Dept;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class DeptController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IDeptDAO iDeptDAO = new IDeptDAOImpl();
        List<Dept> depts = iDeptDAO.findAll();
        req.setAttribute("list",depts);
//        req.setAttribute("aa","aa");
        req.getRequestDispatcher("view/Dept.jsp").forward(req,resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}