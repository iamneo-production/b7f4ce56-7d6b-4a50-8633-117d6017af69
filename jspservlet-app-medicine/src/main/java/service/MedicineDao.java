package service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Medicine;
import utility.ConnectionManager;

public class MedicineDao {

     
    public static int addMedicine(Medicine medicine){
        int res=0;
        try(Connection connection = ConnectionManager.getConnection();
        PreparedStatement ps = connection.prepareStatement("insert into contact values(?,?,?,?)");){
         
         ps.setInt(1,medicine.medicineId);
         ps.setInt(2,medicine.medicinePrice);
         ps.setString(3,medicine.medicineName);
         ps.setString(4,medicine.medicineQuality);
         res =ps.executeUpdate();
        
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return res;
    }

    public static List<Medicine> findAll()  
    {
        List<Medicine> medicines=new ArrayList<Medicine>();
        //int res=0;
        try(Connection connection = ConnectionManager.getConnection();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM medicine");){
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                Medicine medicine = new Medicine();
                medicine.setMedicineId(rs.getInt("medicineId"));
                medicine.setMedicineName(rs.getString("medicineName"));
                medicine.setMedicinePrice(rs.getInt("medicinePrice"));
                medicine.setMedicineQuality(rs.getString("MedicineQuality"));
                medicines.add(medicine);
                }
            
        }catch(Exception e){
                e.printStackTrace();
        }
      return medicines;  
    }

  

    public static int updateMedicine(Medicine medicine){

        int res=0;
        try(Connection connection = ConnectionManager.getConnection();
        PreparedStatement ps = connection.prepareStatement("update contact set contactName=?,contactNumber=?,contactImage=? where contactId =?");){
        
         ps.setString(1,medicine.getMedicineName());
         ps.setInt(2,medicine.getMedicinePrice());
         ps.setString(3,medicine.getMedicineQuality());
         ps.setInt(4,medicine.getMedicineId());
         res =ps.executeUpdate();
        
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return res;

    }

    public static int deleteMedicine(int id){
            int res=0;
        try(Connection connection = ConnectionManager.getConnection();
              PreparedStatement ps = connection.prepareStatement("delete from medicine where methodId=?");){
        
          ps.setInt(1,id);
         res =ps.executeUpdate();
        
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return res;
    }
    public static Medicine viewMedicineById (int id){
        Medicine medicine = new Medicine();
        try(Connection connection = ConnectionManager.getConnection();
        PreparedStatement ps = connection.prepareStatement("select * from medicine where methodId=?");)
        {        
         ps.setInt(1,id);
         ResultSet rs =ps.executeQuery();
            while(rs.next()){
            medicine.setMedicineId(rs.getInt("medicineId"));
            medicine.setMedicineName(rs.getString("medicineName"));
            medicine.setMedicinePrice(rs.getInt("medicinePrice"));
            medicine.setMedicineQuality(rs.getString("medicineQuality")); 
            }               
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return medicine;   
    }
}
