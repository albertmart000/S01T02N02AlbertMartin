package S01T02N02Ex01AlbertMartin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry extends Exception{

    private static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        try {
            System.out.println(message);
            return sc.nextByte();
        } catch (InputMismatchException e) {
            System.out.println("Valor no vàlid. Torna a provar-ho.");
            sc.next();
            readByte(message);
        }
        return sc.nextByte();
    }

    public static int readInt(String message) {
       boolean next;
       do {
            try {
                System.out.println(message);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no vàlid. Torna a provar-ho.");
                sc.next();
                next = true;
            }
       } while (next);
       return sc.nextInt();
    }

    public static float readFloat(String message) {
        try {
            System.out.println(message);
            return sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Valor no vàlid. Torna a provar-ho.");
            sc.next();
            readFloat(message);
        }
        return sc.nextFloat();
    }

    public static double readDouble(String message) {
        try {
            System.out.println(message);
            return sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Valor no vàlid. Torna a provar-ho.");
            sc.next();
            readDouble(message);
        }
        return sc.nextDouble();
    }

    public static char readChar(String message) {
        try {
            System.out.println(message);
            String string = sc.next();
            if (string.length() != 1) {
                throw new Exception();
            } else {
                return string.charAt(0);
            }
        } catch (Exception e) {
            System.out.println("Valor no vàlid. Torna a provar-ho.");
            sc.next();
            readChar(message);
        }
        return sc.next().charAt(0);
    }

    public static String readString(String message) {
        try {
            System.out.println(message);
            String string = sc.next();
            if (string.length() > 5) {
                throw new Exception();
            } else {
                return string;
            }
        } catch (Exception e) {
            System.out.println("Valor no vàlid. Torna a provar-ho.");
            sc.next();
            readString(message);
        }
        return sc.next();
    }   
    
    public static boolean readYesOrNot(String message) {
        boolean result = false;
        try{
            System.out.println(message);
            String answer = sc.next();
            if (answer.equalsIgnoreCase("s")){
                result = true;
            } else if (answer.equalsIgnoreCase("n")){
                result = false;
            }
            
        } catch (Exception e) {
            System.out.println("Valor no vàlid. Torna a provar-ho.");
            sc.next();
            readYesOrNot(message);
        }
        return result;
    }

}
