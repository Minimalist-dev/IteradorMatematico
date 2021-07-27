package x.ficheros;

public class Switch {
    public static String 
    bucle(Integer arg) {
        String value = null;
        
        switch (arg) {
            case 0: value="Single"; break;
            case 1: value="Married"; break;
            case 2: value="Separated"; break;
            case 3: value="Divorced"; break;
        }

        int value2 = 0;
        
        if ("Single".equals(arg)) {
            value2 = 0;
        } else if ("Married".equals(arg)) {
            value2 = 1;
        } else if ("Separated".equals(arg)) {
            value2 = 2;
        } else if ("Divorced".equals(arg)) {
            value2 = 3;
        }
        return value;
    }
}
