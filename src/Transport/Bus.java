package Transport;

public class Bus extends Transport implements Competing{
    double value;
    public Bus(String marka, String model,/* int yearOfRelease, String country, String color, int maxSpeed,*/double value) {
        super(marka,model);/*, yearOfRelease, country, color, maxSpeed);*/
        this.value=value;
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
    public double BestLapTime() {
        return 0;
    }

    @Override
    public int maxSpeed() {
        return 0;
    }
}

