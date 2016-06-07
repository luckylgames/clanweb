package mcpeek.kevin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	
	public List<User> getAllUsers() {		
		try {
			File file = new File("Users.dat");
			
			if(!file.exists()) {
				User user = new User(1, "apoplectic", "#RP92QQR2","Elder","kevin.j.mcpeek@live.com", "Kevin");
				List<User> userList = new ArrayList<User>();
				userList.add(user);
				saveUserList(userList);
				return userList;
			}
			else {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
				@SuppressWarnings("unchecked")
				List<User>userList = (List<User>) ois.readObject();
				ois.close();
				return userList;
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return new ArrayList<User>();
	}

	public User getUser(int id) {
		List<User> users = getAllUsers();
		
		for(User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return new User();
	}
	
	public boolean addUser(User newUser) {
		List<User> userList = getAllUsers();
		boolean userExists = false;
		
		for(User user:userList) {
			if(user.getId() == newUser.getId()) {
				userExists = true;
				break;
			}
		}
		
		if(!userExists) {
			userList.add(newUser);
			saveUserList(userList);
			return false;
		}
		return true;
	}
	
	private void saveUserList(List<User> userList) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("Users.dat")));
			oos.writeObject(userList);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
