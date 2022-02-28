package model;

public class Medicine {

   public int medicineId;
   public String medicineName;
   public int medicinePrice;
   public String medicineQuality;

   public int getMedicineId() {
    return this.medicineId;
}

public void setMedicineId(int medicineId) {
    this.medicineId = medicineId;
}

public String getMedicineName() {
    return this.medicineName;
}

public void setMedicineName(String medicineName) {
    this.medicineName = medicineName;
}

public int getMedicinePrice() {
    return this.medicinePrice;
}

public void setMedicinePrice(int medicinePrice) {
    this.medicinePrice = medicinePrice;
}

public String getMedicineQuality() {
    return this.medicineQuality;
}

public void setMedicineQuality(String medicineQuality) {
    this.medicineQuality = medicineQuality; 
}
   
}