public class BookArray {
    public static void main(String[] args) {
        Book booklist[] = new Book[10];
        int i;
        booklist[0] = new Fiction("Jane Eyre");
        booklist[1] = new NonFiction("Rich Dad, Poor Dad");
        booklist[2] = new Fiction("Percy Jackson and the Lightning Thief");
        booklist[3] = new NonFiction("When Breath Becomes Air");
        booklist[4] = new Fiction("A Game of Thrones");
        booklist[5] = new NonFiction("1776");
        booklist[6] = new Fiction("To Kill A Mockingbird");
        booklist[7] = new NonFiction("The Rise and Fall of the Third Reich");
        booklist[8] = new Fiction("Brave New World");
        booklist[9] = new NonFiction("Mein Kampf");

        for (i = 0; i < booklist.length; i++) {
            System.out.println("Book: " + booklist[i].getBookTitle()
            + "\n Cost: $" + booklist[i].getBookPrice());
        }
    }
}
