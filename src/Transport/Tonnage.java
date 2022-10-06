package Transport;

public enum Tonnage {
    N1(0.0,3.5),
    N2(3.5, 12),
    N3(12,0);
    private double from;
    private double to;

    Tonnage(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

}
