import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "XNCD250");
    }


    @Test
    public void hasMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("XNCD250", cdPlayer.getModel());
    }

    @Test
    public void cdsStartEmpty(){
        assertEquals(0, cdPlayer.getCds().size());
    }

    @Test
    public void canAddCD(){
        cdPlayer.addCd("Arriana Grande");
        assertEquals(1, cdPlayer.getCds().size());
    }

    @Test
    public void canEjectCD(){
        cdPlayer.addCd("Arriana Grande");
        cdPlayer.ejectCD("Arriana Grande");
        assertEquals(0, cdPlayer.getCds().size());
    }

    @Test
    public void canChooseCD(){
        cdPlayer.addCd("Arriana Grande");
        cdPlayer.addCd("Michael Jackson");
        cdPlayer.chooseCD(1);
        assertEquals("Playing CD Arriana Grande.", cdPlayer.play());
    }
}
