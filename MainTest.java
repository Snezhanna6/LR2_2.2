package Main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private List<Integer > array = new ArrayList<>();

    //Метод для добавление значений в массив
    private void init(){
        array.add(56);
        array.add(2);
        array.add(48);
        array.add(100);
    }

    @Test
    void calcSummMethodMainTest() {

        init();
        int expected = Main.calcSumm(array);
        int actual = 206;

        assertEquals(expected,actual);

        expected = Main.calcSumm(new ArrayList<Integer>());
        actual = 0;

        assertEquals(expected,actual);

    }

    @Test
    void calcSMultiplMethodMainTest() {

        init();
        long expected = Main.calcSMultipl(array);
        long actual = 537600;

        assertEquals(expected,actual);

        expected = Main.calcSumm(new ArrayList<Integer>());
        actual = 0;

        assertEquals(expected,actual);
    }
}