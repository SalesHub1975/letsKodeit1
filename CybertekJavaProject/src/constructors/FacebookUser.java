package constructors;

public class FacebookUser {

	String username;
	int age;
	String name;
	String password;
	int numberOfFriends;

	
	
	public FacebookUser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	
	
	
	public FacebookUser(String name, String username, String password) {
		this.name = name;
		this.username = username;
		if (password.contains(username)) {
			System.out.println("password can’t contain username. Please change password");
			this.password = "";
		} else {
			this.password = password;
		}
	}

	
	
	public boolean sendFriendRequest(FacebookUser user) {
		if (user.numberOfFriends < 5000) {
			System.out.println("Friend request sent to " + user.name);
			user.numberOfFriends++;
			this.numberOfFriends++;
			return true;
		} else {
			System.out.println(user.name + " can't accept friend request!");
		return false;
	}
	}
		
		
	public void userinfo() {
		System.out.println("\nFACEBOOK USER INFORMATION:");
		System.out.println("Name: " + this.name);
		System.out.println("Username: " + this.username);
		System.out.println("Age: " + this.age);
		System.out.println("Friends: " + this.numberOfFriends);
	}

}
