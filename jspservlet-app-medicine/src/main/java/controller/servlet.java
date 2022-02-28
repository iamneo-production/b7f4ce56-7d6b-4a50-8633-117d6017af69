package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Medicine;
import service.MedicineDao;

@WebServlet("/AddMedicine")
public class servlet extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String name = request.getParameter("mname");
        int price = Integer.parseInt(request.getParameter("mprice"));
        String quality = request.getParameter("mquality");
        Medicine medicine = new Medicine();
        medicine.setMedicineName(name);
        medicine.setMedicinePrice(price);
        medicine.setMedicineQuality(quality);

        int result = MedicineDao.addMedicine(medicine);
        if(result>0){
            response.sendRedirect("/medicines/findAll");
        }
        else{
            PrintWriter out = response.getWriter();
            out.println("not added sucessfully");
        }
    }
}
