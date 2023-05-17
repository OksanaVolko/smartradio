import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioConstructorTest {

    @Test
    public void shouldSetCurrentStationWithinRange() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(57);
        int expected = 57;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationWithinRangMaximum() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(99);
        int expected = 99;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationWithinRangMinimum() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToFirstStationWhenNextPressedOnLastStation() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(99);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToLastStationWhenPrevPressedOnFirstStation() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 99;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
}