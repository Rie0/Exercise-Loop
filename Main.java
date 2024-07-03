import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//***********************************EX1***********************************


//        for (int i=1;i<=100;i++){
//            if (i%3==0&&i%5==0){
//                System.out.println("FizzBuzz.");
//                continue;
//            }
//            if (i%3==0){
//                System.out.println("Fizz.");
//                continue;
//            }
//            if (i%5==0){
//                System.out.println("Buzz.");
//                continue;
//            }
//            System.out.println(i);
//        }

//***********************************EX2***********************************


//        System.out.println("Enter a sentence to reverse: ");
//        String sentence = sc.nextLine();
//
//        int charPointer=sentence.length()-1;
//        StringBuilder sb = new StringBuilder();
//        do {
//                sb.append((sentence.charAt(charPointer)));
//                --charPointer;
//        }while (charPointer>=0);
//        System.out.println("Reversed String: "+sb);

//***********************************EX3***********************************


//        System.out.println("Enter a number to find it's factorial value:");
//        long num= sc.nextLong(); //used long to store the biggest number possible.
//        long sum=1;
//        do{
//            sum=num*sum;
//            --num;
//        } while(num!=0);
//        System.out.println(sum);


//***********************************EX4***********************************

//        System.out.println("Enter the number: ");
//        int num1= sc.nextInt();
//        System.out.println("Enter the power: ");
//        int num2= sc.nextInt();
//        int result=num1;
//        for (int i=1; i<num2;i++){
//            result=result*num1;
//        }
//        System.out.println(num1+" raised to the power of "+num2+" = "+result);

//***********************************EX5***********************************

//        System.out.println("Enter the number: ");
//        int number= sc.nextInt();
//        int eSum=0;
//        int oSum=0;
//
//        do{
//            if(number%2==0){//even
//                eSum+=number;
//            }else {//odd
//                oSum+=number;
//            }
//            --number;
//        }while (number>0);
//        System.out.println("Sum of even numbers: "+eSum);
//        System.out.println("Sum of odd numbers: "+oSum);

//***********************************EX6***********************************


//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//        int divider = 2;
//        boolean isPrime=true;
//        while(number<0){
//            System.out.println("Only positive numbers. Try again.");
//            number = sc.nextInt();
//        }
//        do {
//            if (number==2){ //exclude 2 due to the divider starting from 2.
//                break;
//            }else if(number%divider==0||number==1){
//                isPrime=false;
//                break;
//            }
//            ++divider;
//        }
//        while(number>divider);
//        if (isPrime){
//            System.out.println("Is a prime number.");
//            }
//        else {
//            System.out.println("Not a prime number.");
//        }



//***********************************EX7***********************************


//        for (int i = 1; i <= 4 ; i++) {
//            System.out.println("Week"+i);
//
//            for (int j = 1; j <= 7; j++) {
//                System.out.println("Day"+j);
//            }}

//***********************************EX8***********************************

//        System.out.println("Enter a word to cheek if it's palindrome:");
//        String word = sc.nextLine();
//        Boolean isPalindrome=true;
//        int pointer=word.length()-1;
//
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) != word.charAt(pointer)){
//                isPalindrome=false;
//                break;}
//            --pointer;
//
//        } System.out.println("Is word Palindrome = "+isPalindrome);


    }
        }