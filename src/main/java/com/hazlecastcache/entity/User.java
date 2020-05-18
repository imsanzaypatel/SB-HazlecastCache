package com.hazlecastcache.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "User2")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4999381158918610837L;


	@Id
	private int id;
	
	private String name;
	
	private String address;

}
