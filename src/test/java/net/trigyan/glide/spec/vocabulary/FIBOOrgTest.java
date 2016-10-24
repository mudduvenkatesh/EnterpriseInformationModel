package net.trigyan.glide.spec.vocabulary;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.model.util.ModelBuilder;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.model.vocabulary.RDFS;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;
import org.junit.Test;

public class FIBOOrgTest {

	@Test
	public void testCreateFormalOrg() {
		ModelBuilder builder = new ModelBuilder();
		String companyBase = "http://spec.mycompany.net#";
		
		// set some namespaces
		//String fiboFndOrgFmUri ="http://www.omg.org/spec/EDMC-FIBO/FND/Organizations/FormalOrganizations/";
		//String fiboFndAapAgt="http://www.omg.org/spec/EDMC-FIBO/FND/AgentsAndPeople/Agents/";
		//String fiboFndAapAgtPrefix = "fibo-fnd-aap-agt";
		ValueFactory factory = SimpleValueFactory.getInstance();
		//IRI fiboFndOrgFmIri = factory.createIRI(fiboFndOrgFmUri + "FormalOrganization");
		//IRI hasNameIRI = factory.createIRI(fiboFndAapAgt+"hasName");
		builder.setNamespace("my-org", companyBase)
			.setNamespace(FiboOrganizations.PREFIX,FiboOrganizations.NAMESPACE)
			.setNamespace("rdfs",RDFS.NAMESPACE)
			.setNamespace(FiboAgents.PREFIX,FiboAgents.NAMESPACE)
			.setNamespace(FiboLeFBO.PREFIX,FiboLeFBO.NAMESPACE)
			.setNamespace(FiboFormalOrganizations.PREFIX,FiboFormalOrganizations.NAMESPACE)
			.setNamespace(EIM.PREFIX,EIM.NAMESPACE);
		IRI myBank = factory.createIRI(companyBase+"MyEnterpriseBank");
		builder.namedGraph("my-org:eim-graph-v1")      // add a new named graph to the model
		       .subject(myBank)        // add  several statements about resource ex:john
		       		.add(RDF.TYPE, FiboFormalOrganizations.FormalOrganization)
		       		.add(RDFS.LABEL, factory.createLiteral("MyEnterpriseBank"))
		       		.add(FiboAgents.hasName, "MyEnterpriseBank")
				.subject("my-org:ESS")
					.add(RDF.TYPE, FiboLeFBO.Division)
					.add(RDFS.LABEL, "Enterprise Shared Services")
					.add(FiboAgents.hasName,"Enterprise Shared Services")
					.add(FiboLeFBO.isSubUnitOf,myBank)
				.subject(EIM.PREFIX+":"+"ECIF")
					.add(RDF.TYPE, EIM.ANY_STANDARD_APPLICATION)
					.add(RDFS.LABEL, "Enterprise Client Information File")
					.add(EIM.HAS_CODE, "ECIF")
					.add(EIM.HAS_NAME,"ECIF")
					.add(EIM.IS_OWNED_BY, "my-org:ESS");
		// add a triple to the default graph
		builder.defaultGraph().add("my-org:eim-graph-v1", RDF.TYPE, "my-org:Graph");

		// return the Model object
		Model m = builder.build();
		Rio.write(m, System.out,RDFFormat.TURTLE);
		//m.stream().filter(statement->statement.getObject())
		//FileOutputStream out;
//		try {
//			m.stream().
//			//out = new FileOutputStream("testfile.rdf");
//			Rio.write(m, out, RDFFormat.TURTLE);
//			out.close();
//		} catch ( IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		
	
	}

}
