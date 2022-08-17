public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Николаевич", "Толстой");
        System.out.println(levTolstoy);
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1867);
        System.out.println(warAndPeace);
        warAndPeace.setPublishingYear(1868);
        System.out.println("Новый год издания - " + warAndPeace.getPublishingYear());

        System.out.println("Книга: " + warAndPeace.getBookName() + "....." + levTolstoy + "....." + "Год издания: " + warAndPeace.getPublishingYear());

        System.out.println();


        Author isaiKalashnikov = new Author("Исай", "Калистратович", "Калашников");
        System.out.println(isaiKalashnikov);
        Book cruelCentury = new Book("Жестокий мир", isaiKalashnikov, 1978);
        System.out.println(cruelCentury);
        System.out.println();

        System.out.println("Авторы одинаковые? - " + levTolstoy.equals(isaiKalashnikov));
        System.out.println("Книги одинаковые? - " + warAndPeace.equals(cruelCentury));


    }
}