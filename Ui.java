//Code by Rambod Azimi


//imports
import java.util.Scanner;
import java.util.Date;
import java.util.InputMismatchException;
import java.lang.*;

//begin of Ui class
public class Ui {

	public static int x = 0;

	static int[] userList = new int[100]; //usernames list

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) { //main method
		Date d1 = new Date();
		int a; //Admin's menu
		String b; // string for getting username and password for admin
		int c = 0; // int for getting username for customer
		String s =""; // string for getting password for customer
		int i = 0;
		int isAdmin = 0;//admin or customer
		int aa = 1;
		int bb = 1;
		int cmenu;//Customer's menu
		int error = 2; //attempts for password
		Admin admin = new Admin(); 		//new Admin instance with set methods
		admin.setFirstname("Rambod");
		admin.setLastname("Azimi");
		admin.setUsername("admin");
		admin.setPassword("admin12345");
		

		
		//Greething
		System.out.println(d1);
		System.out.println("Welcome\n");

		while(true) { //for getting correct code for admin or customer
		
		System.out.println("Who are you?");
		System.out.println("1. Admin");
		System.out.println("2. Customer");
		
		try {
		isAdmin = input.nextInt();
		
		
		if(isAdmin == 1) { //true 
			while(true) { //for getting correct user and pass
			System.out.println("Please enter your Admin's Username:(For exit, Enter 0)");
			b = input.next();
			if(b.equals("0")) {
				break;
			}
			if(b.equalsIgnoreCase(admin.getUsername()) == false) {
				System.err.println("Username is wrong. Please try again: ");
				continue;
			 
			}
			else {
				System.out.println("Please enter your Admin's Password: ");
				b = input.next();
			}
				if(b.equals(admin.getPassword()) == false) {
					if(error<=0) {
						System.err.println("You were blocked!");
						System.exit(0);//terminate the application
					}
					System.err.println("Password is wrong. Please try again from beginning: ");
					System.out.println(error + " attemps remaining.");
					error--;//times of remaining attempts
					continue;
				}
				else {
					System.out.println("\nWelcome " + admin.getFirstname().toUpperCase() + " " + admin.getLastname().toUpperCase());//greething to admin
					
					while(true) {	
						//admin's menu
						System.out.println("\nWhat do you want to do?");
						System.out.println("1. Add Customer");
						System.out.println("2. Remove Customer");
						System.out.println("3. Customers List");
						System.out.println("4. Overall Stock");
						System.out.println("5. Change Admin's Password");
						System.out.println("6. Sign Out");

						
						
						try {
							
						
						a = input.nextInt();
				
						if(a==1) { //add customer
							
							admin.addCustomer();
							userList[i] = generate();
							for(int j = 0 ; j <= i ; j++) { //if usernames are equal
								if(userList[i] == userList[j]) {
									userList[i] = generate();
								}
							}
							System.out.println("Your Customers's Username is:" + userList[i]);
							i++;
							
						} 
						else if(a==2) { //remove customer
							
							admin.removeCustomer();
							i--;
							
							
							
							
						}
						else if(a==3) { //customers list
							
							admin.showList();
							
							
							
							
						}
						else if (a==4) { //overall stock
							
							admin.showStock();
							
							
							
						}
						else if(a==5) { //change password
							
							
							admin.setPassword(admin.changeAdminPass());

						}
						else if (a==6) { //sign out
							
							break;
						}
						else {
							System.err.println("\nCode is wrong. Please try again: ");
						}
						}
					
					catch(InputMismatchException e) {
						input.next();
						System.err.println("Code is wrong. Please try again: ");
					}
						
					}					
		
					
				}
			}
			
			
			
			
		} else if(isAdmin == 2) { //false (if user was a customer)
		 int xx = 0;

		
			while(true) {
				
				aa = 0;
				bb = 0;
				
			System.out.println("Enter your Customer's Username: ");
			c = input.nextInt();
			
			for(xx = 0 ; xx<admin.i ; xx++) {//check the username of customer
				if(c == userList[xx]) {
					aa = 2;
					break;
				}
			}
			if(aa == 1) {
				System.err.println("Wrong Username! Please try again: ");
				continue;
			}
			if(aa == 2) {
				System.out.println("Enter your Customer's Password: ");
				s = input.next();
				
				
					if(s.equals(admin.plist[xx])) { //check the password of customer
						bb = 2;
					}
				
					if(bb == 1) {
						if(error<=0) {
							System.err.println("You were blocked!");
							System.exit(0); //terminate the application
						}
						System.out.println(error + " attemps remaining.");
						error--; //number of remaining attempts
						System.err.println("Wrong Password! Please try again from beginning: ");
						
						continue;
					}
					else if(bb == 2) {
						System.out.println("Welcome! " + admin.clist[xx].firstName.toUpperCase() + " " + admin.clist[xx].lastName.toUpperCase());//greething to customer
						x = xx;
					}
			
				}
				
						break;
						
					}
			
	if(bb == 2) {
				
		
		while(true) {
			//customer's menu
				System.out.println("\nWhat do you want to do?");
				System.out.println("1. Variz");
				System.out.println("2. Bardasht");
				System.out.println("3. Enteghal");
				System.out.println("4. Mojoodi");
				System.out.println("5. 3 Gardeshe Akhar");
				System.out.println("6. Sign Out");
				
	
					
					try {
				cmenu = input.nextInt();

				if(cmenu == 1) { //variz
					admin.variz();		
					
					
				} else if(cmenu == 2) { //bardasht
					admin.bardasht();
					
					
				}else if(cmenu == 3) { //enteghal
					admin.enteghal();
					
					
				}else if(cmenu == 4) { //mojoodi
					admin.mojoodi();
					
					
				}else if(cmenu == 5) { //3 gardeshe akhar
					
					admin.gardesh();
					
					
				}else if(cmenu == 6) { //sign out
					break;
					
				} else {
					System.out.println("Wrong code! Please try again: ");
					continue;
				}
					} catch(InputMismatchException eee) {
						input.next();
						System.out.println("Wrong code! Please try again: ");
					}
				}
			
	
				
			}
			
			
					
			
		}
		
		else { //code for admin or user is other
			System.err.println("Code is wrong. Please try again: ");
			continue;
		}
		
		}
		catch(InputMismatchException ee) { //for who are you
			input.next();
			System.err.println("Code is wrong. Please try again: ");
		}
		
		
		
		} // are you admin of customer
		
	
		
						
	}// end of main method


	
						
	static int low = 1000;
	static int high = 9999;
	public static int generate() {	//method defined if Ui class that generates a 4-degits rondom number 
		int random = (int)(Math.random()*(high-low+1)) + low;
		return random;
	}
}
	


