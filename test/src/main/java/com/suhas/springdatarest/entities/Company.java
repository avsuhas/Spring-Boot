package com.suhas.springdatarest.entities;

import javax.persistence.*;

@Entity
public class Company{
    private int id;
    private String name;
    private User user;


    @ManyToOne
    @JoinColumn(name = "USER_ID")
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Company() {

    }

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, User user) {
        this.name = name;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="COMPANY_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
