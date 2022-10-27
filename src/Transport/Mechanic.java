package Transport;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(getName(), mechanic.getName()) && Objects.equals(getSername(), mechanic.getSername()) && Objects.equals(getCompany(), mechanic.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSername(), getCompany());
    }
}
