package sample;

public class Operators {
    public static void main(String args[]) {
        int result = 25 + 50;
        System.out.println("25 + 50 =" + result);

        int previousresult = result;
        result = previousresult - 5;
        System.out.println("previousresult - 5 =" + result);

        previousresult = result;
        result = previousresult / 50;
        System.out.println("previousresult / 50 =" + result);

        previousresult = result;
        result = previousresult % 20;
        System.out.println("previousresult % 20 =" + result);

        previousresult = result;
        result = previousresult * 9;

        previousresult = result + 2;
        result = result + 2;
        System.out.println("Now the result is " + result);

        previousresult = result - 2;
        result = result - 2;
        System.out.println("Now the result is " + result);

        result++;
        System.out.println("Now the result is " + result);
        result--;
        System.out.println("Now the result is " + result);

        result += 4;
        System.out.println("Now the result is " + result);
        result -= 4;
        System.out.println("Now the result is " + result);
        result /= 4;
        System.out.println("Npw the result is " + result);
        result %= 4;
        System.out.println("Now the result is " + result);
        result *= 4;
        System.out.println("Now the result is " + result);

        boolean isMan = false;
        if (isMan == true)
            System.out.println("It is not a man");
        int topScore = 81;
        if (topScore > 100)
        System.out.println("You got the top score");
        int secondTopScore = 80;
        if ((topScore > secondTopScore)  && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");
        if ((topScore > 90)  || (secondTopScore <=90))
            System.out.println("One of these tests are true");

        int newvalue = 50;
        if(newvalue == 50)
            System.out.println("This is a true");

        boolean isCar = false;
        if(isCar = true)
            System.out.println("This is not suppose to happem");
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCsr is true");

        double myfirstValue = 20d;
        double mysecondValue = 80;
        double myTotal = myfirstValue + mysecondValue * 25;
        double theRemainder = myTotal % 40;
        if(theRemainder <= 20)
            System.out.println("Total was in the limit ");







    }
}











