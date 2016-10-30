package net.trigyan.glide.spec.vocabulary;

/**
 * Default concept
 * @author vmuddu
 *
 */
public class DefaultConcept implements Concept {

	private String type;
	private String fragment;
	
	/**
	 * Constructor for the default concept
	 * @param name	The type of the concept. Will be used to create <a href="https://www.w3.org/TR/rdf-schema/#ch_label">RDFS:Label</a
	 * @param fragment	The fragment name that will be used to generate the URI
	 */
	public DefaultConcept(String type, String fragment) {
		super();
		this.type = type;
		this.fragment = fragment;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getFragment() {
		return fragment;
	}

}
