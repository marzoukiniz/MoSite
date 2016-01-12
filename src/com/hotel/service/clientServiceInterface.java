package com.hotel.service;

import java.util.List;

import com.hotel.beans.Client;

public interface clientServiceInterface {
	public void addClient(Client user);

	 public void updateClient(Client client);
	
	 public void deleteClient(Client client);

	 public Client getClientById(int id);
	 public Client findById(int id);

	 public List<Client> getClients();
	 public boolean verificationMotdepasseLogin(String login, String motdepasse);


}
