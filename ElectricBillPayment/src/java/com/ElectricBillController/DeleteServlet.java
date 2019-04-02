package com.ElectricBillController;

import com.dao.BillPayCurd;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        int sid = Integer.parseInt(req.getParameter("id"));
       
        
        int a=BillPayCurd.deleteData(sid);
        
        if(a==0){
            RequestDispatcher rd=req.getRequestDispatcher("/deleteSuccessful.jsp");
            rd.forward(req, res);
        }else{
        RequestDispatcher rd=req.getRequestDispatcher("/deleteFail.jsp");
            rd.forward(req, res);
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