package com.ElectricBillController;

import com.dao.BillPayCurd;
import com.dao.CURDOperation;
import com.dao.CombineInsert;
import com.model.BillPay;
import com.model.Registration;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SaveTableServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String susername = request.getParameter("username");
        String spassword = request.getParameter("password");
        Registration reg = CURDOperation.readSingleData(susername);
        BillPay bp = BillPayCurd.readSingleData(susername,spassword);
        
        

        int a=CombineInsert.insertData(reg, bp);
        if(a>0){
            RequestDispatcher rd=request.getRequestDispatcher("/saveSuccessfull.jsp");
            rd.forward(request, response);

        }else{
        RequestDispatcher rd=request.getRequestDispatcher("/saveFailed.jsp");
            rd.forward(request, response);
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