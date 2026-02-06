package ac4y.command.algebra;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link Ac4yCommandAlgebra}.
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 */
public class Ac4yCommandAlgebraTest {

    private Ac4yCommandAlgebra algebra;

    @Before
    public void setUp() {
        algebra = new Ac4yCommandAlgebra();
    }

    @Test
    public void testGetCommandNameReturnsNull() {
        assertNull(algebra.getCommandName());
    }

    @Test
    public void testSetAndGetCommandName() {
        String expectedName = "TEST_ALGEBRA_COMMAND";
        algebra.setCommandName(expectedName);
        assertEquals(expectedName, algebra.getCommandName());
    }

    @Test
    public void testCommandNameWithSpecialCharacters() {
        String specialName = "TEST-CMD_123!@#";
        algebra.setCommandName(specialName);
        assertEquals(specialName, algebra.getCommandName());
    }

    @Test
    public void testMultipleCommandNameChanges() {
        algebra.setCommandName("FIRST");
        assertEquals("FIRST", algebra.getCommandName());

        algebra.setCommandName("SECOND");
        assertEquals("SECOND", algebra.getCommandName());

        algebra.setCommandName("THIRD");
        assertEquals("THIRD", algebra.getCommandName());
    }
}
