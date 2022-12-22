package main;

public class LombokMain {

    public static void main(String[] args) {
        final Person person = new Person();
        final Person john = Person.builder().firstName("John").build();
    }
}
