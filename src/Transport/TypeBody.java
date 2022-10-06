package Transport;

public enum TypeBody {
    N1("Седан"), N2("Хетчбек"), N3("Купе"), N4("Универсал"), N5("Внедорожни"), N6("Кроссовер"), N7("Пикап"), N8("Фургон"), N9("Минивэн");
    private String type;

    TypeBody(String type) {
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


