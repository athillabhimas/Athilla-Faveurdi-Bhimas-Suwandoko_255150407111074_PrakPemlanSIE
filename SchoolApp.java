public class SchoolApp {
    public static void main(String[] args) {
        Student miki = new Student("Miki");
        Student mini = new Student("Mini");


        System.out.println("Grade " + miki.getNama() + " " + miki.getSkor(100));
        System.out.println("Grade " + mini.getNama() + " " + mini.getSkor(100));

        mini.aksesMethod("Mono");

        System.out.println("Grade " + miki.getNama() + " " + miki.getSkor(100));
        System.out.println("Grade " + mini.getNama() + " " + mini.getSkor(100));
    }
}
