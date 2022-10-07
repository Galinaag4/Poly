package Transport;

public class Driver <T extends Transport & Competing>{
   private String name;
   private String license;
   private int experience;
   private Transport transport;

    public Driver(String marka, String model, String name, String license, int experience, Transport transport) {
        super();
        this.name = name;
        this.license = license;
        this.experience = experience;
        this.transport=transport;
    }



    public String getName() {
        return name;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void start(){
        System.out.println("Начинаю движение");

    }
    public void stop(){
        System.out.println("Остановливаюсь");

    }
    public void refuelTheCar(){
        System.out.println("Заправляю авто");

    }
}
