package com.sdajava.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persons", schema = "ksiegarnia")
public class PersonsEntity {
    private int id;
    private String firstName;
    private String lastname;

    @Column(name = "first_name", nullable = true, length = 128)
    public String getFirstName () { return this.firstName; }
    public void setFirstName (String firstName) { this.firstName = firstName; }

    @Column(name = "lastname", nullable = true, length = 128)
    public String getLastname() { return this.lastname; }
    public void setLastname(String lastname){ this.lastname = lastname;}

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {return this.id;}
    public void setId (int id) {this.id = id;}

}
