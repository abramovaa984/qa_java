package com.example.tests;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getFoodShouldReturnFelineFood() throws Exception {

        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void getKittensShouldReturnFelineKittens() throws Exception {

        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void doesHaveManeShouldReturnHasMane() throws Exception {

        Lion lion = new Lion("Самец", feline);
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void constructorLionWhenSexIsMaleHasManeIsTrue() throws Exception {

        Lion lion = new Lion("Самец", feline);
        boolean actualResult = lion.doesHaveMane();
        assertTrue("Некорректое значение свойства", actualResult);
    }

    @Test
    public void constructorLionWhenSexIsFemaleHasManeIsFalse() throws Exception {

        Lion lion = new Lion("Самка", feline);
        boolean actualResult = lion.doesHaveMane();
        assertFalse("Некорректое значение свойства", actualResult);
    }
}