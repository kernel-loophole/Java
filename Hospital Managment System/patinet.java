import java.util.Scanner;

public class patinet {
 private  int pidof ;
 private int password;
 private  String name;
 private String email;


    public patinet(int pid, int password, String name, String email) {
        this.pidof = pid;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    public void setPid(int pid) {
        this.pidof = pid;
    }

    public int getPassword() {
        return this.password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public patinet pid(int pid) {
        setPid(pid);
        return this;
    }

    public patinet password(int password) {
        setPassword(password);
        return this;
    }

    public patinet name(String name) {
        setName(name);
        return this;
    }

    public patinet email(String email) {
        setEmail(email);
        return this;
    }
    public  void login(String user_name,String get_Password)
    {
     System.out.println("hello form login");   
    }
    public int choice()
    {
        System.out.println("====> press for sign up for login");
        System.out.println("=====> press 2 for new account");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
    
        int userName = myObj.nextInt();  // Read user input
       // System.out.println("Username is: " + userName);
     //   myObj.close();
     myObj.close();   
     return userName;
        
    }
    public static void get_prepations() {
        System.out.println("hello form get the avaible checks");
    }
};
 
