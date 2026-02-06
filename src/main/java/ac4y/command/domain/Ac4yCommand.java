package ac4y.command.domain;

import ac4y.command.algebra.Ac4yCommandAlgebra;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Domain class representing a generic Ac4y Command.
 * <p>
 * This class serves as the base command type in the Ac4y framework. It extends
 * {@link Ac4yCommandAlgebra} to inherit command algebraic operations and is annotated
 * with {@link XmlRootElement} to support JAXB XML/JSON serialization.
 * </p>
 * <p>
 * Commands can be serialized to XML or JSON format for transmission between systems.
 * </p>
 *
 * @author Ac4y Framework
 * @version 1.20190228.2
 * @since 1.0
 * @see Ac4yCommandAlgebra
 */
@XmlRootElement
public class Ac4yCommand extends Ac4yCommandAlgebra {
}
