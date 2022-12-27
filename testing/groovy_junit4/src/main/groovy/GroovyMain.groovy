class GroovyMain {

    static void main(String[] args) {
        JavaMain java = new JavaMain()
        println java.helloWorld
    }

    static String getData(){
        JavaMain java = new JavaMain()
        return  java.helloWorld
    }
}
