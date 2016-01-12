package com.hotel.dao;
import com.hotel.beans.*;

import java.util.*;

public interface clientDaoInterface {
	public void addClient(Client user);

	 public void updateClient(Client client);
	
	 public void deleteClient(Client client);

	 public Client getClientById(int id);

	 public List<Client> getClients();
	 public Client findById(int id);
	 public boolean verificationMotdepasseLogin(String login,String motdepasse);

}
