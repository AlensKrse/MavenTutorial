import org.junit.Assert;
import org.junit.Test;

public class JavaMainTest {

    @Test
    public void testSuccessGetHello() {
        final String helloWorld = new JavaMain().getHelloWorld();
        Assert.assertEquals("Hello world", helloWorld);
    }

    @Test
    public void testFailGetHello() {
        final String helloWorld = new JavaMain().getHelloWorld();
        Assert.assertNotEquals("Hello worldx", helloWorld);
    }
}