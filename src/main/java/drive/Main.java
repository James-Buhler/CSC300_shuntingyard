package drive;

public class Main {
    public static void main(String[] args) {
        ShuntingYard a = new ShuntingYard();
        a.read("(4+3)*5+(6-1)");
        System.out.println(a.process());
    }
}