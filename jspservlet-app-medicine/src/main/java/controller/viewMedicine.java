package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Medicine;
import service.MedicineDao;

@WebServlet(name = "ViewMedicine",
description = "servlet to view medicines",
urlPatterns = {"/findAll"} )
public class viewMedicine  extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            List<Medicine> medicines = MedicineDao.findAll();
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("viewContact.jsp");
            request.setAttribute("medicines", medicines);
            dispatcher.forward(request, response);
         }
}