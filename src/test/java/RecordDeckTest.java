import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before() {
        recordDeck = new RecordDeck("Sanyo", "XPTO-10K");
    }

    @Test
    public void hasMake(){
        assertEquals("Sanyo", recordDeck.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("XPTO-10K", recordDeck.getModel());
    }

    @Test
    public void hasPlaySpeed() {
        assertEquals(45, recordDeck.getPlaySpeed());
    }

    @Test
    public void canSetPLaySpeed() {
        recordDeck.setPlaySpeed(78);

        assertEquals(78, recordDeck.getPlaySpeed());
    }
}
