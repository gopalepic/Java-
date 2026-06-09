package code.Strings;

public class stringbuilder {
    public static void main(String[] args) {
        

        StringBuilder sb = new StringBuilder("Gopal");
        sb.insert(4, "E");
        System.out.println("I am Inserted " +sb);

        sb.append("hi");
        System.out.println("I am appended " + sb);

        sb.delete(0, 3);
        System.out.println("I am deleted sb " + sb);
    }
}
