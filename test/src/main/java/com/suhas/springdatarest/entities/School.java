package com.suhas.springdatarest.entities;

import javax.persistence.*;

@Entity
public class School{
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

	public School() {

    }

    public School(String name) {
        this.name = name;
    }

    public School(String name, User user) {
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
    @Column(name="SCHOOL_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
