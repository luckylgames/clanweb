/**
 * 
 */
package mcpeek.kevin;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Kevin McPeek
 * @version 0.1
 *
 * Representation of the User object.  
 */

@XmlRootElement(name="user")
public class User implements Serializable {
	private static final long serialVersionUID = -3451198135073196751L;
	
	private int id;
	private String displayName;
	private String UUID; 
	private String role;
	private String email;
	private String realName; // Optional

	// Required by JAXB
	public User() {}
	
	public User(int id, String displayName, String UUID, String role, String email) {
		this(id, displayName, UUID, role, email, displayName);
	}
	
	public User(int id, String displayName, String UUID, String role, String email, String realName) {
		this.setId(id);
		this.setDisplayName(displayName);
		this.setUUID(UUID);
		this.setRole(role);
		this.setEmail(email);
		this.setRealName(realName);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	@XmlElement(required=true)
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	@XmlElement(nillable=true)
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the UUID
	 */
	public String getUUID() {
		return UUID;
	}
	
	/**
	 * @param UUID the UUID to set
	 */
	@XmlElement(nillable=true, required=true)
	public void setUUID(String UUID) {
		this.UUID = UUID;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	
	/**
	 * @param role the role to set
	 */
	@XmlElement(required=true)
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	@XmlElement(required=true)
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * @param realName the realName to set
	 */
	@XmlElement
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object instanceof User) {
			return true;
		}
		return false;
	}
}
