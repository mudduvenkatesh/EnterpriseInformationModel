package net.trigyan.glide.spec.vocabulary;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.rdf4j.RDF4JException;
import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.model.util.ModelBuilder;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.model.vocabulary.RDFS;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.sail.SailRepository;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;
import org.eclipse.rdf4j.sail.memory.MemoryStore;
import org.junit.Test;

public class FIBOOrgTest {

	@Test
	public void testCreateFormalOrg() {
		ModelBuilder builder = new ModelBuilder();
		String companyBase = "http://spec.mycompany.net#";

		// set some namespaces
		// String fiboFndOrgFmUri
		// ="http://www.omg.org/spec/EDMC-FIBO/FND/Organizations/FormalOrganizations/";
		// String
		// fiboFndAapAgt="http://www.omg.org/spec/EDMC-FIBO/FND/AgentsAndPeople/Agents/";
		// String fiboFndAapAgtPrefix = "fibo-fnd-aap-agt";
		ValueFactory factory = SimpleValueFactory.getInstance();
		// IRI fiboFndOrgFmIri = factory.createIRI(fiboFndOrgFmUri +
		// "FormalOrganization");
		// IRI hasNameIRI = factory.createIRI(fiboFndAapAgt+"hasName");
		builder.setNamespace("my-org", companyBase).setNamespace(FiboOrganizations.PREFIX, FiboOrganizations.NAMESPACE)
				.setNamespace("rdfs", RDFS.NAMESPACE).setNamespace(FiboAgents.PREFIX, FiboAgents.NAMESPACE)
				.setNamespace(FiboLeFBO.PREFIX, FiboLeFBO.NAMESPACE)
				.setNamespace(FiboFormalOrganizations.PREFIX, FiboFormalOrganizations.NAMESPACE)
				.setNamespace(EIM.PREFIX, EIM.NAMESPACE);
		IRI myBank = factory.createIRI(companyBase + "MyEnterpriseBank");
		IRI myAppESS = factory.createIRI(EIM.NAMESPACE + "ESS");
		IRI partyDataDomain = factory.createIRI(EIM.NAMESPACE + "PatyMasterDataDomain");
		builder.namedGraph("my-org:eim-graph-v1") // add a new named graph to
													// the model
				.subject(myBank) // add several statements about resource
									// ex:john
				.add(RDF.TYPE, FiboFormalOrganizations.FormalOrganization)
				.add(RDFS.LABEL, factory.createLiteral("MyEnterpriseBank")).add(FiboAgents.hasName, "MyEnterpriseBank")
				.subject("my-org:ESS").add(RDF.TYPE, FiboLeFBO.Division).add(RDFS.LABEL, "Enterprise Shared Services")
				.add(FiboAgents.hasName, "Enterprise Shared Services").add(FiboLeFBO.isSubUnitOf, myBank)
				.subject(EIM.PREFIX + ":" + "ECIF").add(RDF.TYPE, EIM.ANY_STANDARD_APPLICATION)
				.add(RDFS.LABEL, "Enterprise Client Information File").add(EIM.HAS_CODE, "ECIF")
				.add(EIM.HAS_NAME, "ECIF").add(EIM.IS_OWNED_BY, myAppESS)
				.subject("my-org:PartyDataDomain")
					.add(RDF.TYPE, EIM.MASTER_DATA)
				// .add(RDF.TYPE, EIM.DATA_DOMAIN)
					.add(RDFS.LABEL, "Party Data Domain")
				.subject("my-org:HRDataDomain")
					.add(RDF.TYPE, EIM.MASTER_DATA)
				.subject(EIM.PREFIX + ":" + "PartyId")
					.add(RDF.TYPE, EIM.DATA_ELEMENT)
					.add(RDFS.LABEL, "Party Identifier").add(EIM.HAS_ID, "PartyId")
					.add(EIM.HAS_NAME, "Party Identifier");

		// add a triple to the default graph
		builder.defaultGraph().add("my-org:eim-graph-v1", RDF.TYPE, "my-org:Graph");

		// return the Model object
		Model m = builder.build();
		//Rio.write(m, System.out, RDFFormat.TURTLE);
		// Create a new Mem repo
		File dataDir = new File("./target/data/MyTestRepo");
		//MemoryStore memStore = new MemoryStore(dataDir);
		//memStore.setSyncDelay(1000L);
		//Repository repo = new SailRepository(memStore);
		//repo.initialize();
		File rdfFile = new File(dataDir, "test.rdf");
		
		//try (RepositoryConnection con = repo.getConnection()) {
		try {
			FileOutputStream fs = new FileOutputStream(rdfFile);
			Rio.write(m, fs, RDFFormat.TURTLE);
			fs.close();
			//con.add(rdfFile, companyBase, RDFFormat.TURTLE);
			
			//search
			
			//con.close();
		//} catch (RDF4JException e) {
			// handle exception. This catch-clause is
			// optional since RDF4JException is an unchecked exception
		} catch (IOException e) {
			// handle io exception
		}
		// m.stream().filter(statement->statement.getObject())
		// FileOutputStream out;
		// try {
		// m.stream().
		// //out = new FileOutputStream("testfile.rdf");
		// Rio.write(m, out, RDFFormat.TURTLE);
		// out.close();
		// } catch ( IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

}
