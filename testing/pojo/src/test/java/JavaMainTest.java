

public class JavaMainTest {

    public void testSuccessGetHello() {
        final String helloWorld = new JavaMain().getHelloWorld();
        assert ("Hello world".equals(helloWorld));
    }

    public void testFailGetHello() {
        final String helloWorld = new JavaMain().getHelloWorld();
        assert (!"Hello worldx".equals(helloWorld));
    }

}