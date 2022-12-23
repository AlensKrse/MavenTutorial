package groovymain

import javamain.JavaMain

class GroovyMain {

    static void main(String[] args) {
        JavaMain java = new JavaMain()
        println java.helloWorld
    }
}
