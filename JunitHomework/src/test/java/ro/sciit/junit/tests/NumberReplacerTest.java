package ro.sciit.junit.tests;

import org.junit.Before;
import org.junit.Test;
import ro.sciit.junit.homework.Utility;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class NumberReplacerTest {
    private Utility replacer = new Utility();

    @Before
    public void setUp() {
        replacer = new Utility();
    }

    @Test

    public void testReplacerWithNoInput() {

        // when
        String input = "";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // result
        assertEquals("", replacer.numberReplacer());
    }

    @Test

    public void testReplacerWithInput() {

        // when
        String input = "Ioana has five apples.";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // result
        assertEquals("ioana has 5 apples.", replacer.numberReplacer());
    }

    @Test

    public void testReplacerWithInputAndSpecialCharacters() {

        // when
        String input = "Ioana has fiVE boardgames!!!!!";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // result
        assertEquals("ioana has 5 boardgames!!!!!", replacer.numberReplacer());
    }

    @Test

    public void testReplacerWithInputAndCompositeNumbers() {

        // when
        String input = "Ioana has twenty-five books.";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // result
        //nu stiu de ce pica testul asta si celalalt in care exista numere concatenate.
        //Imi vede inca o linie goala in plus
        //poate ma ajuti cu niste sfaturi
        assertEquals("ioana has twenty-five books.\n", replacer.numberReplacer());
    }

    @Test

    public void testReplacerWithInputCaseSensitive() {

        // when
        String input = "IOANA HAS FIVE BOARDGAMES!!!!!";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // result
        assertEquals("ioana has 5 boardgames!!!!!", replacer.numberReplacer());
    }

    @Test
    public void testReplacerWithConcatenatedNumbers() {

        // when
        String input = "FIVESIXSEVEN";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // result
        assertEquals("fivesixseven\n", replacer.numberReplacer());
    }


}
