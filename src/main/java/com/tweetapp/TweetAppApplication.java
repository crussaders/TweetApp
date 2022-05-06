package com.tweetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import lombok.Generated;

@SpringBootApplication

@Generated
public class TweetAppApplication {


//	public static TweetappServicesImpl tweetappServicesImpl;
//	
//	public static UserDetailsServiceImpl  userDetailsServiceImpl;
//     
//	static Scanner sc = new Scanner(System.in);
//	
//	public static String username = "";
//	
//	public static String password = "";

	public static void main(String[] args) {
		SpringApplication.run(TweetAppApplication.class, args);
//		ApplicationContext context = SpringApplication.run(TweetAppApplication.class, args);
//		tweetappServicesImpl = context.getBean(TweetappServicesImpl.class);
//		userDetailsServiceImpl = context.getBean(UserDetailsServiceImpl.class);
		//Menu();
	}

//	public static void Menu() {
//		boolean isLoggedIn = false;
//		int option;
//		do {
//			
//			if (!isLoggedIn) {
//				username = "";
//				password = "";
//				System.out.println("Select one option from below options \n 1.Register \n 2.Login \n 3.Forgot Password");
//				option = Integer.parseInt(sc.nextLine());
//				switch (option) {
//				case 1: register();
//					    break;
//				case 2: isLoggedIn = login();
//					    break;
//				case 3: forgotPassword();
//					    break;
//				default: System.out.println("Enter the correct option");
//				}
//			} else {
//	    	System.out.println("Select one option from below options \n 1.Post a Tweet \n 2.View my tweets \n 3.View all Users \n 4.Logout \n 5.View ALl Users Tweets \n 6.Reset Password");
//	        option = Integer.parseInt(sc.nextLine());
//	    	switch(option) { 
//	    	case 1: postATweet();
//	    	        break;
//	    	case 2: viewMyTweets(username);
//	                break;
//	    	case 3: viewAllUsers();
//	    	        break;
//	    	case 4: isLoggedIn=logout();
//	    	        break;
//	    	case 5: viewAllMyTweets();
//	    	        break;
//	    	case 6: resetPassword();
//	    	        break;
//	    	default:System.out.println("Enter the correct option");
//			}
//		}} while (true);
//	}
//
//	public static void register() {
//		RegisterUserRequest registerUserRequest = new RegisterUserRequest();
//		System.out.println("In Register Method");
//		System.out.println("Enter first Name");
//		registerUserRequest.setFirstName(sc.nextLine());
//		System.out.println("Enter lastName");
//		registerUserRequest.setLastName(sc.nextLine());
//		System.out.println("Enter userName");
//		registerUserRequest.setUserName(sc.nextLine());
//		System.out.println("Enter gender");
//		registerUserRequest.setGender(sc.nextLine());
//		registerUserRequest.getGender();
//		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
//	    System.out.println("Enter dob in dd/MM/yyyy format");
//		try {
//			registerUserRequest.setDob(formatter.parse(sc.nextLine()));
//		} catch (ParseException e) {
//			 System.out.println(e.getMessage());
//		}
//		System.out.println("Enter email");
//		registerUserRequest.setEmail(sc.nextLine());
//		System.out.println("Enter password");
//		registerUserRequest.setPassword(sc.nextLine());
//		tweetappServicesImpl.createUser(registerUserRequest);
//		
//	}
//
//	public static boolean login() {
//		LoginUserRequest loginUserRequest = new LoginUserRequest();
//		System.out.println("In Login Method");
//		System.out.println("Enter User Name");
//		loginUserRequest.setUserName(sc.nextLine());
//		System.out.println("Enter Password");
//		loginUserRequest.setPassword(sc.nextLine());
//		UserDetails user = null;
//		if (loginUserRequest.getUserName() == null || loginUserRequest.getPassword() == null
//				|| loginUserRequest.getUserName().trim().isEmpty() || loginUserRequest.getPassword().trim().isEmpty()) {
//			System.out.println("Login unsuccessful --> User name or password is empty");
//			return false;
//		} else {
//			try {
//				user = userDetailsServiceImpl.loadUserByUsername(loginUserRequest.getUserName());
//
//			} catch (Exception e) {
//				System.out.println("User Not found");
//				return false;
//			}
//			if (user.getPassword().equals(loginUserRequest.getPassword())) {
//				//log.info("---------- Login successful-------------");
//				//log.info("=================Inside Validate==================");
//				username = loginUserRequest.getUserName();
//				password = loginUserRequest.getPassword();
//				return true;
//			} else {
//				//log.info("Login unsuccessful --> Invalid password");
//				return false;
//			}
//		}
//	}
//
//	public static void resetPassword() {
//		System.out.println("In Forgot Password Method");
//		LoginUserRequest loginUserRequest = new LoginUserRequest();
//		loginUserRequest.setUserName(username);
//		System.out.println("Enter New Password ");
//		loginUserRequest.setPassword(sc.nextLine());
//		tweetappServicesImpl.resetUserPassword(loginUserRequest);
//		System.out.println("Password was reset successfully");
//	}
//
//	public static void postATweet() {
//		UserNewTweetRequest userNewTweetRequest = new UserNewTweetRequest();
//		userNewTweetRequest.setUserName(username);
//		System.out.println(username);
//		System.out.println("Enter Tweet to post");
//		userNewTweetRequest.setTweet(sc.nextLine());
//		tweetappServicesImpl.createUserTweet(userNewTweetRequest);
//	}
//
//	public static void viewMyTweets(String username) {
//		List<TweetPostEntity> tweets = tweetappServicesImpl.viewAllMyTweets(username);
//		tweets.forEach(e -> System.out.println(e.getTweet()));
//	}
//	
//	
//	public static void viewAllMyTweets() {
//		List<TweetPostEntity> tweets = tweetappServicesImpl.getAllTweet();
//		tweets.forEach(e -> System.out.println(e.getTweet()));
//	}
//
//	public static void viewAllUsers() {
//		List<RegisterEntity> users = userDetailsServiceImpl.getUserList();
//		users.forEach(user -> System.out.println(users));
//	}
//
//	public static boolean logout() {
//		return false;
//	}
//	
//	public static void forgotPassword() {
//		LoginUserRequest loginUserRequest = new LoginUserRequest();
//		System.out.println("In Login Method");
//		System.out.println("Enter User Name");
//		loginUserRequest.setUserName(sc.nextLine());
//		System.out.println("Enter Mail Id");
//		String email = sc.nextLine();
//		UserDetails user = null;
//		try {
//			user = userDetailsServiceImpl.loadUserByUsername(loginUserRequest.getUserName());
//
//		} catch (Exception e) {
//			System.out.println("User Not found");
//			return ;
//		}
//		System.out.println("Enter New Password");
//		loginUserRequest.setPassword(sc.nextLine());
//		if(tweetappServicesImpl.forgotPassword(loginUserRequest, email)) {
//			//log.info("New Password set Successfully");
//		}else {
//			//log.info("Please Enter correct userName and Email ID");
//		}
//	}
  
}