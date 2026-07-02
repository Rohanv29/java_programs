package OOPS;
class Account{
    public String name; 
    protected String email;
    private String password;

    //getters and setters
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
}
public class OOPS_04 {
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="Rohan Verma";
        account1.email="rohanverma@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
