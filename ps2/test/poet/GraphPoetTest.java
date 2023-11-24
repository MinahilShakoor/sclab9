/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package poet;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for GraphPoet.
 */
public class GraphPoetTest {
    
    // Testing strategy
    //   TODO
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    @Test
    public void testSimpleGraphPoet() {
        GraphPoet poet = new GraphPoet(Arrays.asList(
                "I love programming",
                "Programming is fun",
                "Fun with Java"
        ));

        String input = "I love programming";
        String expected = "I love programming";
        assertEquals(expected, poet.poem(input));
    }

    @Test
    public void testComplexGraphPoet() {
        List<String> lines = Arrays.asList(
                "I love programming",
                "Programming is fun",
                "Fun with Java",
                "Java is versatile",
                "Versatile programming"
        );

        GraphPoet poet = new GraphPoet(lines);

        String input = "I love programming";
        String expected = "I love versatile programming";
        assertEquals(expected, poet.poem(input));
    }

    
}
