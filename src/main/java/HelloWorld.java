import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * HelloWorld.java - Simple class to print Hello World
 * @author Bijan
 */
public class HelloWorld {

    public static void main(String[] args){

        printText("Hello World");
    }
    public static Boolean printText(String text){
        boolean val = false;
        if(text== "Hello World")
            val = true;

        return val;
    }

}
