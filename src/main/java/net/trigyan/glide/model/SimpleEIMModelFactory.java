package net.trigyan.glide.model;

import org.eclipse.rdf4j.model.IRI;
/**
 * Default implementation of the {@link EIMModelFactory}
 * @author vmuddu
 *
 */
public class SimpleEIMModelFactory implements EIMModelFactory {

	@Override
	public Organization createOgranization(String baseIRI, String id, String name, String label) {
		return null;
	}

	@Override
	public Organization createOgranization(String baseIRI, String name, String label) {
		// TODO Auto-generated method stub
		return null;
	}

}
