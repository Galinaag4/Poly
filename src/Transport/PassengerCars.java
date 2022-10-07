package Transport;

public class PassengerCars extends Transport implements Competing{
private  TypeBody typeBody;


    double value;
    //String transmission;
    //private String type;
   // String regNumber;
   // private int numberOfSeats;

   // private Insurance insurance;

   // public Insurance getInsurance() {
      //  return insurance;
   // }

   // public void setInsurance(Insurance insurance) {
       // this.insurance = insurance;
  //  }

    //@Override
   /* public void refill() {
        System.out.println("Заправь дизелем");
        System.out.println("Заправь бензином");
        System.out.println("Заправь на электропарковке");
    }

   // public class Key {
       // private String remLaunch;
      //  private String keyless;
      //  public  Key(String remLaunch,String keyless){
          //  if (remLaunch==null||remLaunch.isEmpty()){
          //      System.out.println("Информация не указана");}
           // else {this.remLaunch = remLaunch;}
          //  if (keyless==null||keyless.isEmpty()){
               // System.out.println("Информация не указана");}
           // else {this.keyless = keyless;}
      //  }

       // public String getRemLaunch() {
           // return remLaunch;
       // }

       // public void setRemLaunch(String remLaunch) {
           // this.remLaunch = remLaunch;
       // }

       // public String getKeyless() {
       //     return keyless;
       // }

       // public void setKeyless(String keyless) {
           // this.keyless = keyless;
       // }
   // }
   // public static class Insurance{
       // private static String validityPeriod;
      //  private static int prise;
       // private static String number;

       // public static String getValidityPeriod() {
           // return validityPeriod;
       // }

       // public static int getPrise() {
            //return prise;
       // }

       // public static String getNumber() {
         //   return number;

       // }


        //public static void setValidityPeriod(String validityPeriod) {
          //  Insurance.validityPeriod = validityPeriod;
        //}

        //public static void setPrise(int prise) {
           // Insurance.prise = prise;
       // }

       // public static void setNumber(String number) {
           // if (number.length() != 9) {
           //     System.out.println("Номер страховки некорректный");
          //  }
           // Insurance.number = number;
       // }

       // public Insurance(String validityPeriod, int prise, String number){
          //  if (validityPeriod==null||validityPeriod.isEmpty()){
              //  System.out.println("Информация не указана");}
           // else {this.validityPeriod = validityPeriod;}
          //  if (prise<=0){
           //     System.out.println("Информация не указана");}
           // else {this.prise = prise;}
          //  if (number==null||number.isEmpty()){
            //    System.out.println("Информация не указана");}
           // else {this.number = number;}


       // }

  //  }

*/

    public TypeBody getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(TypeBody typeBody) {
        this.typeBody = typeBody;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    //public String getTransmission() {
      //  return transmission;
   // }

   // public void setTransmission(String transmission) {
       // this.transmission = transmission;
   // }

    //public String getType() {
      //  return type;
   // }

    //public void setType(String type) {
      //  this.type = type;
  //  }

   // public String getRegNumber() {
     //   return regNumber;
  //  }

   // public void setRegNumber(String regNumber) {
       // this.regNumber = regNumber;
   // }

   // public int getNumberOfSeats() {
       // return numberOfSeats;
   // }

   // public void setNumberOfSeats(int numberOfSeats) {
       // this.numberOfSeats = numberOfSeats;
   // }*/



    public PassengerCars(String marka, String model,/* String country, String color, int yearOfRelease, int maxSpeed,*/ double value,TypeBody typeBody/*, String transmission, String regNumber, String type, int numberOfSeats*/) {
        super(marka,model/*,yearOfRelease,country,color,maxSpeed*/);
        if (value==0.0){
            this.value = 1.5;}
        else {this.value = value;}
        this.typeBody=typeBody;
       // this.transmission=transmission;
       // this.type=type;
       // this.regNumber=regNumber;
        //this.numberOfSeats=numberOfSeats;


    }

    @Override
    public String toString() {
        return getMarka() + getModel() + value+" ";// + color + getYearOfRelease()+" "+getCountry()+ transmission+" "+type+" "+regNumber+" "+numberOfSeats;
    }

    @Override
    public String pitstop() {
        return null;
    }

    @Override
    public double BestLapTime() {
        return 0;
    }

    @Override
    public int maxSpeed() {
        return 0;
    }

    @Override
    public  void PrintType() {
        if(typeBody==null){
            System.out.println("Данных по авто недостаточно");
        }else{
            System.out.println("Тип авто "+ typeBody);
    }
}}
