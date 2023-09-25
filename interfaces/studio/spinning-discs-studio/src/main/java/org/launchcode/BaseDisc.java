package org.launchcode;

 public abstract class BaseDisc {
    int spinRate;
    String discType;
    double storageCapacity;

    public BaseDisc(int spinRate, String discType, double storageCapacity){
        this.spinRate = spinRate;
        this.discType = discType;
        this.storageCapacity = storageCapacity;
    }
     public String getDiscType() {
         return discType;
     }

     public void setDiscType(String discType) {
         this.discType = discType;
     }

     public double getStorageCapacity() {
         return storageCapacity;
     }

     public void setStorageCapacity(double storageCapacity) {
         this.storageCapacity = storageCapacity;
     }

     public int getSpinRate() {
         return spinRate;
     }

     public void setSpinRate(int spinRate) {
         this.spinRate = spinRate;
     }
 }
