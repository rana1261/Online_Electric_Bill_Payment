package com.ElectricBillController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminLoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");

        String susername = req.getParameter("username");
        String spassword = req.getParameter("Password");

        if ((susername.equals("sohel") && spassword.equals("rana1261") )||(susername.equals("belal") && spassword.equals("belal123") )) {
            HttpSession session = req.getSession();
            session.setAttribute("username", susername);
            res.sendRedirect("AdminData.jsp");
        } else {
            res.sendRedirect("Admin_login.jsp");
        }

    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
