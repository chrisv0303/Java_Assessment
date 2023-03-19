package homework;

import java.util.Arrays;

public class Assessment {

    //Question 4
    public static void javaMethod(){
        System.out.println("Learning Java Is Fun");
    }

    //Question 5
    public static int anyNumber(int x){
        return x;
    }

    //Question 10
    public static void yearUpNumbers(){
        for(int y = 45; 0 < y; y--){
            if(y % 15 == 0) {
                System.out.println("YearUp");
            }else if(y % 5 == 0){
                System.out.println("Up");
            }else if(y % 3 == 0){
                System.out.println("Year");
            }else{
                System.out.println(y);
            }
        }
    }
    public static void main(String[] args) {
        //Question 1
        String firstName = "Christopher";
        String lastName = "Vasquez";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println("");//Only used to print empty space for next code!

        //Question 2
        int[] firstArray = {103,23,34,41,75};
        int[] secondArray = {66,75,18,91,120};
        System.out.println(firstArray[3] * secondArray[1]);
        firstArray[4] = 69;
        System.out.println(firstArray[4] / firstArray[1]);
        System.out.println("");//Only used to print empty space for next code!

        //Question 3
        String[] artists = {"Linkin Park", "Queen", "Imagine Dragons"};
        int indexPosition = 0;
        while(indexPosition < artists.length){
            System.out.println(artists[indexPosition]);
            indexPosition++;
        }
        System.out.println("");//Only used to print empty space for next code!

        //Question 4
        javaMethod();
        System.out.println("");//Only used to print empty space for next code!

        //Question 5
        for(int z = 0; z <= anyNumber(6); z++){
            System.out.println(z);
        }
        System.out.println("");//Only used to print empty space for next code!

        //Question 6
        for(int y = 13; y <= 19; y++){
            System.out.println(y);
        }
        System.out.println("");//Only used to print empty space for next code!

        //Question 7
        for(int a = 1; a < 20; a += 2){
            System.out.println(a);
        }
        System.out.println("");//Only used to print empty space for next code!

        //Question 8
        char[] studentGradeLetter = {'A', 'B', 'C', 'D', 'F'};
        int studentGrade = 89;
        if(studentGrade >= 90 && studentGrade <= 100){
            System.out.println("You got an " + studentGradeLetter[0]);
        }else if(studentGrade >= 80 && studentGrade <= 89){
            System.out.println("You got a " + studentGradeLetter[1]);
        }else if(studentGrade >= 70 && studentGrade <= 79){
            System.out.println("You got a " + studentGradeLetter[2]);
        }else if(studentGrade >= 60 && studentGrade <= 69){
            System.out.println("You got a " + studentGradeLetter[3]);
        }else if(studentGrade < 60){
            System.out.println("You got an " + studentGradeLetter[4]);
        }else{
            System.out.println("Invalid! Out of Range!");
        }
        System.out.println("");//Only used to print empty space for next code!

        //Question 9
        int[] numbersArray = {2, 34, 7, 48, 0, 13, 24};
        for(int arrayPosition = 0; arrayPosition < numbersArray.length; arrayPosition++){
            System.out.println(numbersArray[arrayPosition]);
        }
        System.out.println(Arrays.stream(numbersArray).sum() + " - sum");
        System.out.println(Arrays.stream(numbersArray).sum() / numbersArray.length + " - average");
        System.out.println("");//Only used to print empty space for next code!

        //Question 10
        yearUpNumbers();

    }
}
