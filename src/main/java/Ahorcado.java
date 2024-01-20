import java.util.Scanner;

public class Ahorcado {

    private static String userword;
    private static String believeword;
    static final int lifes = 10;
    static int userlife = 0;

    public Ahorcado(String userword, String believeword) {
        this.userword = userword;
        this.believeword = believeword;
    }

    public static  String getUserword() {
        return userword;
    }

    public static void setUserword(String userword) {
        Ahorcado.userword = userword;
    }

    public static void lostlife() {
        if(userlife == lifes){
            lostgame();
        }else{
            userlife++;
        }
    }

    public static void guessword() {
        System.out.println("Introduce palabra: ");
        Scanner detector = new Scanner(System.in);
        String palabra = detector.nextLine();
        Ahorcado ronda = new Ahorcado("", palabra);
        while (userlife < 10) {
            System.out.println("Da una letra");
            String letter = detector.nextLine();
            KnowingLetter.knowletter(letter);
            System.out.println(ronda.getUserword());
            if (ronda.guessword(ronda.getUserword()) == 0 ) {
                break;
            }

        }

    }


    private static void lostgame() {
        System.out.println("Game Over");
    }

    public static String getBelieveword() {
        return believeword;
    }

    public void setBelieveword(String believeword) {
        this.believeword = believeword;
    }

    public static int getUserlife() {
        return userlife;
    }

    public static void setUserlife(int userlife) {
        Ahorcado.userlife = userlife;
    }

    public int guessword(String word){
        if(word.equals(getBelieveword())){
            System.out.println("Win Game");
            return 0;
        }
        if(userlife == lifes){
            System.out.println("Game Over");
            return 1;
        }
        return -1;
    }
}
