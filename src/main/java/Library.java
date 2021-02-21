public class Library {
    public static void main(String[] args) {

        Book book = Book.of("ALicja w krainie czarów", "Lewis Carroll");
        System.out.println(book.getAuthor() + " - " + book.getTitle());
    }
}