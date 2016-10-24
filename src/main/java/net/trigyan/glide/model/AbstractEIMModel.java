package net.trigyan.glide.model;

import java.io.Serializable;
import java.util.Optional;

import org.eclipse.rdf4j.model.IRI;

public abstract class AbstractEIMModel implements EIMModel, Serializable {

	
	public void setName(String name) {
		this.name = name;
	}


	private IRI identifier;
	private String label;
	
	public void setLabel(String label) {
		this.label = label;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	private String description;
	private String name;
	private IRI baseType;
	public AbstractEIMModel(IRI identifier, IRI baseType) {
		super();
		this.identifier=identifier;
		this.baseType=baseType;
	}
	@Override
	public IRI getIdentifier() {
		return identifier;
	}

	@Override
	public String getLabel() {
		return label;
	}

	@Override
	public IRI getBaseType() {
		return baseType;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public String toString() {
		return "AbstractEIMModel [identifier=" + identifier + ", label=" + label + ", description=" + description
				+ ", name=" + name + ", baseType=" + baseType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEIMModel other = (AbstractEIMModel) obj;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		return true;
	}
	

}
