package ro.sciit.junit.tests;

import org.junit.Before;
import org.junit.Test;
import ro.sciit.junit.homework.Utility;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class WhiteSpaceRemovalTest {

    private Utility whiteSpaceTest;

    @Before
    public void setUp() {
        whiteSpaceTest = new Utility();
    }

    @Test
    public void checkWhiteSpaceRemovalWithNoInput() {

        // when
        String input = "";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // result
        assertEquals("", whiteSpaceTest.inputWithWhiteSpacesRemoved());

    }

    @Test
    public void checkWhiteSpaceRemovalWithInput() {

        // when
        String input = "Abc     ddjsauhjuds aCza1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // result
        assertEquals("abcddjsauhjudsacza1", whiteSpaceTest.inputWithWhiteSpacesRemoved());
    }
}
