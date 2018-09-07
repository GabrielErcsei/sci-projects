package ro.sci.functions.tema1;

import java.sql.SQLOutput;

public class ArithmeticCalculator {

    /**
     *
     * @param a = value given to first parameter
     * @param b = value given to second parameter
     * @return the value of the operation a - b
     */

    public int subtract(int a, int b) {

        int subtractTotal = a - b;

        switch (subtractTotal) {
            case -1:
            case -2:
            case -3:
            case -4:
            case -5:
                System.out.println("Total is between -1 and -5.");
                break;

            default:
                System.out.println("The number must be below -5;");

        }

        return subtractTotal;

    }

    /**
     *
     * @param a = value given to first parameter
     * @param b = value given to second parameter
     * @return the value of the operation a * b
     */
    public int multiply(int a, int b) {

        int multiplyTotal = a * b;


        switch (multiplyTotal) {

            case 10:
                System.out.println("The result is: " + multiplyTotal);
                break;
            case 20:
                System.out.println("The result is: " +multiplyTotal);
                break;
            case 30:
                System.out.println("The result is: " +multiplyTotal);
                break;
            case 40:
                System.out.println("The result is: " +multiplyTotal);
                break;

            default:
                System.out.println("Value might be below 10.");
        }
        return multiplyTotal;
    }

    /**
     *
     * @param a = value given to first parameter
     * @param b = value given to second parameter
     *          - A condition checks to see if parameter a is not equal to 0 and only after that the
     *            switch statement is executed, otherwise an error is printed
     * @return the value of the operation a / b
     */
    public int divide(int a, int b) {

        int divideTotal = 0;


        if (a != 0) {
            divideTotal = a / b;
        } else {
            System.out.println("Can't divide by 0.");
        }

        switch (divideTotal) {


            case 2:
                System.out.println("The result is: " + divideTotal);
                break;
            case 3:
                System.out.println("The result is: " + divideTotal);
                break;
            case 4:
                System.out.println("The result is: " + divideTotal);
                break;
            case 5:
                System.out.println("The result is: " + divideTotal);
                break;
            case 6:
                System.out.println("The result is: " + divideTotal);
                break;
            case 7:
                System.out.println("The result is: " + divideTotal);
                break;
            case 8:
                System.out.println("The result is: " + divideTotal);
                break;
            case 9:
                System.out.println("The result is: " + divideTotal);
                break;
            case 10:
                System.out.println("The result is: " + divideTotal);
                break;

            default:
                System.out.println("Result must be greater that or lower than 10.");

        }
        return divideTotal;
    }

    /**
     *
     * @param monthNumber = a parameter given by the use to check the number of days of the typed month
     * @int year -  a test value to check if a year is a leap year
     * @int month - stored the parameter for later use in the switch statement
     * @int numberOfDays - stores the number of days in a month
     *
     * - a condition check to see if parameter is between 1 and 12 and only after that the code is executed
     *
     * -switch statement check what month was selected and prints out the number of days in that month
     *
     * @boolean isBisect - checks of the year is a leap year
     *
     *
     * @return month name and month days
     */
    
    public int daysInMonthCalculator(int monthNumber) {


        int year = 1004;
        int month = monthNumber;
        int numberOfDays;

        if( month > 12 || month == 0) {
            System.out.println("Incorrect value.");
        }

        boolean isBisect = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);


        switch (month) {

                // Am ales sa scriu case-urile unul sub celalalt pentru a personaliza fiecare output in parte

            case 1:
                numberOfDays = 31;
                System.out.println("January has: " + numberOfDays + " days.");
                break;

            case 2:
                if (isBisect) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }

                System.out.println("February has: " + numberOfDays + " days.");
                break;

            case 3:
                numberOfDays = 31;
                System.out.println("March has: " + numberOfDays + " days.");
                break;

            case 4:
                numberOfDays = 30;
                System.out.println("March has: " + numberOfDays + " days.");
                break;

            case 5:
                numberOfDays = 31;
                System.out.println("May has: " + numberOfDays + " days.");
                break;

            case 6:
                numberOfDays = 30;
                System.out.println("June has: " + numberOfDays + " days.");
                break;
            case 7:
                numberOfDays = 31;
                System.out.println("July has: " + numberOfDays + " days.");
                break;

            case 8:
                numberOfDays = 31;
                System.out.println("August has: " + numberOfDays + " days.");
                break;

            case 9:
                numberOfDays = 30;
                System.out.println("September has: " + numberOfDays + " days.");
                break;

            case 10:
                numberOfDays = 31;
                System.out.println("October has: " + numberOfDays + " days.");
                break;

            case 11:
                numberOfDays = 30;
                System.out.println("November has: " + numberOfDays + " days.");
                break;

            case 12:
                numberOfDays = 31;
                System.out.println("December has: " + numberOfDays + " days.");
                break;

            default:
                System.out.println("Incorrect added.");
        }

        return month;

        }



    }



