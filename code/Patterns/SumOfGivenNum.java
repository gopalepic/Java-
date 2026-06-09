package code.Patterns;

public class SumOfGivenNum {
    public static void main(String[] args) {
        // int n = 123456;
    //     int sum = 0;
    //     while (n != 0) {
    //         int lastDigit = n % 10;
    //         sum += lastDigit;
    //         n=n/10;
    //     }
    //     System.out.println("SUM " + sum);
    

    // Productions of each digit of a number 
//  int n = 123456;
    // int product = 1;
    // while (n!=0){
    //     int lastDigit = n%10;
    //     product *= lastDigit;
    //     n=n/10;

    // }
    // System.out.println("PRODUCT " + product);



  // Product of All NON Zeros digit
// int n = 1102030004;
//   int NonZeroProduct = 1;
//   while(n!= 0){
//     int lastDigit = n%10;
//     int multiply = ( lastDigit != 0) ? lastDigit : 1;
//     NonZeroProduct *= multiply;
//     n=n/10;
//   }

//   System.out.println("Product of NON zeros numbers only " + NonZeroProduct);


 // Sum of EVEN digits in a Number only

    //  int n = 1112348333;
    //  int TotalEvenSUm = 0 ;
    //  while(n!=0){
    //     int lastnumber = n%10;
    //     int isEven = (lastnumber % 2 == 0) ? lastnumber : 0 ;
    //     TotalEvenSUm += isEven;
    //     n = n/10;
    //  }
    //  System.out.println("total even NUMBERS sum only " + TotalEvenSUm);




    // Reverse a Number (OPTION 1)

    // int n = 12345;
    // StringBuilder reverseOutput = new StringBuilder();
    //     while(n!=0){
    //     int lastDigit = n%10;
    //     reverseOutput.append(lastDigit);
    //     n=n/10;
    // }
    // n = Integer.parseInt(reverseOutput.toString());
    // System.out.println("NUMBER " + n);


    // Reverse a Number (OPTION 2)

    int n = 12345;

    int Decimal = 0;

    while(n!= 0){
 
        int lastDigit = n%10;   
        Decimal *=10;
        Decimal +=lastDigit;
        n/=10;
        
    }

    System.out.println("REVERSED NUM " + Decimal);

    
}
}