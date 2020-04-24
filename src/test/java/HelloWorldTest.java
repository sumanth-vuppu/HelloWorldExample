import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void ReturnValTest(String Text){
        Boolean val = HelloWorld.printText(Text);

        Assert.assertTrue(val.equals(true));
    }
}
