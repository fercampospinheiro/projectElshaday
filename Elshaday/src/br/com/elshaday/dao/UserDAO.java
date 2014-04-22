package br.com.elshaday.dao;

import br.com.elshaday.model.user.User;

public class UserDAO extends GenericDAO<User> {

	public UserDAO(){
		super(User.class);
	}
}
