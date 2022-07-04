import java.util.InputMismatchException;
import java.util.Scanner;
public class Admin {

	
	static Scanner input = new Scanner(System.in);
	
	
	//private fields of Admin class
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	Customer [] clist = new Customer[100]; //customer list
	String [] plist = new String[100]; //customers password list
	int [] blist = new int[100]; //customers balance list
	int numberOfCycles = 0;
	String [] gardesh = new String[100]; //gardesh list
	int i = 0;
	int j = 0;
	int k = 0;

	//getter and setter methods
	public String getUsername () {
		return userName;
	}
	
	public void setUsername(String u) {
		userName = u;
	}
	
	
	public String getPassword () {
		return password;
	}
	
	public void setPassword(String p) {
		password = p;
	}
	
	
	public String getFirstname () {
		return firstName;
	}
	public void setFirstname(String f) {
		firstName = f;
	}
	
	public String getLastname () {
		return lastName;
	}
	
	
	public void setLastname(String l) {
		lastName = l;
	}
	
	
	
	//add customer method
	
	void addCustomer() {
		
		Customer temp = new Customer();//new object of customer to access the fields of Customer class
		System.out.println("Enter the Customer's Firstname: ");
		temp.firstName = input.next();
		System.out.println("Enter the Customer's Lastname: ");
		temp.lastName = input.next();		
		
		System.out.println("Enter the Customer's Password: ");
		String pass = input.next();
		temp.setPassword(pass);
		plist[j] = pass; //saving passwords in a special array called plist[]
		j++;
		while(true) {
		System.out.println("Enter the Customer's Balance: ");
		try {
		int balance = input.nextInt();
		temp.setBalance(balance);
		blist[k] = balance; //saving balances in a special array called blist[]
		k++;
		break;
		}
		catch(InputMismatchException e) {
			System.err.println("Wrong number! Please try again: ");
			input.next();
			continue;
		}
		}
		clist[i] = temp; //assign temp obj to clist[] array of Customer class
		i++;
		System.out.println("Thank you! Customer added successfully.");
		
	}
	
	
	//variz method

	void variz() {
		gardesh[numberOfCycles] = "Variz";
		numberOfCycles++;
		Ui obj = new Ui(); //creating an object of Ui class
		int z = obj.x;
		Scanner input = new Scanner(System.in);
		while(true) {
		try {
			//fast cash
		System.out.println("Lotfan mablaghe morede nazar ra entekhab konid: ");
		System.out.println("1-10'000 \t 2-20'000");
		System.out.println("3-25'000 \t 4-50'000");
		System.out.println("5-100'000 \t 6-200'000");
		System.out.println("7- Mabaleghe digar");
		
		int number = input.nextInt();
		
		
		
		switch(number) {
		
		case 1:
			blist[z]+= 10000;
			clist[z].setBalance(blist[z]);
			System.out.println("Successful!");
			System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
			break;
			
		case 2:
			blist[z]+= 20000;
			clist[z].setBalance(blist[z]);
			System.out.println("Successful!");
			System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
			break;
		
		case 3:
			blist[z]+= 25000;
			clist[z].setBalance(blist[z]);
			System.out.println("Successful!");
			System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
			break;
			
		case 4:
			blist[z]+= 50000;
			clist[z].setBalance(blist[z]);
			System.out.println("Successful!");
			System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
			break;
			
		case 5:
			blist[z]+= 100000;
			clist[z].setBalance(blist[z]);
			System.out.println("Successful!");
			System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
			break;
			
		case 6:
			blist[z]+= 200000;
			clist[z].setBalance(blist[z]);
			System.out.println("Successful!");
			System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
			break;
			
		case 7:
			System.out.println("Lotfan mablaghe morede nazar ra vared konid: ");
			int cash = input.nextInt();
			if(cash <= 0) {
				System.err.println("Wrong! Please enter again: ");
				continue;
			} else {
				System.out.println("Successful!");
				blist[z]+=cash;
				System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
				clist[z].setBalance(blist[z]);
			}
			break;
				
				default:
					System.err.println("Wrong code! Try again: ");
					continue;
		}
		break;
		
		} catch(InputMismatchException e) {
			input.next();
			System.err.println("Wrong! Please enter again: ");

		}
	}
	}
	
	
	//bardasht method

