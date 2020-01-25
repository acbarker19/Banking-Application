/*
This class is the User object. It allows user accounts to be set up. You can show 
or alter their first name, last name, username, password, account balance, and 
admin status.

Completed: 2/5/18

Created by:
    Alec Barker
    Jarrod Luca
    Cierra Roller
*/

package bankClasses;

// used for iostream functionality
// import classes from helpers package
import helpers.In;
import helpers.Out;
import helpers.Utility;


public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private double accBalance;
    private boolean isAdmin;
    private User[] userList;
    
    public User() {
        fillUserList();
    }
    
    public User(String first, String last, 
         String user, String pass, double balance, Boolean admin) {
        this.firstName = first;
        this.lastName = last;
        this.username = user;
        this.password = pass;
        this.accBalance = balance;
        this.isAdmin = admin;
    }
    
    // returns file as string array by line number
    public String[] fileToString() {
        In in;
        // input stream variable
        in = new In("./data.txt");
        // stores all file data as one string
        String fileData = in.readAll();
        // split String into userArray by \n
//        System.out.println(fileData);
        String[] userArr = fileData.split("\n");
        in.close();
        return userArr;
    }
    
    // rewrites file for new/changed data
    public void writeNewFile(User[] newArr) {
        // output stream variable
      Out out = new Out("./src/helpers/data.txt");
        // writes a new user to each line
        for (int i = 0; i < newArr.length; i++) {
          out.println(newArr[i]);
         }
       out.close();
    }
    
    // read in text file to create array of user objects
    public void fillUserList() {
        try {
            // create user object array of appropritate size
            userList = new User[fileToString().length];
            // fill userList with new user objects
            for (int i = 0; i < userList.length; i++) { 
                // splits each line of text into new array of data
                String[] userInfo = fileToString()[i].split(" ");
                // create new user objects with data from userInfo array
                String first = userInfo[0];
                String last = userInfo[1];
                // converts string to int
                double balance = Double.parseDouble(userInfo[2]);
                String user = userInfo[3];
                String pass = userInfo[4]; 
                
                String adminStr = userInfo[5];
                // remove new line and space characters from last item - 
                // causes value to always return false
                adminStr = adminStr.trim();
                // converts string to boolean
                boolean adminBool = Boolean.parseBoolean(adminStr);
                // add new user to userList at index
                System.out.println("test admin: " + adminBool);
                userList[i] = new User(first, last, user, pass, balance, adminBool);
                System.out.println(userList[i]);
            }   
        }
        // error handling
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public double getBalance() {
        return this.accBalance;
    }
    
    public boolean getAdmin(){
        return this.isAdmin;
    }
    
    // reduces repeating code
    public User getUser(int index) {
        if (index > this.userList.length || index < 0) {
            System.out.println("User does not exist");
        }
        return this.userList[index];
    }
    
    public User getUserByUsername(String user) {
        // search userList Array
        for (int i = 0; i < this.userList.length; i++) {
            // compare usernames to see if it exists
            if (userList[i].getUsername().equals(user)) {
                System.out.println(userList[i].getUsername());
                System.out.println(userList[i]);
                return userList[i];
            }
        }
        return new User();
    }
    
    public User[] getUserList() {
          return this.userList;
    }
    
    public void setFirstName(int index, String first) {
        this.firstName = first;       
    }
    
    public void setLastName(int index, String last) {
        this.lastName = last;
    }
    
    public void setUsername(int index, String usr) { 
        this.username = usr;
    }
    
    public void setPassword(int index, String pass) {
        this.password = pass;
    }
    
    public void setAdmin(int index, boolean admin){
        this.isAdmin = admin;  
    }
    
    public void withdraw(double amount) {
        
        // this will be a while loop when hooked up
        // to the GUI, so you can keep entering and get
        // error message
        if (amount < 0) {
            System.out.println("amount cannot be negative");
           
        }
        if((this.accBalance - amount) < 0.0){
            System.out.println("Insufficient funds.");
        }
        else{
            this.accBalance -= amount;
        }
       
    }
    
    public void deposit(double amount) {
        // this will be a while loop when hooked up
        // to the GUI, so you can keep entering and get
        // error message
        if (amount < 0) {
            System.out.println("amount cannot be negative");  
        }
        this.accBalance += amount;
    }
    
    // get values from fields in GUI
    public boolean login(String user, String pass) {
        Boolean answer = false;
        for(Integer i = 0; i < userList.length; i++){
            if(userList[i].getUsername().equals(user) &&
                    userList[i].getPassword().equals(pass)){
                answer = true;
            }
        }
        return answer;
    }
    
    public String toString(){
        // returns string in same format as data file
        return firstName + " " + lastName + " " + accBalance + " "
               + username + " " + password + " " + isAdmin;
    }
    
    public int[] intArr() {
        int[] intArr = new int[3];
        for (int i = 0; i < 3; i++) {
            intArr[i] = i;
        }
        return intArr;
    }
   
    
//    public static void main(String args[]) {
//        System.out.println("User works!");
//        System.out.println();
//        User user = new User();
//        System.out.println();
//        // successfully prints list of users
//        
//        user.setFirstName(3, "Cody");
//        user.setLastName(3, "Roberts");
//        user.setUsername(3, "changedMyUsername");
//        user.setPassword(3, "changedPassword");
//        
//        
//        
//        
//        
//        
//        if(user.login("smiller", "miller")){
//            System.out.println("Logged In");
//            System.out.println("isAdmin: " + user.getUserByUsername("smiller").getAdmin());
//        }
//        else{
//            System.out.println("Failed to log in");
//        }
//        
//     
//        
//        
//        
//    }
    
}