package constructors;

public class SocialMedia {

	public static void main(String[] args) {

		FacebookUser fb1 = new FacebookUser("james123", "jbond123!");
		FacebookUser fb2 = new FacebookUser("MoSalah", "Liverpool");
		FacebookUser fb3 = new FacebookUser("firma", "roberto09");
		
		FacebookUser fb4 = new FacebookUser("James Bond", "jbond007", "jbond007");
		System.out.println(fb4.name);
		System.out.println(fb4.password);
		
		fb1.age = 25;
		fb1.numberOfFriends = 100;
		fb1.name = "James Bond";

		fb2.age = 27;
		fb2.numberOfFriends = 1000;
		fb2.name = "Mohamed Salah";
		
		fb3.name = "Roberto Firmino";
		fb3.age = 28;
		fb3.numberOfFriends = 555;
	
		
		boolean check = fb2.sendFriendRequest(fb3);
		System.out.println(check);
		System.out.println(fb2.name + "'s friends: " + fb2.numberOfFriends);
		System.out.println(fb3.name + "'s friends: " + fb3.numberOfFriends);
		
		fb2.userinfo();
		fb3.userinfo();
	}
}
