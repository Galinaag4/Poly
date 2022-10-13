package Transport;

public enum Tonnage {
    N1(0D,3.5),
    N2(3.5, 12D),
    N3(12D,0);
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

    @Override
    public String toString() {
        return "Tonnage{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
