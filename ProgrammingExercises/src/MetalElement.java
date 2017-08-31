public class MetalElement extends Element {

    public MetalElement(String s, int num, double weight) {
        super(s, num, weight);
    }

    public void describeElement() {
        System.out.println("A metal element such as " + getSymbol()
                + " with the atomic number " + getAtomicNumber()
                + " and the atomic weight " + getAtomicWeight()
                + " is a good conductor of electricity.");
    }
}
