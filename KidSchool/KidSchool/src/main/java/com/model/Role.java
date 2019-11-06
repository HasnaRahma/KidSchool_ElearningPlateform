package com.model;




import java.util.Set;

import javax.persistence.*;

@Entity

@Table(name = "roles")
public class Role {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="role_id")
	private int id;
	@Column(name="role")
	private String role;
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            },
            mappedBy = "roles")
    private Set<Utilisateur> utilisateur ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}/*public class Role implements Serializable
{
@Id
private int id;
@Column(name="role")
private String role;
public Role() {
	

}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}*/

