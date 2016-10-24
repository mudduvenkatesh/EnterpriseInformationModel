package net.trigyan.glide.model;

import java.util.Optional;

import org.eclipse.rdf4j.model.IRI;

public interface EIMModel {
	IRI getIdentifier();
	String getLabel();
	IRI getBaseType();
	String getName();
	String getDescription();
	
}
