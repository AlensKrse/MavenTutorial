import org.junit.Assert;
import org.junit.Test;

public class GroovyMainTest {

    @Test
    public void testSuccessGetHello() {
        final String helloWorld = new GroovyMain().getData();
        Assert.assertEquals("Hello world", helloWorld);
    }

    @Test
    public void testFailGetHello() {
        final String helloWorld = new GroovyMain().getData();
        Assert.assertNotEquals("Hello worldx", helloWorld);
    }

}