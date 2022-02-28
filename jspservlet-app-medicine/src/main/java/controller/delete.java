package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MedicineDao;

@WebServlet(name = "Delete",
description = "servlet to view medicines",
urlPatterns = {"/deleteMedicine"} )
public class delete extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)  throws IOException{
        int id = Integer.parseInt(request.getParameter("mid"));       
        int res = MedicineDao.deleteMedicine(id);
        if(res>0){
            response.sendRedirect("/medicines/findAll");
        }
        else{
            PrintWriter out = response.getWriter();
             out.println("Check medicine id you have entered");
        }
    }    
}