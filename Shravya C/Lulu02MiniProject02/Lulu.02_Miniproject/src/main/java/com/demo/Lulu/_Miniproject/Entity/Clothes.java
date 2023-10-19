package com.demo.Lulu._Miniproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Clothes {
	@Id

	int id;

	String name;

	int cost;

	String feedback;

	public int getId() {

		return id;

	}

	public void setId(long id2) {

		this.id = (int) id2;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getCost() {

		return cost;

	}

	public void setCost(int cost) {

		this.cost = cost;

	}

	public String getFeedback() {

		return feedback;

	}

	public void setFeedback(String feedback) {

		this.feedback = feedback;

	}

	public Clothes(int id, String name, int cost, String feedback) {

		super();

		this.id = id;

		this.name = name;

		this.cost = cost;

		this.feedback = feedback;

	}

	public Clothes() {

		super();

		// TODO Auto-generated constructor stub

	}

	@Override

	public String toString() {

		return "Clothes [id=" + id + ", name=" + name + ", cost=" + cost + ", feedback=" + feedback + "]";

	}
}

