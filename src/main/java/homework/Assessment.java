package homework;

import java.util.Arrays;

public class Assessment {

    //Question 4
    public static void javaMethod(){
        System.out.println("Learning Java Is Fun");
    }

    //Question 5
    public static int sum(int k){
        return 0;
    }
    public static void main(String[] args) {
        //Question 1
        String firstName = "Christopher";
        String lastName = "Vasquez";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println("");

        //Question 2
        int[] firstArray = {103,23,34,41,75};
        int[] secondArray = {66,75,18,91,120};
        System.out.println(firstArray[3] * secondArray[1]);
        firstArray[4] = 69;
        System.out.println(firstArray[4] / firstArray[1]);
        System.out.println("");

        //Question 3
        String[] artists = {"Linkin Park", "Queen", "Rihanna"};
        int indexPosition = 0;
        while(indexPosition < artists.length){
            System.out.println(artists[indexPosition]);
            indexPosition++;
        }
        System.out.println("");

        //Question 4
        javaMethod();
        System.out.println("");

        //Question 5
        int result = sum(5);

        //Question 6
        int y = 13;
        while(y <= 19){
            System.out.println(y);
            y++;
        }
        System.out.println("");

        //Question 7
        int a = 20;
        for(int b = 1; b < a; b+=2){
            System.out.println(b);
        }
        System.out.println("");

        //Question 8
        char[] studentGradeLetter = {'A', 'B', 'C', 'D', 'F'};
        int studentGrade = 69;
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
        System.out.println("");

        //Question 9
        int[] numbersArray = {2, 34, 7, 48, 0, 13, 24};
        for(int arrayPosition = 0; arrayPosition < numbersArray.length; arrayPosition++){
            System.out.println(numbersArray[arrayPosition]);
        }
        System.out.println(Arrays.stream(numbersArray).sum());
        System.out.println(Arrays.stream(numbersArray).sum() / numbersArray.length);
        System.out.println("");

        //Question 10
        int c = 1;

    }
}
