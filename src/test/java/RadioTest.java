import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "MXD1000");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("MXD1000", radio.getModel());
    }

    @Test
    public void stationStartsAsNull(){
        assertNull(radio.getStation());
    }

    @Test
    public void canTuneStation(){
        radio.tune("Radio 1");
        assertEquals("Radio 1", radio.getStation());
    }

    @Test
    public void canSetMake(){
        radio.setMake("Yamaha");
        assertEquals("Yamaha", radio.getMake());
    }

    @Test
    public void canSetModel(){
        radio.setModel("MXD2000");
        assertEquals("MXD2000", radio.getModel());
    }
}
