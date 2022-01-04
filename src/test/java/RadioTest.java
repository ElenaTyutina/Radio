import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setMaxStationDefault() {
        Radio rad = new Radio();
        rad.setMaxStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setMaxStation() {
        Radio rad = new Radio(69);
        rad.setMaxStation();
        int expected = 68;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setMinStation() {
        Radio rad = new Radio(12);
        rad.setMinStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setMinStationDefault() {
        Radio rad = new Radio();
        rad.setMinStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation() {
        Radio rad = new Radio(2);
        rad.setCurrentStation(0);
        int actual = rad.getCurrentStation();
        assertEquals(0, actual);
        rad.setCurrentStation(1);
        actual = rad.getCurrentStation();
        assertEquals(1, actual);
    }

    @Test
    public void testInvalidStationSelection(){
        Radio rad = new Radio();
        rad.setMaxStation();
        rad.setCurrentStation(10);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidStationSelection2() {
        Radio rad = new Radio();
        rad.setMinStation();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setNextStation() {
        Radio rad = new Radio();
        rad.setNextStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setNextStationMax() {
        Radio rad = new Radio(23);
        rad.setMaxStation();
        rad.setNextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationMin() {
        Radio rad = new Radio(33);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
        rad.setPrevStation();
        expected = 32;
        actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setPrevStation() {
        Radio rad = new Radio(55);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
        rad.setMaxStation();
        expected= 54;
        actual = rad.getCurrentStation();
        assertEquals(expected, actual);
        rad.setPrevStation();
        expected= 53;
        actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolume() {
        Radio rad = new Radio();
        rad.setMaxVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void getCurrentVolume() {
        Radio rad = new Radio();
        rad.getCurrentVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setMinVolume() {
        Radio rad = new Radio();
        rad.setMinVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolume() {
        Radio rad = new Radio();
        rad.setMaxVolume();
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseMinVolume() {
        Radio rad = new Radio();
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolume() {
        Radio rad = new Radio();
        rad.setMaxVolume();
        rad.decreaseVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

}



