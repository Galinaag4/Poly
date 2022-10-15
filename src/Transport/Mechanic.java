package Transport;

public class Mechanic <T extends Transport> {
    private String name;
    private String sername;
    private String company;


    public Mechanic(String name, String sername, String company) {
        this.name = name;
        this.sername = sername;
        this.company = company;

}

    public String getName() {
        return name;
    }

    public String getSername() {
        return sername;
    }

    public String getCompany() {
        return company;
    }
    public boolean  servise(T t){
     return t.servise();

    }
    public void repair(T t){
        t.repair();

    }
}
