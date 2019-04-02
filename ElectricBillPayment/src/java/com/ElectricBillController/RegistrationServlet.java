package com.ElectricBillController;

import com.dao.CURDOperation;
import com.model.Registration;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html;charset=UTF-8");
        String sname = req.getParameter("name");
        String sfather = req.getParameter("fatherName");
        String smobile = req.getParameter("mobileNumber");
        String sdivision = req.getParameter("division");
        String sdistrict = req.getParameter("district");
        String sthana = req.getParameter("thana");
        String saddress = req.getParameter("address");
        String susername = req.getParameter("username");
        String spassword = req.getParameter("Password");

        Registration obj = new Registration(sname, sfather, smobile, sdivision, sdistrict, sthana, saddress, susername, spassword);
        int a = CURDOperation.insertData(obj);
        if (a > 0) {
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println("$(document).ready(function(){");
            out.println("swal('Good job!', 'Registration Successful.', 'success');");
            out.println("});");
            out.println("</script>");

            RequestDispatcher rd = req.getRequestDispatcher("/RegistrationForm.jsp");
            rd.include(req, res);

//            RequestDispatcher rd = req.getRequestDispatcher("/successful.jsp");
//            rd.forward(req, res);
        } else {
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println("$(document).ready(function(){");
            out.println("swal('Oops', 'Something went wrong!', 'error');");
            out.println("});");
            out.println("</script>");

            RequestDispatcher rd = req.getRequestDispatcher("/RegistrationForm.jsp");
            rd.include(req, res);
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
