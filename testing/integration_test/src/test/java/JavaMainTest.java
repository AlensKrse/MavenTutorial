import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaMainTest {

    @Test
    void testSuccessGetHello() {
        final String helloWorld = new JavaMain().getHelloWorld();
        assertEquals("Hello world", helloWorld);
    }

    @Test
    void testFailGetHello() {
        final String helloWorld = new JavaMain().getHelloWorld();
        assertNotEquals("Hello worldx", helloWorld);
    }

}