package morben.springframework;

/**
 * Created by micheleorben on 6/5/21
 */

public class Greating {

    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String helloWorld(){
        return HELLO + " " + WORLD;
    }

    public String helloWorld(String name){
        return HELLO + " " + name;
    }
}