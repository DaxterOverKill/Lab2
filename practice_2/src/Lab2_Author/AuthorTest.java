package Lab2_Author;

import java.lang.*;
public class AuthorTest {
    public static void main(String[] args) {
        Author d1 = new Author("Macks", "MamamMia@mail.ru", 'm');
        Author d2 = new Author("Victoria", "GloryHoly@yandex.ru", 'm');
        Author d3 = new Author("Gaz","deja_vu@rambler.ru");
        System.out.println(d1);
        d1.out();
        d2.out();
        d3.out();
        System.out.println();
    }
}