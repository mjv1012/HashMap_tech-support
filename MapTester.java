import java.util.HashMap;

/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> contacts;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        // initialise instance variables
        contacts = new HashMap<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enterNumber(String name, String number)
    {
        // put your code here
        contacts.put(name, number);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String lookupNumber(String name)
    {
        // put your code here
        return contacts.get(name);
    }


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    MapTester phoneBook = new MapTester();
    {
        // put your code here
        phoneBook.enterNumber("Charles Nguyen" , "(531) 9392 4587");
        phoneBook.enterNumber("Lisa Jones" , "(402) 4536 4674");
        phoneBook.enterNumber("Hiroshi Ito" , "(998) 5488 0123");

        String number = contacts.get("Lisa Jones");
        System.out.println(number);
    }
}