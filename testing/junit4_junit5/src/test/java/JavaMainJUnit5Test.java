import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class JavaMainJUnit5Test {

    @Test
    void testSuccessGetHello() {
        final String helloWorld = new JavaMain().getHelloWorld();
        assertEquals("Hello world", helloWorld);
    }

    @Test
    void testFailGetHello() {
        final String helloWorld = new JavaMain().getHelloWorld();
        assertNotEquals("Hello worldx", helloWorld);

        System.out.println(System.getenv("TEST_ENV"));
    }
}