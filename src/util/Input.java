package util;


import java.util.Scanner;

public class Input {
    private  Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public  String getString(){
        System.out.println("Enter your input: ");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }


    public boolean yesNo() {
        System.out.println("yes or no: ");
        String userInput = scanner.nextLine().toLowerCase();
        if (userInput.equals("yes") || userInput.equals("y")) {
            return true;
        } else {
            return false;
        }
    }


    public int getInt(){
//        System.out.println("Enter an integer: ");
        return scanner.nextInt();
//        return Integer.valueOf(getString());
    }
    public int getInt(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter an integer between %d and %d:%n",min,max);
        int userInput = scanner.nextInt();

        if (userInput >= min && userInput <= max) {
            System.out.printf("You entered %d which is within the range!%n", userInput);
            return userInput;
        } else {
            System.out.printf("You entered %d, which is out of the range", userInput);
        }

        return userInput;
    }



    public double getDouble(String prompt){
        System.out.println(prompt);
//        return scanner.nextDouble();
        return Double.valueOf(getString());
    }
    public double getDouble(double min2, double max2){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a decimal number between %s and %s:%n",min2,max2);
        double userInput2 = scanner.nextDouble();

        if (userInput2 >= min2 && userInput2 <= max2) {
            System.out.printf("You entered %s%n which is within the range!", userInput2);
            return userInput2;
        } else {
            System.out.printf("You entered %s, which is out of the range%n", userInput2);
        }

        return userInput2;
    }
    public Input (){
        scanner = new Scanner(System.in);
    }



//

//
//    public int getInt(){
//
//    }
//
//    public double getDouble(double min, double max){
//
//    }
//
//    double getDouble(){
//
//    }
}
