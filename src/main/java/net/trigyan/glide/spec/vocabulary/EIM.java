package net.trigyan.glide.spec.vocabulary;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

/**
 * Constants for EIM primitives and for the EIM namespace.<br>
 * Resources here are defined according to the EIM specs on
 * <a href="http://spec.trigyan.net/glide/EnterpriseInformationModel/">http://spec.trigyan.net/glide/EnterpriseInformationModel</a>, version 0.99
 */
public class EIM {
	/**
	 * The EIM Namespace
	 */
	public static final String NAMESPACE = "http://spec.trigyan.net/glide/EnterpriseInformationModel#";
	/**
	 * The recommended prefix for the eim namespace: "eim"
	 */
	public final static String PREFIX = "eim";
	public final static IRI ACCOUNTING_EVENT;
	public static final IRI ACCURACY;
	public static final IRI ANY_STANDARD_APPLICATION;
	public static final IRI BUSINESS_DATA;
	public static final IRI BUSINESS_RULE;
	public static final IRI BUSINESS_TERM;
	public static final IRI COMPLETENESS;
	public static final IRI CONFORMITY;
	public static final IRI CRITICAL_DATA_ELEMENT;
	public static final IRI DATA_ASSET;
	public static final IRI DATA_ATTRIBUTE;
	public static final IRI DATA_DOMAIN;
	public static final IRI DATA_ELEMENT;
	public static final IRI DATA_QUALITY_DIMENSION;
	public static final IRI DATA_QUALITY_RULE;
	public static final IRI DATASET;
	public static final IRI DERIVED_DATA;
	public static final IRI EVENT_DATA;
	public static final IRI FINANCIAL_EVENT;
	public static final IRI GOVERNANCE_ASSET;
	public static final IRI MASTER_DATA;
	public static final IRI REFERENCE_DATA;
	public static final IRI STANDARD_SERVICE;
	public static final IRI SOFTWARE_ASSET;
	public static final IRI TRANSACTION_DATA;
	public static final IRI VALIDITY;
	public static final IRI DATA_OWNER;
	public static final IRI DATA_STEWARD;
	public static final IRI DATA_CUSTODIAN;
	public static final IRI DATA_CLASSIFIED_BY;
	public static final IRI IS_AUTHORATATIVE_SOURCE_FOR;
	public static final IRI IS_DATA_PROVIDER_FOR;
	public static final IRI HAS_CODE;
	public static final IRI HAS_DESCRIPTION;
	public static final IRI HAS_DISPLAY_NAME;
	public static final IRI HAS_ID;
	public static final IRI HAS_NAME;
	public static final IRI IS_GOVERNED_BY;
	public static final IRI IS_MANAGED_BY;
	public static final IRI DATA_VISIBIITY_CLASSIFICATION;
	public static  final IRI PUBLIC;
	public static final IRI INTERNAL;
	public static final IRI CONFIDENTIAL;
	public static final IRI HCI;
	public static final IRI PID;
	public static final IRI CID;
	 
	static {
		ValueFactory factory = SimpleValueFactory.getInstance();
		ACCOUNTING_EVENT = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#AccountingEvent");
		ACCURACY=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#Accuracy");
		ANY_STANDARD_APPLICATION=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#Application");
		BUSINESS_DATA=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#BusinessData");
		BUSINESS_RULE=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#BusinessRule");
		BUSINESS_TERM=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#BusinessTerm");
		GOVERNANCE_ASSET=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#GovernanceAsset");
		MASTER_DATA=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#MasterData");
		REFERENCE_DATA=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#ReferenceData");
		STANDARD_SERVICE=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#Service");
		SOFTWARE_ASSET=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#SoftwareAsset");
		TRANSACTION_DATA=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#TransactionData");
		COMPLETENESS=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#Completeness");
		CONFORMITY=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#Conformity");
		CRITICAL_DATA_ELEMENT=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#CriticalDataElement");
		DATASET=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#Dataset");
		DERIVED_DATA=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#DerivedData");
		DATA_ASSET=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#DataAsset");
		DATA_ATTRIBUTE=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#DataAttribute");
		DATA_DOMAIN=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#DataDomain");
		DATA_ELEMENT=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#DataElement");
		DATA_QUALITY_DIMENSION=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#DataQualityDimension");
		DATA_QUALITY_RULE=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#DataQualityRule");
		EVENT_DATA=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#EventData");
		FINANCIAL_EVENT=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#FinancialEvent");
		VALIDITY=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#Validity");
		DATA_OWNER = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#DataOwner");
		DATA_CUSTODIAN=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#DataCustodian");
		DATA_STEWARD=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#DataSteward");
		DATA_CLASSIFIED_BY = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#data_classified_by");
		//HAS_DATA_CUSTODIAN = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#has_data_custodian");
		//HAS_DATA_OWNER = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#has_data_owner");
		//HAS_DATA_STEWARD = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#has_data_steward");
		IS_AUTHORATATIVE_SOURCE_FOR = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#is_authoratative_source_for");
		IS_DATA_PROVIDER_FOR = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#is_data_provider_for");
		IS_GOVERNED_BY = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#is_governed_by");
		IS_MANAGED_BY = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#is_managed_by");
		HAS_CODE = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#hasCode");
		HAS_DESCRIPTION = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#hasDescription");
		HAS_DISPLAY_NAME = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#hasDisplayName");
		HAS_ID = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#hasId");
		HAS_NAME = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#hasName");
		DATA_VISIBIITY_CLASSIFICATION = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#DataVisibiityClassification");
		PUBLIC = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#Public");
		INTERNAL=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#Internal");
		CONFIDENTIAL=factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#Confidential");
		HCI = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#HCI");
		PID = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#PID");
		CID = factory.createIRI("http://spec.trigyan.net/glide/EnterpriseInformationModel#CID");
		 
	}
	
}
