package ac4y.command.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link Ac4yCommand}.
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 */
public class Ac4yCommandTest {

    private Ac4yCommand command;

    @Before
    public void setUp() {
        command = new Ac4yCommand();
    }

    @Test
    public void testCommandNameGetterSetter() {
        String commandName = "TEST_COMMAND";
        command.setCommandName(commandName);
        assertEquals(commandName, command.getCommandName());
    }

    @Test
    public void testCommandNameInitiallyNull() {
        assertNull(command.getCommandName());
    }

    @Test
    public void testCommandNameCanBeSetToNull() {
        command.setCommandName("TEST");
        command.setCommandName(null);
        assertNull(command.getCommandName());
    }

    @Test
    public void testCommandIsNotNull() {
        assertNotNull(command);
    }

    @Test
    public void testCommandNameCanBeEmpty() {
        command.setCommandName("");
        assertEquals("", command.getCommandName());
    }

    @Test
    public void testXmlSerialization() throws Exception {
        command.setCommandName("XML_TEST");
        String xml = command.getAsXml();
        assertNotNull(xml);
        assertTrue(xml.contains("XML_TEST"));
    }

    @Test
    public void testJsonSerialization() throws Exception {
        command.setCommandName("JSON_TEST");
        String json = command.getAsJson();
        assertNotNull(json);
        assertTrue(json.contains("JSON_TEST"));
    }
}
