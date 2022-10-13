package Transport;

public enum Capacyty{
    VERY_SMALL(0,10),
    SMALL (10,25),
    MEDIUM (40,50),
    BIG (60,80),
    VERY_BIG(100,120);
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
