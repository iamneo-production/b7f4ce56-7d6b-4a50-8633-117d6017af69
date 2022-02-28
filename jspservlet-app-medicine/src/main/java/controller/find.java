package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Medicine;
import service.MedicineDao;

@WebServlet(name = "find",
description = "servlet to view medicines",
urlPatterns = {"/findMedicine"} )
public class find extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)  throws IOException, ServletException{
        int id = Integer.parseInt(request.getParameter("mid"));
        Medicine medicine = MedicineDao.viewMedicineById(id);        
        RequestDispatcher dispatcher = request.getRequestDispatcher("find.jsp");
        request.setAttribute("medicine", medicine);
        dispatcher.forward(request, response);
     }    
}