		void bardasht() {
			gardesh[numberOfCycles] = "Bardasht";
			numberOfCycles++;
			
			Ui obj = new Ui();
			int z = obj.x;
			Scanner input = new Scanner(System.in);
			while(true) {
			try {
				//fast deposit
			System.out.println("Lotfan mablaghe morede nazar ra entekhab konid: ");
			System.out.println("1-10'000 \t 2-20'000");
			System.out.println("3-25'000 \t 4-50'000");
			System.out.println("5-100'000 \t 6-200'000");
			System.out.println("7- Mabaleghe digar");
			
			int number = input.nextInt();
			
			
			
			switch(number) {
			
			case 1:
				if(blist[z]<10000) {
					System.out.println("No Enough Cash!");
					break;
				}
				blist[z]-=10000;
				clist[z].setBalance(blist[z]);
				System.out.println("Successful!");
				System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
				break;
				
			case 2:
				if(blist[z]<20000) {
					System.out.println("No Enough Cash!");
					break;
				}
				blist[z]-=20000;
				clist[z].setBalance(blist[z]);
				System.out.println("Successful!");
				System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
				break;
				
			case 3:
				if(blist[z]<25000) {
					System.out.println("No Enough Cash!");
					break;
				}
				blist[z]-=25000;
				clist[z].setBalance(blist[z]);
				System.out.println("Successful!");
				System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
				break;
				
			case 4:
				if(blist[z]<50000) {
					System.out.println("No Enough Cash!");
					break;
				}
				blist[z]-=50000;
				clist[z].setBalance(blist[z]);
				System.out.println("Successful!");
				System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
				break;
				
			case 5:
				if(blist[z]<100000) {
					System.out.println("No Enough Cash!");
					break;
				}
				blist[z]-=100000;
				clist[z].setBalance(blist[z]);
				System.out.println("Successful!");
				System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
				break;
				
			case 6:
				if(blist[z]<200000) {
					System.out.println("No Enough Cash!");
					break;
				}
				blist[z]-=200000;
				clist[z].setBalance(blist[z]);
				System.out.println("Successful!");
				System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
				break;
				
			case 7:
				System.out.println("Lotfan mablaghe morede nazar ra vared konid: ");
				int cash = input.nextInt();
				if(cash <= 0) {
					System.err.println("Wrong! Please enter again: ");
					continue;
				}else if(cash > blist[z]) {
					System.err.println("No enough cash! Please enter again: ");
					continue;
				}
				else {
					blist[z]-=cash;
					clist[z].setBalance(blist[z]);
					System.out.println("Successful!");
					System.out.println("Mojoodie shoma: " + blist[z] + " toman.");
					break;
				}
				
				default:
					System.err.println("Wrong code! Try again: ");
					continue;
			}
			break;

			} catch(InputMismatchException e) {
				input.next();
				System.err.println("Wrong! Please enter again: ");

			}
		}
		}
		
		
		
		
		//enteghal method
		
