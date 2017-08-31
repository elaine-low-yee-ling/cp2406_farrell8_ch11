public abstract class Element {
    private String symbol;
    int atomicNumber;
    double atomicWeight;

    public Element(String s, int num, double weight) {
        symbol = s;
        atomicNumber = num;
        atomicWeight = weight;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public abstract void describeElement();
}
