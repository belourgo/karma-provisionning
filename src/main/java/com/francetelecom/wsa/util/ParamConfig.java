package com.francetelecom.wsa.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



//@Component
public class ParamConfig {
	
    @Value("#{'${identifiers}'.split(';')}")
    private List<String> identifiers;
    
	@Value("${identifier.type.mac.key}")
	private String	macKey;
	
	@Value("${service.type.cpeType}")
	private String	cpeType;
	
	@Value("${service.constraint.name.key}")
	private String	constraintKey;
	
	@Value("#{'${service.constraints.name.value}'.split(';')}")
	private List<String> constraintsValue;
	
	@Value("${service.type.parentServRef}")
	private String	parentSerfRef;
	
	@Value("${service.type.servRef}")
	private String	servRef;
	
	@Value("${service.type.servPriority}")
	private Integer	servPriority;
	
	@Value("${service.type.servType}")
	private String	servType;
	
	@Value("${service.type.parentServType}")
	private String	parentServType;
	
	@Value("${service.type.simpleValue.ndip.key}")
	private String	ndip;
	
	@Value("${service.type.simpleValue.impi.key}")
	private String	impi;
	
	@Value("${service.type.simpleValue.domain.key}")
	private String	domain;
	
	@Value("${service.type.simpleValue.auth.key}")
	private String	authKey;
	
	public List<String> getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(List<String> identifiers) {
		this.identifiers = identifiers;
	}

	public String getMacKey() {
		return macKey;
	}

	public void setMacKey(String macKey) {
		this.macKey = macKey;
	}

	public String getCpeType() {
		return cpeType;
	}

	public void setCpeType(String cpeType) {
		this.cpeType = cpeType;
	}

	public String getConstraintKey() {
		return constraintKey;
	}

	public void setConstraintKey(String constraintKey) {
		this.constraintKey = constraintKey;
	}

	public List<String> getConstraintsValue() {
		return constraintsValue;
	}

	public void setConstraintsValue(List<String> constraintsValue) {
		this.constraintsValue = constraintsValue;
	}

	public String getParentSerfRef() {
		return parentSerfRef;
	}

	public void setParentSerfRef(String parentSerfRef) {
		this.parentSerfRef = parentSerfRef;
	}

	public String getServRef() {
		return servRef;
	}

	public void setServRef(String servRef) {
		this.servRef = servRef;
	}

	public Integer getServPriority() {
		return servPriority;
	}

	public void setServPriority(Integer servPriority) {
		this.servPriority = servPriority;
	}

	public String getServType() {
		return servType;
	}

	public void setServType(String servType) {
		this.servType = servType;
	}

	public String getParentServType() {
		return parentServType;
	}

	public void setParentServType(String parentServType) {
		this.parentServType = parentServType;
	}

	public String getNdip() {
		return ndip;
	}

	public void setNdip(String ndip) {
		this.ndip = ndip;
	}

	public String getImpi() {
		return impi;
	}

	public void setImpi(String impi) {
		this.impi = impi;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public String getAuthValue() {
		return authValue;
	}

	public void setAuthValue(String authValue) {
		this.authValue = authValue;
	}

	public String getUrisip() {
		return urisip;
	}

	public void setUrisip(String urisip) {
		this.urisip = urisip;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String getOfferKey() {
		return offerKey;
	}

	public void setOfferKey(String offerKey) {
		this.offerKey = offerKey;
	}

	@Value("${service.type.simpleValue.auth.value}")
	private String	authValue;
	
	@Value("${service.type.simpleValue.urisip.key}")
	private String	urisip;
	
	@Value("#{'${options}'.split(';')}")
    private List<String> options;
	
	@Value("${information.type.offer.key}")
	private String	offerKey;
}
