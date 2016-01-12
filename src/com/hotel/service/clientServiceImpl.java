package com.hotel.service;

import java.util.List;

import com.hotel.beans.Client;
import com.hotel.dao.clientDaoImplement;
import com.hotel.dao.clientDaoInterface;

public class clientServiceImpl implements clientServiceInterface{
	
	clientDaoInterface clientDaointerface= new clientDaoImplement();

	@Override
	public void addClient(Client client){
		clientDaointerface.addClient(client);	
	}

	@Override
	public void updateClient(Client client) {
		clientDaointerface.updateClient(client);	
		
	}
	
	 public Client findById(int id){
		 return  clientDaointerface.findById(id);	 
	 }


	@Override
	public void deleteClient(Client client) {
		clientDaointerface.deleteClient(client);	
		
	}

	@Override
	public Client getClientById(int id) {
		 return  clientDaointerface.getClientById(id);	
	}

	@Override
	public List<Client> getClients() {
		 return  clientDaointerface.getClients();	
	}

	@Override
	public boolean verificationMotdepasseLogin(String login, String motdepasse) {
		return clientDaointerface.verificationMotdepasseLogin(login, motdepasse);
		
	}
	
	

}
