package martinez.company;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int -- most common used
        // long
        // float
        // double -- most common used
        // char
        // boolean -- most common used

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println(myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);
    }
}
