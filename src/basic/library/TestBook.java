package basic.library;
import basic.Author;

public class TestBook {


    public static void main(String[] args) {

        Author author1 = new Author("John Doe", "john_doe@email.com", 'd', "noInstagram");
        Book book1 = new Book("html", author1, 119);
        Book book2 = new Book("java", new Author("Jane Doe", "jane_doe@email.com", 'f', "noInstagram"), 329);

        System.out.println(book1);
        System.out.println();
        System.out.println(book2);

        author1.setName("NewJohn");
        System.out.println();
        System.out.println(book1);
        System.out.println();
        System.out.println(book2);


        System.out.println();
        System.out.println(book1);
        System.out.println();
        System.out.println(book2);

        book1.getAuthor().setName("NewNewJohn");
        System.out.println(author1.getName());

        book2.getAuthor().setName("NewJane");
        System.out.println();
        System.out.println(book1);
        System.out.println();
        System.out.println(book2);


        BookMultiAuthor book3 = new BookMultiAuthor("GroupJava", new Author[] {
                new Author("John Doe", "john.doe@mail.com", 'd', "noInstagram"),
                new Author("Jane Doe", "jane.doe@mail.com", 'f', "noInstagram")},
                229);


        System.out.println();
        System.out.println();
        System.out.println(book3);
        System.out.println();
        System.out.println();
        System.out.println(book3.getAuthor());


    }

}
