package com.model;

import java.util.Set;

import javax.persistence.*;

@Entity

@Table(name = "utilisateur")
public class Utilisateur {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "name")
	private String name;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "active")
	private int active;
	
	 @ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	                CascadeType.PERSIST,
	                CascadeType.MERGE
	            })
	    @JoinTable(name = "user_role",
	            joinColumns = { @JoinColumn(name = "user_id") },
	            inverseJoinColumns = { @JoinColumn(name = "role_id") })
	 private Set<Role> roles;
	 public Utilisateur() {
			
		}
	 public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getActive() {
			return active;
		}

		public void setActive(int active) {
			this.active = active;
		}

		public Set<Role> getRoles() {
			return roles;
		}

		public void setRoles(Set<Role> roles) {
			this.roles = roles;
		}

}
