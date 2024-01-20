import java.util.ArrayList;

public interface Storeletters {

    ArrayList<String> letters = new ArrayList<>();


    static int store(String letter){
        if(letters.contains(letter)){
            System.out.println("Se repite la letra");
            Ahorcado.lostlife();
            return 1;
        }else{
            System.out.println("No esta repetida");
            letters.add(letter);
            return 0;
        }
    }
}
