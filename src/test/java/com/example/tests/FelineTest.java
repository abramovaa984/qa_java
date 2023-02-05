package com.example.tests;

import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getFamilyShouldReturnFeline() {

        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", expectedResult, actualResult);
    }

    @Test
    public void getKittensWithoutParameterShouldReturnOne() {

        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals("Получено некорректное значение", expectedResult, actualResult);
    }

    @Test
    public void getKittensWithParameterEqualsToFiveShouldReturnFive() {

        int expectedResult = 5;
        int actualResult = feline.getKittens(5);
        assertEquals("Получено некорректное значение", expectedResult, actualResult);
    }

    @Test
    public void eatMeatShouldReturnPredatorFood() throws Exception {

        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void getFoodWhenAnimalKindIsPredatorReturnPredatorFood() throws Exception {

        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.getFood("Хищник");
        assertEquals("Получен некорректный список", expectedResult, actualResult);
    }

    @Test
    public void getFoodWhenAnimalKindIsHerbivoreReturnHerbivoreFood() throws Exception {

        List<String> expectedResult = List.of("Трава", "Различные растения");
        List<String> actualResult = feline.getFood("Травоядное");
        assertEquals("Получен некорректный список", expectedResult, actualResult);
    }
}