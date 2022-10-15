package Transport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private String marka;
    private String model;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();
   // private int yearOfRelease;
   // private String  country;
   // public String color;
   // public int maxSpeed;
    public Transport(String marka, String model){//, int yearOfRelease, String country, String color, int maxSpeed) {
        this.marka = marka;
        this.model = model;

       // this.yearOfRelease = yearOfRelease;
       // this.country = country;
      //  if(color==null||color.isEmpty()){
       //     this.color = "Недопустимое значение";
       // }else{
           // this.color = color;};
       // if (maxSpeed<=0){
       //     this.maxSpeed = 2000;}
       // else {this.maxSpeed = maxSpeed;}

    }
    public boolean servise(){
        return false;
    }
    public void addDriver(Driver<?>... drivers){
        this.drivers.addAll(Arrays.asList(drivers));

    }
    public void addMechanic(Mechanic<?>... mechanics){
        this.mechanics.addAll(Arrays.asList(mechanics));

    }
    public void addSponsor(Sponsor... sponsor){
        this.sponsors.addAll(Arrays.asList(sponsor));

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }
//public int getYearOfRelease() {
    //    return yearOfRelease;
   // }

   // public String getCountry() {
   //     return country;
   // }

   // public String getColor() {
    //    return color;
   // }

   // public void setColor(String color) {
   //     this.color = color;
   // }

   // public int getMaxSpeed() {
     //   return maxSpeed;
   // }
//
   // public void setMaxSpeed(int maxSpeed) {
   //     this.maxSpeed = maxSpeed;
   // }
  //  public abstract void refill();
   public void startMoving() {
            System.out.println("Начать движение");
        }
    public void endedMoving() {
        System.out.println("Закончить движение");
    }

    public abstract void printType();

    public void repair() {
    }
}

