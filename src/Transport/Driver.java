package Transport;

public class Driver <T extends Trucks & Competing>{
    String name;
    String license;
    int experience;

    public Driver(String name,String license,int experience) {

        this.name = name;
        this.license = license;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
