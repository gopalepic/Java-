package OOPs;

public class trail {
    public static void main(String[] args) {
        
       // creating an object then return the values 

       // if we created the function with static , we don't have to create the obj
       int value = know.get();
       System.out.println("VALUE " + value);


       // but if the function don't have static , means the methon have its persnal items
       // then first we needed to be that persons friend 

       // This is only work when we are not creating our custom constructor 
    //    know jessica = new know();
    //    System.out.println("hey myItems , please share your resources with me " + jessica.myItems());

    know jessica = new know("jess");
    System.out.println(jessica);

       
    }
}

 class know{

    int waterBottle = 0;
    int tiffin;
    int bag ; 
    String name = "kalo" ;

    // this is my constructor
    public know(String student_Name){
        
         this.name = student_Name;
         tiffin = 1;
         bag=1;
         waterBottle = 1;
          System.out.println("Hello everyOne , My name is " + name + " and today i bring " +tiffin + " tiffin ,"+bag + " bag ,");

    }

    public static int get(){
        return 1 ;
    }

    public int myItems(){
        int waterbottle = 3;
        int tiffin = 2;
        int bag = 1 ; 

        return waterbottle+tiffin+bag;
    }
}
