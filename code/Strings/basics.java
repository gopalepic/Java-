package code.Strings;

public class basics {
    public static void main(String[] args){
         String first = "Gopal";
         String Last = "Soni";

         // Concatenation (+)

         String fullName = first + " " + Last;
         System.out.println(fullName);

         // Length(.length())

         System.out.println(fullName.length());

         // CharAt

         for(int i = 0 ; i<fullName.length() ; i++){
            System.out.println(fullName.charAt(i));
         }

         //Comparing

         String name1 = "Tony";
         String Name2 = "Toney";

           

         if(name1.compareTo(Name2) == 0){
            System.out.println("Both are equals");
         }
         else{
            System.out.println("Given Strings are not equal");
         }

         // Conversion to Integers 

         String convertintoInteger= "1232434";
         int number = Integer.parseInt(convertintoInteger);
         System.out.println("I am converted from string " + "which was initial " + convertintoInteger + " and now " + number );

             // conversion from integer to string
        
         String BacktoString = Integer.toString(number);
         System.out.println(BacktoString);
    }


}
