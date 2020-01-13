//
///*
// * Java transformer for entity table Utilisateurs 
// * Created on 27 juin 2017 ( Time 13:29:58 )
// * Generator tool : Telosys Tools Generator ( version 2.1.1 )
// * Copyright 2017 Savoir Faire Linux. All Rights Reserved.
// */
//
//package com.francetelecom.wsa.rest;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.francetelecom.wsa.Configuration;
//import com.francetelecom.wsa.types.buconfiguration.BuConfigurationReturn;
//import com.francetelecom.wsa.util.Action;
//import com.francetelecom.wsa.util.ParamConfig;
//import com.francetelecom.wsa.util.Parameters;
//import com.francetelecom.wsa.util.Request;
//import com.francetelecom.wsa.util.Response;
//import com.francetelecom.wsa.util.Status;
//
//
///**
// * Controller for table "Utilisateurs"
// * 
// * @author SFL Back-End developper
// *
// */
//@CrossOrigin("*")
//@RestController
//@RequestMapping(value = "/karma")
//public class BuConfigController {
//
//	@Autowired
//	private ParamConfig	paramConfig;
//	
//	@Autowired
//	private Configuration	configuration;
//	
//	private Logger slf4jLogger = LoggerFactory.getLogger(getClass());
//
//	@RequestMapping(value = "/setConfiguration", method = RequestMethod.POST,consumes = {"application/json"},produces={"application/json"})
//	public Response<Parameters> setConfiguration(@RequestBody Request<Parameters> request) {
//		slf4jLogger.info("start method /karma/setConfiguration");
//		Response<Parameters> response=new Response<Parameters>();
//		response.setHasError(true);	
//		Status status=new Status();
//		status.setCode("900");
//		status.setMessage("Mandatory");
//		response.setStatus(status);
//		try {
//			if(request!=null) {
//				Parameters parameters = null;
//				parameters = request.getData();
//				String action=parameters.getAction();
//				Map<String,String> mapIdentifiers=new HashMap<String,String>();
//				List<String> identifiers=paramConfig.getIdentifiers();
//				identifiers.forEach(k->{
//					String[] tab=k.split(":");
//					mapIdentifiers.put(tab[0], tab[1]);
//				});
//				if(parameters.getAdresseMac()!=null) {
//					mapIdentifiers.put(paramConfig.getMacKey(), parameters.getAdresseMac());
//				}
//				
//				String valueDomain=parameters.getNd()+"@"+paramConfig.getDomain();
//				
//				Map<String,String> mapSimpleValue=new HashMap<String,String>();
//				mapSimpleValue.put(paramConfig.getNdip(), parameters.getNd());
//				mapSimpleValue.put(paramConfig.getImpi(), valueDomain);
//				mapSimpleValue.put(paramConfig.getAuthKey(), paramConfig.getAuthValue());
//				mapSimpleValue.put(paramConfig.getUrisip(), "sip:"+valueDomain);
//				
//				
//				Map<String,String> mapOptions=new HashMap<String,String>();
//				List<String> options=paramConfig.getOptions();
//				options.forEach(k->{
//					String[] tab=k.split(":");
//					mapOptions.put(tab[0], tab[1]);
//				});
//				
//				Map<String,String> mapInformations=new HashMap<String,String>();
//				mapInformations.put(paramConfig.getOfferKey(), parameters.getOffer());
//				
//				String act="";
//				if(action.equals(Action.activate.toString())) {
//						act="ACT";			
//				}else if(action.equals(Action.delete.toString())) {
//					    act="DEL";					
//				}
//				
//				BuConfigurationReturn setBu=configuration.setConfiguration(mapIdentifiers, mapSimpleValue, mapOptions, mapInformations,act);
//				String code=setBu.getResponseList().getList().getItem().get(0).getCode();
//				if(code.equals("501")) {
//					response.setHasError(false);	
//				}else {
//					response.setHasError(true);
//					status=new Status();
//					status.setCode(code);
//					status.setMessage(setBu.getResponseList().getList().getItem().get(0).getDescription());
//					response.setStatus(status);
//				}	
//			}else {
//				slf4jLogger.info("null request");
//			}
//		}catch (Exception e) {
//			slf4jLogger.info(e.getMessage());
//		}
//		slf4jLogger.info("end method  /karma/setConfiguration");
//		return response;
//	}
//
//}
