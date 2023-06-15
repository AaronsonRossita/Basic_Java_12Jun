import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 4;
        int y = 5;
        long l = 5235325L;
        float f = 4f;
        double z = 3.4;

//        System.out.println(Math.max(x,y));
        double result1 = Math.sqrt(x);
        double result2 = Math.floor(z);
        double result3 = Math.ceil(z);
        double result4 = Math.round(z);

//        int random = (int)(Math.random() * 10 + 1);
        int random = (int)Math.round(Math.random() * 10 + 1);

        int number1 = (int)Math.round(Math.random() * 5 + 1);
        int number2 = (int)Math.round(Math.random() * 5);
        if(number1 == 6){
            number1 = 5;
        }
        if(number2 == 0){
            number2 = 1;
        }

//        if(number1 == number2){
//            System.out.println( String.format("two numbers are equal with the value of %s", number1));
//        }else{
//            System.out.println(String.format("two numbers are not equal,\nthe first number is %s and the second one is %s",number1,number2));
//        }


//        for (int i = 0; i < 5; i++){
//            System.out.println("i = " + i);
//        }

        int[] arr1 = {10,20,30,40,50,60};
        arr1[0] = 70;
        arr1[5] = 61;

        int[] arr2 = new int[20];
        arr2[19] = 8;

//        for (int number : arr1){
//            System.out.println(number);
//        }
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] += 5;
//        }
//
//        for (int i = arr1.length-1; i >= 0 ; i--) {
//            System.out.println(arr1[i]);
//        }
//
//        for (int i = arr1.length/2; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }

        int[][] arr3 = {{1,2,3}, {4,5,6}};

        char[][] arr4 = {
                {'a','b'},
                {'c','d','e','f'},
                {'g','h','i'}
        };
//                                i  j
//        System.out.println(arr4[0][0]);
//        System.out.println(arr4[0][1]);
//        System.out.println("------");
//        System.out.println(arr4[1][0]);
//        System.out.println(arr4[1][1]);
//        System.out.println(arr4[1][2]);
//        System.out.println(arr4[1][3]);
//        System.out.println("------");
//        System.out.println(arr4[2][0]);
//        System.out.println(arr4[2][1]);
//        System.out.println(arr4[2][2]);

//        for (int i = 0; i < arr3.length; i++) {
//            System.out.println(arr3[i]);
//        }

//        for (int i = 0; i < arr4.length; i++) {
//            for (int j = 0; j < arr4[i].length; j++) {
//                System.out.println(arr4[i][j]);
//            }
//            System.out.println("j is done");
//        }
        

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i > 0 && i < 4 && j > 0 && j < 4){
//                    System.out.print("  ");
//                }else{
//                    System.out.print(" *");
//                }
//            }
//            System.out.println();
//        }

        int size = 4;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        int numToGuess = (int)(Math.random() * 5 + 1);
        System.out.println(numToGuess);
// WHILE
//        System.out.println("Please try to guess the number");
//        int numUser = scanner.nextInt();
//        int counter = 0;
//        while(numUser != numToGuess){
//            System.out.println("Try again");
//            numUser = scanner.nextInt();
//            counter++;
//        }
//        System.out.println("Congrats");

//DO WHILE
        System.out.println("Please try to guess the number");
        int counter = 0;
        int numUser;
        do{
            System.out.println("Try");
            numUser = scanner.nextInt();
            if (numUser == numToGuess){
                System.out.println("Congrats");
                return;
            }
            counter++;
            System.out.println("counter = " + counter);
        }while (counter < 3);

        if (counter == 3){
            System.out.println("You lost");
        }

    }
}