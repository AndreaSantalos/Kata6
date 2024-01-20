import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AhorcadoTesting {

    @Test
    public void WinGame(){
        Ahorcado ronda = new Ahorcado("user","user");
        assertEquals(0,ronda.guessword("user"));
    }
    @Test
    public void LostGame(){
        Ahorcado ronda = new Ahorcado("user","user");
        Ahorcado.setUserlife(10);
        assertEquals(1,ronda.guessword("usr"));
    }
    @Test
    public void lostlife(){
        Ahorcado ronda = new Ahorcado("usr","user");
        assertEquals(-1,ronda.guessword("usr"));

    }

}
