package com.ordermanagements.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Track")
public class Track {
private int id;
private String Status;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
@Override
public String toString() {
	return "Track [id=" + id + ", Status=" + Status + "]";
}
public Track(int id, String status) {
	super();
	this.id = id;
	Status = status;
}

}
