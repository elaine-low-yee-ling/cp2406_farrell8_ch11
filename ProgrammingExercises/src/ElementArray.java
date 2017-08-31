public class ElementArray {
    public static void main(String[] args) {
        Element elementList[] = new Element[4];
        int i;
        elementList[0] = new MetalElement("Li", 3, 6.94);
        elementList[1] = new NonMetalElement("Boron", 5, 10.81);
        elementList[2] = new MetalElement("Na", 11, 22.99);
        elementList[3] = new NonMetalElement("Si", 14, 28.09);

        for (i = 0; i < elementList.length; i++) {
            elementList[i].describeElement();
        }
    }
}
