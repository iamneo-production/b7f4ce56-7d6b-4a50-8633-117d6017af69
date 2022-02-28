package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Medicine;
import service.MedicineDao;

@WebServlet(name = "Update",
description = "servlet to view Medicines",
urlPatterns = {"/updateMedicine"} )
public class update extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)  throws IOException{
            int id = Integer.parseInt(request.getParameter("mid"));
            String name = request.getParameter("mname");
            int price = Integer.parseInt(request.getParameter("mprice"));
            String quality = request.getParameter("mquality");
            Medicine medicine = new Medicine();
            medicine.setMedicineId(id);
            medicine.setMedicineName(name);
            medicine.setMedicinePrice(price);
            medicine.setMedicineQuality(quality);

            int res = MedicineDao.updateMedicine(medicine);
            if(res>0){
                response.sendRedirect("/medicines/findAll");
            }
            else{
                PrintWriter out = response.getWriter();
                 out.println("Check medicine id you have entered");
            }
    }    
}