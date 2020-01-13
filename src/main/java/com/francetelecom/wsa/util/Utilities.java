package com.francetelecom.wsa.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.francetelecom.wsa.Configuration;
import com.francetelecom.wsa.types.buconfiguration.BuConfigurationReturn;

public class Utilities {

//
	private ParamConfig	paramConfig = new ParamConfig();
	
//	@Autowired
	private Configuration	configuration = new Configuration() ;
	
	
	public Response<Parameters> setConfiguration( Request<Parameters> request) {
//		slf4jLogger.info("start method /karma/setConfiguration");
		Response<Parameters> response=new Response<Parameters>();
		response.setHasError(true);	
		Status status=new Status();
		status.setCode("900");
		status.setMessage("Mandatory");
		response.setStatus(status);
		try {
			if(request!=null) {
				Parameters parameters = null;
				parameters = request.getData();
				String action=parameters.getAction();
				Map<String,String> mapIdentifiers=new HashMap<String,String>();
				List<String> identifiers=paramConfig.getIdentifiers();
				identifiers.forEach(k->{
					String[] tab=k.split(":");
					mapIdentifiers.put(tab[0], tab[1]);
				});
				if(parameters.getAdresseMac()!=null) {
					mapIdentifiers.put(paramConfig.getMacKey(), parameters.getAdresseMac());
				}
				
				String valueDomain=parameters.getNd()+"@"+paramConfig.getDomain();
				
				Map<String,String> mapSimpleValue=new HashMap<String,String>();
				mapSimpleValue.put(paramConfig.getNdip(), parameters.getNd());
				mapSimpleValue.put(paramConfig.getImpi(), valueDomain);
				mapSimpleValue.put(paramConfig.getAuthKey(), paramConfig.getAuthValue());
				mapSimpleValue.put(paramConfig.getUrisip(), "sip:"+valueDomain);
				
				
				Map<String,String> mapOptions=new HashMap<String,String>();
				List<String> options=paramConfig.getOptions();
				options.forEach(k->{
					String[] tab=k.split(":");
					mapOptions.put(tab[0], tab[1]);
				});
				
				Map<String,String> mapInformations=new HashMap<String,String>();
				mapInformations.put(paramConfig.getOfferKey(), parameters.getOffer());
				
				String act="";
				if(action.equals(Action.activate.toString())) {
						act="ACT";			
				}else if(action.equals(Action.delete.toString())) {
					    act="DEL";					
				}
				
				BuConfigurationReturn setBu=configuration.setConfiguration(mapIdentifiers, mapSimpleValue, mapOptions, mapInformations,act);
				String code=setBu.getResponseList().getList().getItem().get(0).getCode();
				if(code.equals("501")) {
					response.setHasError(false);	
				}else {
					response.setHasError(true);
					status=new Status();
					status.setCode(code);
					status.setMessage(setBu.getResponseList().getList().getItem().get(0).getDescription());
					response.setStatus(status);
				}	
			}else {
//				slf4jLogger.info("null request");
			}
		}catch (Exception e) {
//			slf4jLogger.info(e.getMessage());
		}
//		slf4jLogger.info("end method  /karma/setConfiguration");
		return response;
	}

}
