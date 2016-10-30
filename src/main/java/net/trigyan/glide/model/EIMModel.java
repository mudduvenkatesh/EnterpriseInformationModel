package net.trigyan.glide.model;

import org.eclipse.rdf4j.model.IRI;
/**
 * All Data Models in the EIM space will implement this interface
 * @author vmuddu
 *
 */
public interface EIMModel {
	/**
	 * Unique Minted Identifier for model
	 * @return A unique IRI
	 */
	IRI getIdentifier();
	/**
	 * Label 
	 * @return
	 */
	String getLabel();
	/**
	 * Base Type for this Item
	 * @return
	 */
	IRI getBaseType();
	/**
	 * Name
	 * @return
	 */
	String getName();
	/**
	 * Description
	 * @return
	 */
	String getDescription();
	
}
