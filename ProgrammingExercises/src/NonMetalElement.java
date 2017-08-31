public class NonMetalElement extends Element {

    public NonMetalElement(String s, int num, double weight) {
        super(s, num, weight);
    }

    public void describeElement() {
        System.out.println("A non-metal element such as " + getSymbol()
                + " with the atomic number " + getAtomicNumber()
                + " and the atomic weight " + getAtomicWeight()
                + " is a poor conductor of electricity.");
    }
}
