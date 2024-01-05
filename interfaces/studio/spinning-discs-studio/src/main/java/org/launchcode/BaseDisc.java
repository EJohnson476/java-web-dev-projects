package org.launchcode;

public abstract class BaseDisc
{
    private int spinSpeed;
    private String name;
    private Double capacity;
    private String discType;

   public BaseDisc(int spinSpeed,String name, Double capacity, String discType )
   {
       this.spinSpeed = spinSpeed;
       this.name = name;
       this.capacity = capacity;
       this.discType = discType;
   }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
