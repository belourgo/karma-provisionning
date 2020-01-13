package com.francetelecom.wsa.util;

import org.springframework.stereotype.Component;

//@Component
public class Parameters {
  public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	public String getAdresseMac() {
		return adresseMac;
	}
	public void setAdresseMac(String adresseMac) {
		this.adresseMac = adresseMac;
	}
	public String getNd() {
		return nd;
	}
	public void setNd(String nd) {
		this.nd = nd;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
private String offer;
  private String adresseMac;
  private String nd;
  private String action;
}
