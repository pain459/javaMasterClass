package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);
        result = result - 1;
        System.out.println(result);
        result = result * 10;  // 2 * 10 = 20
        System.out.println(result);
        result = result / 5;  // 20 / 5 = 4
        System.out.println(result);
        result = result % 3;
        System.out.println(result);
        result++;  // result  = result + 1
//        result += 1;  // result = result + 1
        System.out.println(result);
        result--;
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result *= 10;
        System.out.println(result);
        result /= 3;
        System.out.println(result);
        result -= 2;
        System.out.println(result);
//        Working on if-then statements.
        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an alien");
            System.out.println("and I'm scared of them");
        }

//        Using all knowledge on operators.
        int player1TopScore = 186;
        int player2TopScore = 194;
        if ((player1TopScore >= 186) && (player2TopScore <= 195)){
            System.out.println("This should print if I'm correct.");
        }
        if ((player1TopScore <= 100) || (player2TopScore <= 195)){
            System.out.println("This will print if OR operator s working as expected");
        }
        boolean isTrue = false;
        if (isTrue == true){  // assigning with == is important. if you give =, the value will be carried as true in this case.
            System.out.println("This won't print. It doesn't mean its a error.");
        }
//        Testing ternary operators.
        boolean isCar = true;
        boolean wasCar = isCar ? false : true;
        if(wasCar){
            System.out.println("I'm not sure what the F is going on.");
        }

    }
}
