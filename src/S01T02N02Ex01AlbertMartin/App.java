package S01T02N02Ex01AlbertMartin;

public class App {

    static Entry entry = new Entry();

    public static void main(String[] args) {

        String message = "Introdueix la teva edat: ";
        System.out.println("La teva edat és " + readByte(message) );

        message = "Introdueix l'any del teu naixement: ";
        System.out.println("L'any del teu naixement és: " + readInt(message));

        message = "Introdueix un número amb decimals:";
        System.out.println("Has introduït el número: " + readFloat(message));

        message = "Torna a introduir un número amb decimals: ";
        System.out.println("Has introduït el número: " + readDouble(message));

        message = "Introdueix una lletra o un número";
        System.out.println("Has introduït el caràcter: " + readChar(message));

        message = "Introdueix una paraula de no més de 5 lletres";
        System.out.println("Has introduït la paraula: " + readString(message));

        message = "Introdueix SI(S) o NO(N)";
        System.out.println("La teva resposta és: " + readYesOrNot(message));
    }

    private static byte readByte (String message) {return Entry.readByte(message);}

    public static int readInt(String message) {return Entry.readInt(message); }

    public static float readFloat(String message) {return Entry.readFloat(message); }

    public static double readDouble(String message) {return Entry.readDouble(message);}

    public static char readChar(String message) {return Entry.readChar(message);}

    public static String readString(String message) {return Entry.readString(message);}

    public static boolean readYesOrNot(String message) {return Entry.readYesOrNot(message);}

}
