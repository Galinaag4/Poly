package Transport;

public enum Capacyty{
    VerySmall(0,10),
    Small (10,25),
    Medium (40,50),
    Big (60,80),
    VeryBig(100,120);
    private int from;
    private int to;

    Capacyty(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Capacyty{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