		void enteghal() {
			gardesh[numberOfCycles] = "Enteghal";
			numberOfCycles++;
			
			Customer c = new Customer();
			int amount,u2,username;
			Ui obj = new Ui();
			int z = obj.x;
			System.out.println(i);
			while(true) {
				try {
			System.out.println("Enter the amount of money:");
			amount = input.nextInt();
			
			if(amount <= 0) {
				System.err.println("Wrong number. Try again: ");
				continue;
			} else if (amount > blist[z]) {
				System.err.println("No enough cash. Try again: ");
				continue;
			}
			else {
				break;
			}
				} catch(InputMismatchException e) {
					input.next();
					System.err.println("Wrong code. Try again: ");
				}
			}
			int user = 0; //userlist[user] = to username
			int user2 = 0; //userlist[user2] = from username
			int ii,jj;
			
			
			
			while(true) {
			System.out.println("Enter your username: ");
			u2 = input.nextInt();
			int bb = 1;
			for(jj = 0 ; jj < i ; jj++) { //check if username is in the list of usernames
				
				if(u2 == Ui.userList[jj]) {
					user2 = jj;
					bb = 2;
					break;
				}
			}
			if(bb == 1) {
				System.err.println("Incorrect username!");
				continue;
			} else if(bb == 2) {
				break;
			}
			}
		
			
			while(true) {

			System.out.println("Enter the username you want to transfer: ");
			username = input.nextInt();
			int aa = 1;
			for(ii = 0 ; ii < i ; ii++) { 
				
				if(username == Ui.userList[ii] && username != Ui.userList[user2]) { //check if username is in the list of usernames except own username
					user = ii;
					aa = 2;
					break;
				} else {
					aa = 1;
					continue;
				}
			}
			if(aa == 1) {
				System.err.println("No username found!");
				continue;
			} else if(aa == 2) {
				break;
			}
			}
			
	
			
			
			
			System.out.println("Your transfer: \t" + amount + " tomans to --> " + clist[user].firstName + " " + clist[user].lastName); //verify the transfer
			System.out.println("Are you sure? (Y/N)");
			String answer = input.next();
			
			if(answer.equalsIgnoreCase("y")) { //y or Y both are correct
				
			
				blist[user]+= amount; //add amount to the balance 
				int a = clist[user].getBalance();
				a = a + amount;
				clist[user].setBalance(a);
				
				blist[user2] -= amount;
				int b = clist[user2].getBalance();
				b = b - amount;
				clist[user2].setBalance(b);
				
				
				System.out.println("Thank you! Your transfer completed successfully. ");
				System.out.println("Mojoodie aknoone shoma: " + blist[user2] + " tomans.");	
				
			} else {
				System.err.println("Ok!");
			}

			
		}
		
		
		
		
		
		
	
	
	//customers list method

	void showList() {
				
		for(int x = 0 ; x<i ; x++) {
			System.out.println(x+1 + ": ");
			System.out.print(clist[x].firstName + "\t");
			System.out.print(clist[x].lastName + "\t");
			System.out.print(Ui.userList[x] + "\t"); //print usernames from userList array defined in Ui class
			System.out.print(clist[x].getBalance());
			System.out.println("\n");


		}
		
	}
	
	
	void removeCustomer() {
				
		
		while(true) {
			
		
			try {

				System.out.println("Enter the customer's username: ");
				int uname = input.nextInt();
				int n = 1;
				for (int x = 0 ; x<i ; x++) {
					if(Ui.userList[x] == uname) { //check if username is in the list of userList array
						Ui.userList[x] = Ui.userList[i-1];
						clist[x] = clist[i-1];
						plist[x] = plist[j-1];
						blist[x] = blist[k-1];
						j--; //plist array
						i--; //clist array
						k--; //blist array
						System.out.println("Thank you! Your customer deleted successfully. ");
						n=2;
						break;
					}
				}
						if(n==2)break;
						if(n==1)System.err.println("No customer found! Please try again: ");
						}
				catch (InputMismatchException ee) {
					input.next();
					System.err.println("Wrong number! Please try again: ");
				
				}
		}
	}
	

	
	
	
	
	
	void showStock() {
		int overall = 0;
		for(int x = 0 ; x<i ; x++) {
			overall = overall + clist[x].getBalance();
		}
		System.out.println("Overall cash is: " + overall + " Tomans.");
		
	}
	
	
	
	
	
	void gardesh() {
		
		for(int counter = 0 ; counter < 3 ; counter++) {
			
			System.out.print(counter+1 + ". ");
			
			System.out.println(gardesh[counter] + "\n");

			
		}
		
		
	}
	
	
	String changeAdminPass() {
		String newPass = null;
		System.out.println("Enter your old password:");
		String oldPass = input.next();
		
		if(oldPass.equals(getPassword())) {
			
			System.out.println("Enter your new password:");
			newPass = input.next();	
			System.out.println("Password changed successfully.");
	} else {
		System.err.println("Old password doesn't match.");

	}
		return newPass;
		
	}
		
	

	
	
	void mojoodi() {
		Ui obj = new Ui();
		int x = obj.x;
		System.out.println("Mojoodie felie shoma: " + blist[x] + " toman.");
	}
	
	
	
}
