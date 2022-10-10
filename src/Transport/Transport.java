package Transport;

public abstract class Transport {
    private String marka;
    private String model;
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
}

