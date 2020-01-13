package com.francetelecom.wsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.francetelecom.wsa.types.buconfiguration.ArrayOfConstraint;
import com.francetelecom.wsa.types.buconfiguration.ArrayOfIdentifier;
import com.francetelecom.wsa.types.buconfiguration.ArrayOfInformation;
import com.francetelecom.wsa.types.buconfiguration.ArrayOfOption;
import com.francetelecom.wsa.types.buconfiguration.ArrayOfService;
import com.francetelecom.wsa.types.buconfiguration.ArrayOfSimpleValue;
import com.francetelecom.wsa.types.buconfiguration.BuConfigurationReturn;
import com.francetelecom.wsa.types.buconfiguration.Constraint;
import com.francetelecom.wsa.types.buconfiguration.ConstraintList;
import com.francetelecom.wsa.types.buconfiguration.Identifier;
import com.francetelecom.wsa.types.buconfiguration.IdentifierList;
import com.francetelecom.wsa.types.buconfiguration.Information;
import com.francetelecom.wsa.types.buconfiguration.InformationList;
import com.francetelecom.wsa.types.buconfiguration.Option;
import com.francetelecom.wsa.types.buconfiguration.OptionList;
import com.francetelecom.wsa.types.buconfiguration.Service;
import com.francetelecom.wsa.types.buconfiguration.ServiceList;
import com.francetelecom.wsa.types.buconfiguration.SimpleValue;
import com.francetelecom.wsa.types.buconfiguration.SimpleValueList;
import com.francetelecom.wsa.types.buconfiguration.ValueList;
import com.francetelecom.wsa.util.ParamConfig;
import com.francetelecom.wsa.wsdl.buconfiguration.v1.BuConfiguration;
import com.francetelecom.wsa.wsdl.buconfiguration.v1.BuConfigurationService;
import com.francetelecom.wsa.wsdl.buconfiguration.v1.SetBuConfiguration;


@Component
public class Configuration implements BuConfiguration {
    @Autowired
    private ParamConfig  paramConfig;
    
	@Override
	public BuConfigurationReturn setBuConfiguration(IdentifierList identifierList, ServiceList serviceList,
			OptionList optionList, InformationList informationList) {
		   BuConfigurationService configurationService=new BuConfigurationService();
		   BuConfigurationReturn buConfigReturn=configurationService.getBuConfigurationV1().setBuConfiguration(identifierList, serviceList, optionList, informationList);
		   return buConfigReturn;
	}
	
	public BuConfigurationReturn setConfiguration(Map<String,String> mapIdentifier,Map<String,String> mapSimpleValue,Map<String,String> mapOption,Map<String,String> mapInformation,String action) {
		SetBuConfiguration setBu=new SetBuConfiguration();
		
		//Identifier
		List<Identifier> itemsIdentifier=new ArrayList<Identifier>();
		if(!mapIdentifier.isEmpty()) {
			mapIdentifier.forEach((k,v)->{
				Identifier ident=new Identifier();
				ident.setType(k);
				ident.setValue(v);
				itemsIdentifier.add(ident);
			});
		}
		
		ArrayOfIdentifier arrayOfIdentifier=new ArrayOfIdentifier();
		arrayOfIdentifier.getItem().addAll(itemsIdentifier);
		
		IdentifierList identifierList=new IdentifierList();
		identifierList.setList(arrayOfIdentifier);
		setBu.setIdentifierList(identifierList);
		
		
		//Service
		List<Service> services=new ArrayList<Service>();
		Service service=new Service();
		service.setCPEType(paramConfig.getCpeType());
		service.setAction(action);
		service.setParentServRef(paramConfig.getParentSerfRef());
		service.setParentServType(paramConfig.getParentServType());
		service.setServRef(paramConfig.getServRef());
		service.setServPriority(paramConfig.getServPriority());
		service.setServType(paramConfig.getServType());
		
		List<SimpleValue> simpleValues=new ArrayList<SimpleValue>();
		if(!mapSimpleValue.isEmpty()) {
			mapSimpleValue.forEach((k,v)->{
			SimpleValue simpleValue=new SimpleValue();
			simpleValue.setName(k);
		    simpleValue.setValue(v);
		    simpleValues.add(simpleValue);
		 });
		}
		 ArrayOfSimpleValue arrayOfSimpleValue=new ArrayOfSimpleValue();
		 arrayOfSimpleValue.getItem().addAll(simpleValues);
		 
		 SimpleValueList simpleValueList=new SimpleValueList();
		 simpleValueList.setList(arrayOfSimpleValue);
		 service.setSimpleValue(simpleValueList);
		
		 
		 Constraint constraint=new Constraint();
		 constraint.setName(paramConfig.getConstraintKey());
		 List<String> ConstrainstValues=paramConfig.getConstraintsValue();
		 ValueList valueList=new ValueList(); 
		 ConstrainstValues.forEach(k->{
			 if(!k.isEmpty()) {
				 valueList.getValues().add(k); 
			 }
		 });
		 constraint.setValueList(valueList);
		 ArrayOfConstraint arrayOfConstraint=new ArrayOfConstraint();
		 arrayOfConstraint.getItem().add(constraint);
		 ConstraintList constraintList=new ConstraintList();
		 constraintList.setList(arrayOfConstraint);
		 service.setConstraints(constraintList);
		 services.add(service);

		 ArrayOfService arrayOfService=new ArrayOfService();
		 arrayOfService.getItem().addAll(services);
		 ServiceList serviceList=new ServiceList();
		 serviceList.setList(arrayOfService);
		 setBu.setServiceList(serviceList);
		 
		 //Option
		 List<Option> options=new ArrayList<Option>();
		 if(!mapOption.isEmpty()) {
			 mapOption.forEach((k,v)->{
				 Option option=new Option();
				 option.setName(k);
				 option.setValue(v);
				 options.add(option);
			 });
			 ArrayOfOption arrayOfOption=new ArrayOfOption();
			 arrayOfOption.getItem().addAll(options);
			 OptionList optionList=new OptionList();
			 optionList.setList(arrayOfOption);
			 setBu.setOptionList(optionList);
		 }
		 
		 //Information
		 List<Information> informations=new ArrayList<Information>();
		 if(!mapInformation.isEmpty()) {
			 mapInformation.forEach((k,v)->{
				 Information information=new Information();
				 information.setName(k);
				 information.setValue(v);
				 informations.add(information);
			 });
			 ArrayOfInformation arrayOfInformation=new ArrayOfInformation();
			 arrayOfInformation.getItem().addAll(informations);
			 InformationList informationList=new InformationList();
			 informationList.setList(arrayOfInformation);
			 setBu.setInformationList(informationList);
		 }
		 
		 return setBuConfiguration(setBu.getIdentifierList(), setBu.getServiceList(), setBu.getOptionList(), setBu.getInformationList());
		 
	}
	
	

}
