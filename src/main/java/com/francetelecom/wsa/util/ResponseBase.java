/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francetelecom.wsa.util;


/**
 *
 * @author fossouulrich
 */
public class ResponseBase {
    private Status status;
    private boolean  hasError;
    private String sessionUser;
    private Long count;
    
    private String codeOperateur;
    private String messageOperateur;
    
    public String getCodeOperateur() {
		return codeOperateur;
	}

	public void setCodeOperateur(String codeOperateur) {
		this.codeOperateur = codeOperateur;
	}

	public String getMessageOperateur() {
		return messageOperateur;
	}

	public void setMessageOperateur(String messageOperateur) {
		this.messageOperateur = messageOperateur;
	}


	public ResponseBase() {
       status=new Status();
    }


    public String getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(String sessionUser) {
        this.sessionUser = sessionUser;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }
    
    
   
}
