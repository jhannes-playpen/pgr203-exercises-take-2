package no.kristiania.romans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomansTest {

    @Test
    void shouldConvertToI() {
        assertEquals("I", toRoman(1));

    }
    @Test
    void  shouldConvertToII(){
        assertEquals("II", toRoman(2));
    }
    @Test
    void shouldConvertToIII(){
        assertEquals("III", toRoman(3));
    }
    @Test
    void shouldConvertToIV(){
        assertEquals("IV", toRoman(4));
    }

    @Test
    void shouldConvertToV() {
        assertEquals("V", toRoman(5));
    }
    @Test
    void shouldConvertNumbersOver5() {
        assertEquals("VI", toRoman(6));
        assertEquals("VII", toRoman(7));
        assertEquals("VIII", toRoman(8));
    }
    @Test
    void shouldConvertToIX() {
        assertEquals("IX", toRoman(9));
    }
    @Test
    void shouldConvertTeens() {
        assertEquals("X", toRoman(10));
        assertEquals("XII", toRoman(12));
        assertEquals("XIV", toRoman(14));
        assertEquals("XVII", toRoman(17));
        assertEquals("XIX", toRoman(19));
    }

    @Test
    void shouldConvertToTens() {
        assertEquals("XX", toRoman(20));
        assertEquals("XXX", toRoman(30));
        assertEquals("XXXVIII", toRoman(38));
        assertEquals("XXXIX", toRoman(39));
    }

    @Test
    void shouldConvertPowersOfTen() {
        assertEquals("MMMCCCXXXIII", toRoman(3333));
    }

    @Test
    void ShouldConvertFives() {
        assertEquals("DLV", toRoman(555));
    }

    private String toRoman(int number) {
        return new RomanConverter(number).convert();
    }

}
