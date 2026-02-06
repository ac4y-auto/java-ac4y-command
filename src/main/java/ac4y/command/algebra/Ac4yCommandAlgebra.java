package ac4y.command.algebra;

import ac4y.base.domain.Ac4y;
import ac4y.service.domain.Ac4yService;

/**
 * Base algebra class for Ac4y Command framework.
 * <p>
 * This class provides the fundamental algebraic structure for commands in the Ac4y framework.
 * It extends the base Ac4y class and adds command-specific functionality.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 */
public class Ac4yCommandAlgebra extends Ac4y {

    /**
     * The name identifier for this command.
     */
    private String commandName;

    /**
     * Gets the name of this command.
     *
     * @return the command name, or null if not set
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * Sets the name of this command.
     *
     * @param commandName the command name to set
     */
    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

}
