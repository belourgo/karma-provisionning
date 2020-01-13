package com.francetelecom.wsa.wsdl.buconfiguration.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.4
 * 2020-01-08T10:07:45.301Z
 * Generated source version: 3.3.4
 *
 */
@WebService(targetNamespace = "http://WSA.francetelecom.com./wsdl/BuConfiguration/v1", name = "BuConfiguration")
@XmlSeeAlso({com.francetelecom.wsa.types.buconfiguration.ObjectFactory.class, ObjectFactory.class})
public interface BuConfiguration {

    @WebMethod
    @RequestWrapper(localName = "setBuConfiguration", targetNamespace = "http://WSA.francetelecom.com./wsdl/BuConfiguration/v1", className = "com.francetelecom.wsa.wsdl.buconfiguration.v1.SetBuConfiguration")
    @ResponseWrapper(localName = "setBuConfigurationResponse", targetNamespace = "http://WSA.francetelecom.com./wsdl/BuConfiguration/v1", className = "com.francetelecom.wsa.wsdl.buconfiguration.v1.SetBuConfigurationResponse")
    @WebResult(name = "setBuConfigurationReturn", targetNamespace = "http://WSA.francetelecom.com./wsdl/BuConfiguration/v1")
    public com.francetelecom.wsa.types.buconfiguration.BuConfigurationReturn setBuConfiguration(

        @WebParam(name = "identifierList", targetNamespace = "http://WSA.francetelecom.com./wsdl/BuConfiguration/v1")
        com.francetelecom.wsa.types.buconfiguration.IdentifierList identifierList,
        @WebParam(name = "serviceList", targetNamespace = "http://WSA.francetelecom.com./wsdl/BuConfiguration/v1")
        com.francetelecom.wsa.types.buconfiguration.ServiceList serviceList,
        @WebParam(name = "optionList", targetNamespace = "http://WSA.francetelecom.com./wsdl/BuConfiguration/v1")
        com.francetelecom.wsa.types.buconfiguration.OptionList optionList,
        @WebParam(name = "informationList", targetNamespace = "http://WSA.francetelecom.com./wsdl/BuConfiguration/v1")
        com.francetelecom.wsa.types.buconfiguration.InformationList informationList
    );
}
