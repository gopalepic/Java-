package code.Patterns;

public class ASCIIVALUES {
    

    public static void main(String[] args) {
      
       
        char character = 'A';
        int value = (int) character;

        while(value < 92){
            System.out.println("Char " + character + "--> "+ value);
            character = (char) value ;
            value++;
        }

        value = 97;
        while(value <=122){
                    System.out.println("VALUE " + value);
            System.out.println("Char " + character + " Value " + value);
            character = (char) value ;
            value=value+1;
        }
    }}

    

