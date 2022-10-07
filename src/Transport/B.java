package Transport;

public class B extends Driver{
    public B(String marka, String model, String name, String license, int experience, Transport transport) {

        super(marka,model,name,license,experience,transport);
    }

    @Override
    public String toString() {
        return "B{}";
    }
}
