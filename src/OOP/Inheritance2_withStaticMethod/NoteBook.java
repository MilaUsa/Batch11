package OOP.Inheritance2_withStaticMethod;

public class NoteBook extends Book{
    @Override
    public int getNumberOfPages() {
        return 500;
    }

    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.getNumberOfPages());

        NoteBook noteBook= new NoteBook();
        System.out.println(noteBook.getNumberOfPages());
    }
}
