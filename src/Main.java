public class Main {
    public static void main(String[] args) {

        // Zadatak 1

        int spentMoney = -5;
        int givenMoney = 100;
        //double cashState = 100;

        int apoen20 = 20;
        int apoen10 = 10;
        int apoen2 = 2;
        int apoen1 = 1;

        int cashState20 = 5;
        int cashState10 = 5;
        int cashState2 = 5;
        int cashState1 = 5;

        /*double apoen05 = 0.5;
        double apoen02 = 0.2;
        double apoen01 = 0.1;
        double apoen001 = 0.01;*/

        if ((spentMoney > 0)) {

            if (givenMoney > 100) {
                System.out.println("You have too much money, you lucky person!");
            } else {

                int change1 = givenMoney - spentMoney;
                int numApoen20 = 0;
                int numApoen10 = 0;
                int numApoen2 = 0;
                int numApoen1 = 0;
                int numApoen05 = 0;
                int numApoen02 = 0;
                int numApoen01 = 0;
                int numApoen001 = 0;

                if ((change1 / apoen20) >= 1) {
                    numApoen20 = (change1 / apoen20);

                    int change2 = change1 % apoen20;

                    if ((change2 / apoen10) >= 1) {
                        numApoen10 = change2 / apoen10;

                        int change3 = change2 % apoen10;

                        if ((change3 / apoen2) >= 1) {
                            numApoen2 = change3 / apoen2;

                            int change4 = change3 % apoen2;

                            if ((change4 / apoen1) >= 1) {
                                numApoen1 = change4 / apoen1;

                               /* int change5 = change4 % apoen1;

                                if ((change5 / apoen05) >= 1) {
                                    numApoen05 = change5 / apoen05;

                                    int change6 = change5 % apoen05;

                                    if ((change6 / apoen01) >= 1) {
                                        numApoen01 = change6 / apoen01;

                                        int change7 = change6 % apoen01;

                                        if ((change7 / apoen001) >= 1)
                                        {
                                            numApoen001 = change7 / apoen001;
                                        }

                                    }


                                }*/
                            }


                        }


                    }

                } else if ((change1 / apoen10) >= 1) {

                    numApoen10 = change1 / apoen10;

                    int change3 = change1 % apoen10;

                    if ((change3 / apoen2) >= 1) {
                        numApoen2 = change3 / apoen2;

                        int change4 = change3 % apoen2;

                        if ((change4 / apoen1) >= 1) {
                            numApoen1 = change4 / apoen1;

                               /* int change5 = change4 % apoen1;

                                if ((change5 / apoen05) >= 1) {
                                    numApoen05 = change5 / apoen05;

                                    int change6 = change5 % apoen05;

                                    if ((change6 / apoen01) >= 1) {
                                        numApoen01 = change6 / apoen01;

                                        int change7 = change6 % apoen01;

                                        if ((change7 / apoen001) >= 1)
                                        {
                                            numApoen001 = change7 / apoen001;
                                        }

                                    }


                                }*/
                        }


                    }


                } else if ((change1 / apoen2) >= 1) {
                    numApoen2 = change1 / apoen2;

                    int change4 = change1 % apoen2;

                    if ((change4 / apoen1) >= 1) {
                        numApoen1 = change4 / apoen1;

                               /* int change5 = change4 % apoen1;

                                if ((change5 / apoen05) >= 1) {
                                    numApoen05 = change5 / apoen05;

                                    int change6 = change5 % apoen05;

                                    if ((change6 / apoen01) >= 1) {
                                        numApoen01 = change6 / apoen01;

                                        int change7 = change6 % apoen01;

                                        if ((change7 / apoen001) >= 1)
                                        {
                                            numApoen001 = change7 / apoen001;
                                        }

                                    }


                                }*/
                    }

                } else if ((change1 / apoen1) >= 1) {
                    numApoen1 = change1 / apoen1;

                    /*int change4 = change1 % apoen2;

                    if ((change4 / apoen2) >= 1) {
                        numApoen1 = change4 / apoen1;

                               int change5 = change4 % apoen1;

                                if ((change5 / apoen05) >= 1) {
                                    numApoen05 = change5 / apoen05;

                                    int change6 = change5 % apoen05;

                                    if ((change6 / apoen01) >= 1) {
                                        numApoen01 = change6 / apoen01;

                                        int change7 = change6 % apoen01;

                                        if ((change7 / apoen001) >= 1)
                                        {
                                            numApoen001 = change7 / apoen001;
                                        }

                                    }


                                }*/
                }

                System.out.println("20 KM: " + numApoen20);
                System.out.println("10 KM: " + numApoen10);
                System.out.println("2 KM: " + numApoen2);
                System.out.println("1 KM: " + numApoen1);
                System.out.println("0.5 KM: " + numApoen05);
                System.out.println("0.1 KM: " + numApoen01);
                System.out.println("0.01 KM: " + numApoen001);
            }
        }
         else {
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