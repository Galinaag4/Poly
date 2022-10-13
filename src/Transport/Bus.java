package Transport;

public class Bus extends Transport implements Competing{
   private Capacyty capacyty;

    double value;
    public Bus(String marka, String model,/* int yearOfRelease, String country, String color, int maxSpeed,*/double value,Capacyty capacyty) {
        super(marka,model);/*, yearOfRelease, country, color, maxSpeed);*/
        this.value=value;
        this.capacyty=capacyty;
    }

    public Capacyty getCapacyty() {
        return capacyty;
    }

    public void setCapacyty(Capacyty capacyty) {
        this.capacyty = capacyty;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
//@Override
    /*public void refill() {
        System.out.println("Заправь дизелем");
        System.out.println("Заправь бензином");
    }*/

    @Override
    public String toString() {
        return getMarka() + getModel()+ value;}// +  color + getYearOfRelease()+" "+getCountry();

    @Override
    public String pitstop() {
        return null;
    }

    @Override
    public double bestLapTime() {
        return 0;
    }

    @Override
    public int maxSpeed() {
        return 0;
    }

    @Override
    public  boolean servise(){
        System.out.println("Автобус"+getMarka()+" "+getModel()+ "в диагностике не требуется");
      return true;
    }

    @Override
    public void printType() {
        if(capacyty==null){
            System.out.println("Данных по авто недостаточно");
        }else{
            System.out.println("Наполняемость  от "+ capacyty.getFrom()+ " до " + capacyty.getTo());

}}}

