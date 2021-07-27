package front;
//https://docs.oracle.com/javase/tutorial/essential/regex/index.html
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresion {
    public static boolean 
    numeros(String expresionObject) {
        Pattern patternObject = Pattern.compile("^[0-9]{0,3}$");
        Matcher matcherObject = patternObject.matcher(expresionObject);

        return matcherObject.find();
    }
    public static boolean 
    correo(String expresionObject) {
        Pattern patternObject = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcherObject = patternObject.matcher(expresionObject);
        
        return matcherObject.find();
    }
    public static boolean 
    password(String expresionObject) {
        Pattern patternObject = Pattern.compile("^[a-zA-Z0-9._%+-]{3,50}$");
        Matcher matcherObject = patternObject.matcher(expresionObject);
        
        return matcherObject.find();
    }
    public static boolean 
    nombre(String expresionObject) {
        Pattern patternObject = Pattern.compile("^[a-zA-Z]{3,10}$");
        Matcher matcherObject = patternObject.matcher(expresionObject);

        return matcherObject.find();
    }
    public static boolean 
    apellidos(String expresionObject) {//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx (.)
        Pattern patternObject = Pattern.compile("^[a-zA-Z]{3,10}+([ ]{0,1})?+([a-zA-Z]{3,10})?$");
        Matcher matcherObject = patternObject.matcher(expresionObject);

        return matcherObject.find();
    }
}
