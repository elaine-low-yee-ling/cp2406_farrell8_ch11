public class UseBook {
    public static void main(String[] args) {
        Fiction storybook = new Fiction("Beauty and the Beast");
        NonFiction magazine = new NonFiction("8Days");
        System.out.println("Fiction: " + storybook.getBookTitle()
                + "\n Cost: $" + storybook.getBookPrice());
        System.out.println("Non-Fiction: " + magazine.getBookTitle()
                + "\n Cost: $" + magazine.getBookPrice());

    }
}
