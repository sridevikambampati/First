public class Strings {
    public static void main(String args[]) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2015";
        System.out.println("unicode output was" + myString);

        String numberString = "245.67";
        numberString = numberString + "40.24";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt =50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doublenumber = 120.47;
        lastString = lastString + doublenumber;
        System.out.println("LastString value: " + lastString);

    }
}






