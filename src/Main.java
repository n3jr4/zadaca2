import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        // Zadatak 1

        double spentMoney = 66;
        double givenMoney = 100;

        int apoen20 = 20;
        int apoen10 = 10;
        int apoen2 = 2;
        int apoen1 = 1;
        double apoen05 = 0.5;
        double apoen02 = 0.2;
        double apoen01 = 0.1;
        double apoen001 = 0.01;

        int cashState20 = 1;
        int cashState10 = 1;
        int cashState2 = 0;
        int cashState1 = 2;
        int cashState05 = 0;
        int cashState02 = 0;
        int cashState01 = 0;
        int cashState001 =0;

        if ((spentMoney > 0)) {

            if (givenMoney > 100) {
                System.out.println("You have too much money, you lucky person!");
            } else {

                double change = (givenMoney - spentMoney);
                int numApoen20 = 0;
                int numApoen10 = 0;
                int numApoen2 = 0;
                int numApoen1 = 0;
                int numApoen05 = 0;
                int numApoen02 = 0;
                int numApoen01 = 0;
                int numApoen001 = 0;


                double change1 = change;
                System.out.println(change1);

                if ((change1 / apoen20) >= 1) {
                    double numberOf20 = (change1/apoen20);
                   int numberOf20Int = (int)floor(numberOf20);

                    if (numberOf20Int <= cashState20) {
                        numApoen20 = numberOf20Int;
                    }
                    else {
                        numApoen20 = cashState20;
                    }
                    change1 = change1 - (numApoen20 * apoen20);
                }


                if ((change1 / apoen10) >= 1) {
                    double numberOf10 = (change1/apoen10);
                    int numberOf10Int = (int)round(numberOf10);
                    if (numberOf10Int <= cashState10) {
                        numApoen10 = numberOf10Int;
                    }
                    else {
                        numApoen10 = cashState10;
                    }
                    change1 = change1 - (numApoen10 * 10);
                }

                if ((change1 / apoen2) >= 1) {
                    double numberOf2 = (change1/apoen2);
                    int numberOf2Int = (int)floor(numberOf2);
                    if (numberOf2Int <= cashState2) {
                        numApoen2 = numberOf2Int;

                    }
                    else {
                        numApoen2 = cashState2;
                    }
                    change1 = change1 - (numApoen2 * apoen2);

                }

                if ((change1 / apoen1) >= 1) {
                    double numberOf1 = (change1/apoen1);
                    int numberOf1Int = (int)floor(numberOf1);
                    if (numberOf1Int <= cashState1) {
                        numApoen1 = numberOf1Int;
                    }
                    else {
                        numApoen1 = cashState1;
                    }
                    change1 = change1 - (numApoen1 * apoen1);
                }

                if ((change1 / apoen05) >= 1) {
                    double numberOf05 = (change1/apoen05);
                    int numberOf05Int = (int)floor(numberOf05);
                    if (numberOf05 <= cashState05) {
                        numApoen05 = numberOf05Int;
                    }
                    else {
                        numApoen05 = cashState05;
                    }
                    change1 = change1 - (numApoen05 * apoen05);
                }

                if ((change1 / apoen02) >= 1) {
                    double numberOf02 = (change1/apoen02);
                    int numberOf02Int = (int)floor(numberOf02);
                    if (numberOf02 <= cashState02) {
                        numApoen02 = numberOf02Int;
                    }
                    else {
                        numApoen02 = cashState02;
                    }
                    change1 = change1 - (numApoen02 * apoen02);
                }

                if ((change1 / apoen01) >= 1) {
                    double numberOf01 = (change1/apoen01);
                    int numberOf01Int = (int)floor(numberOf01);
                    if (numberOf01Int <= cashState01) {
                        numApoen01 = numberOf01Int;
                    }
                    else {
                        numApoen01 = cashState01;
                    }
                    change1 = change1 - (numApoen01 * apoen01);
                }

                if ((change1 / apoen001) >= 1) {
                    double numberOf001 = (change1/apoen001);
                    int numberOf001Int = (int)floor(numberOf001);
                    if (numberOf001 <= cashState001) {
                        numApoen001 = numberOf001Int;
                    }
                    else {
                        numApoen001 = cashState001;
                    }
                    change1 = change1 - (numApoen001 * apoen001);
                }

                if ((change == change1) || (change1>0)) {
                    System.out.println("SORRY THE CASH REGISTER DOES NOT HAVE THE REQUIRED AMOUNT OF MONEY");
                }

                    System.out.println("20 KM: " + numApoen20);
                    System.out.println("10 KM: " + numApoen10);
                    System.out.println("2 KM: " + numApoen2);
                    System.out.println("1 KM: " + numApoen1);
                    System.out.println("0.5 KM: " + numApoen05);
                    System.out.println("0.1 KM: " + numApoen01);
                    System.out.println("0.01 KM: " + numApoen001);

            }
        } else {
            System.out.println("You didn't buy anything, did you?");
            if (spentMoney < 0) {
                System.out.println("“Did you maybe break something?");
            }
        }


        // Zadatak 2

        double radius = 5;
        double piNumber = 3.14;
        double areaOfCircle = radius * radius * piNumber;
        System.out.println("The area of the circe with given radius is: " + areaOfCircle);

        // Zadatak 3

        int numberA = 58;
        int numberB = 12;
        if ((numberA > 10) && (numberA < 1000) && ((numberA % 3) == 0) && ((numberA % numberB) == 0)) {
            System.out.println("The number " + numberA + " is divisible with number " + numberB + ", divisible by 3, also greater than 10, and smaller than 1000.");
        } else
            System.out.println("The number " + numberA + " is not divisible with number " + numberB + " or doesn't match some of the other conditions - divisible by 3, greater than 10 or smaller than 1000.");

        // Zadatak 4

        int numberAA = 150;
        int numberBB = 2;

        if (numberAA > numberBB) {

            int sumAABB = numberAA + numberBB;
            System.out.println("The number " + numberAA + " is greated than the number " + numberBB + " and their sum is equal to: " + sumAABB + ".");

        } else if (numberAA < numberBB) {

            int diffAABB = numberAA - numberBB;
            System.out.println("The number " + numberAA + " is smaller than the number " + numberBB + " and their difference is equal to: " + diffAABB + ".");
        } else {
            System.out.println("The number " + numberAA + " is qual to the number " + numberBB + ".");
        }
        ;

        // Zadatak 5

        int numberX = 4;
        double resultOp = (((numberX + numberX) + 6) / 2) - numberX;
        if ((resultOp % 2) == 0) {
            System.out.println("The result of the insane operation is divisible by 2.");
        } else {
            System.out.println("The result of the insane operation is not divisible by 2.");
        }
        ;

        // Zadatak 6

        int A = 10;
        int B = 20;
        int C = 30;
        int D = 41;

        int sumABCD;

        if (((A > 0) && (B > 0)) || ((C > 0) && (D > 0))) {
            sumABCD = A + B + C + D;
            System.out.println("Sum of the numbers " + A + ", " + B + ", " + C + ", " + D + " is equal to: " + sumABCD + ".");
            if (sumABCD > 100) {
                System.out.println("The sum is greater than 100");

                if ((sumABCD % 2) == 0) {
                    System.out.println("The sum is divisible by 2");
                    sumABCD = sumABCD / 2;
                } else {
                    sumABCD = sumABCD - 1;
                    if ((sumABCD % 2) == 0) {
                        System.out.println("The sum decreased by 1 is divisible by 2.");
                        sumABCD = sumABCD / 2;
                    } else {
                        System.out.println("The number is still not divisible by 2.");
                    }

                }

            }
        }
    }

    ;
}