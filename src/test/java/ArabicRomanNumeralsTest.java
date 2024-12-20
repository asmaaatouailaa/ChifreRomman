import com.nomChoisi.ArabicRomanNumerals.ArabicRomanNumerals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.ArrayList;

public class ArabicRomanNumeralsTest {

    @Test
     public void testerlecconvertde_1() {

         // GIVEN
         List<String> expectedRomanNumber = new ArrayList<>();
         expectedRomanNumber.add("I");

         // WHEN
         List<String> result = ArabicRomanNumerals.convert(1);

         // THEN
         assertEquals(expectedRomanNumber, result);
     }

     @Test
     public void testerlecconvertde_3() {

         // GIVEN
         List<String> expectedRomanNumber = new ArrayList<>();
         expectedRomanNumber.add("I");
         expectedRomanNumber.add("I");
         expectedRomanNumber.add("I");

         // WHEN
         List<String> result = ArabicRomanNumerals.convert(3);

         // THEN
         assertEquals(expectedRomanNumber, result);
     }

     @Test
     public void testerlecconvertde_4() {

         // GIVEN
         List<String> expectedRomanNumber = new ArrayList<>();
         expectedRomanNumber.add("I");
         expectedRomanNumber.add("V");

         // WHEN
         List<String> result = ArabicRomanNumerals.convert(4);

         // THEN
         assertEquals(expectedRomanNumber, result);
     }


 @Test
 public void testerlecconvertde_5() {

     // GIVEN
     List<String> expectedRomanNumber = new ArrayList<>();
     expectedRomanNumber.add("V");

     // WHEN
     List<String> result = ArabicRomanNumerals.convert(5);

     // THEN
     assertEquals(expectedRomanNumber, result);
 }
 @Test
     public void testerlecconvertde_31() {
         // GIVEN
         List<String> expectedRomanNumber = new ArrayList<>();

     expectedRomanNumber.add("X");
     expectedRomanNumber.add("X");
     expectedRomanNumber.add("X");
     expectedRomanNumber.add("I");


      // WHEN
         List<String> result = ArabicRomanNumerals.convert(31);

         // THEN
         assertEquals(expectedRomanNumber, result);
     }
    @Test
    public void testerlecconvertde_42() {
        // GIVEN
        List<String> expectedRomanNumber = new ArrayList<>();
        expectedRomanNumber.add("X");
        expectedRomanNumber.add("L");
        expectedRomanNumber.add("I");
        expectedRomanNumber.add("I");


        // WHEN
        List<String> result = ArabicRomanNumerals.convert(42);

        // THEN
        assertEquals(expectedRomanNumber, result);
    }
    @Test
    public void testerlecconvertde_9() {

        // GIVEN
        List<String> expectedRomanNumber = new ArrayList<>();
        expectedRomanNumber.add("I");
        expectedRomanNumber.add("X");

        // WHEN
        List<String> result = ArabicRomanNumerals.convert(9);

        // THEN
        assertEquals(expectedRomanNumber, result);
    }



    @Test
    public void testerlecconvertde_10() {

        // GIVEN
        List<String> expectedRomanNumber = new ArrayList<>();
        expectedRomanNumber.add("X");



        // WHEN
        List<String> result = ArabicRomanNumerals.convert(10);

        // THEN
        assertEquals(expectedRomanNumber, result);
    }
    @Test
    public void testerlecconvertde_39() {

        // GIVEN
        List<String> expectedRomanNumber = new ArrayList<>();
        expectedRomanNumber.add("X");
        expectedRomanNumber.add("X");
        expectedRomanNumber.add("X");
        expectedRomanNumber.add("I");
        expectedRomanNumber.add("X");

        // WHEN
        List<String> result = ArabicRomanNumerals.convert(39);

        // THEN
        assertEquals(expectedRomanNumber, result);
    }
}


