/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francetelecom.wsa.util;

import java.util.List;



import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 * @author fossouulrich
 */

@JsonInclude(Include.NON_NULL)
@XmlRootElement
@Component
public class Response<T> extends ResponseBase {

	private T item;
	private List<T> items;
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public List<T> getItems() {
		return items;
	}
	public void setItems(List<T> items) {
		this.items = items;
	}

	
	//private String dateHeureSystem;

	/*private List<FactureDto> itemsFacture;
	private List<TransfertResponseDto> itemsTransfert;
    
    private List<PaiementDto> itemsPaiement;

    private List<FormatFactureDto> itemsFormatFacture;
    
    private FormatPaiementDto paiement; 
    
    private List<UtilisateurDto> itemsConnexion;
    
    private List<OperateurTelephoniqueDto> itemsOperateur;
    
    private List<TransactionDto> itemsTransaction;
    
    private List<UpdateTransactionTermineDto> itemsTransactions;   
    
    private List<StatutTransactionDto> itemsStatutTransaction; 
    
    private List<OperateursDto> itemsOperateurs;
    private List<ProjetsDto> itemsProjets;

    private List<RoleDto> itemsRole;
    
    private List<NumeroOperateursDto> itemsNumeroOperateur;
    
    private List<ParametresDto> itemsParametres;
    
    private List<FonctionaliteDto> itemsFonctionalite;  
    
    private List<LesPrivilegesDunRoleDto> itemsPrivileges; 
    
    private List<LesProjetDunUtilisateurDto> itemsPrivilegePojets; 
    
    private List<ToutesLesTransactionsDto> itemsDashBoard; 
    
    private List<DashBoardByOperateurDto> itemsDashBoardByOperateur; 
    
    private List<DashBoardByStatusDto> itemsDashBoardByStatus; 
    
    private List<DashBoardByProjetDto> itemsDashBoardByProjet; */
   
	
}
