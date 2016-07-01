package co.edu.icesi.eketal.ui.apis.artifacts;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.aspose.maven.apis.artifacts package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.aspose.maven.apis.artifacts
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Metadata.Versioning.Versions }
	 */
	public Metadata.Versioning.Versions createMetadataVersioningVersions() {
		return new Metadata.Versioning.Versions();
	}

	/**
	 * Create an instance of {@link Metadata }
	 */
	public Metadata createMetadata() {
		return new Metadata();
	}

	/**
	 * Create an instance of {@link Metadata.Versioning }
	 */
	public Metadata.Versioning createMetadataVersioning() {
		return new Metadata.Versioning();
	}
}
