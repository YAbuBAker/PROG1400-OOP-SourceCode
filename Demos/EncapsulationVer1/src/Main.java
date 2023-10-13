public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student yousef = new Student("Yousef",77,87);
        yousef = new Student("Yousef Abu Baker",77,87);
        yousef = new Student("Yousef Abu Baker",77,99);
        System.out.println(yousef.stdReport());


    }
}