package net.trigyan.glide.spec.vocabulary;

import static org.junit.Assert.*;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.sail.SailRepository;
import org.eclipse.rdf4j.sail.memory.MemoryStore;
import org.junit.Test;

public class CreateOrgTest {

	@Test
	public void test() {
		String fiboOrg = "http://www.omg.org/spec/EDMC-FIBO/FND/Organizations/Organizations/Organization/";
		Repository repo = new SailRepository(new MemoryStore());
		repo.initialize();
		ValueFactory f = repo.getValueFactory();
		IRI myEntCompany  = f.createIRI(fiboOrg + "MyEnterpriseBank");
		
		
	}

}
