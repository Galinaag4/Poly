package Transport;

import java.util.Objects;

public class Sponsor {
    private String name;
    private int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
    public void toSponsor(){
        System.out.printf("Спонсор %s проспонсировал заезд на %d%n",name,amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sponsor)) return false;
        Sponsor sponsor = (Sponsor) o;
        return getAmount() == sponsor.getAmount() && Objects.equals(getName(), sponsor.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAmount());
    }
}

