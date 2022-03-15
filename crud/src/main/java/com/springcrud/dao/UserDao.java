package com.springcrud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.stereotype.Repository;

import com.springcrud.entities.User;

@Repository
public class UserDao {
   
	@Autowired
	private HibernateTemplate hibernateTemplate;

	// get all user;
	public List<User> getAll() {
		return this.hibernateTemplate.loadAll(User.class);
	}

	// get single user
	public User get(int id) {
		return this.hibernateTemplate.get(User.class, id);
	}

	// create user
	@Transactional
	public void insert(User user) {
		this.hibernateTemplate.saveOrUpdate(user);
	}


	// delete user
	@Transactional
	public void deleteData(int id) {
		this.hibernateTemplate.delete(get(id));
	}

	public HibernateTemplate getTemplate() {
		return hibernateTemplate;
	}

	public void setTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
