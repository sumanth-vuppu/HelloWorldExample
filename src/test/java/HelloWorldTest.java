import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void ReturnValTest(){
        Boolean val = HelloWorld.printText("Hello World");

        Assert.assertTrue(val.equals(true));
    }
}
