package entities;



public class Register extends Validate {
    private String firstArgument, secondArgument, userEmail;
    
    public void genEmail(String firstArgument, String secondArgument){
        this.firstArgument = StringTreater.stringRegulator(firstArgument);
        this.secondArgument = StringTreater.stringRegulator(secondArgument);
        userEmail = this.firstArgument + "." + this.secondArgument + "@consoto.com";
        emailInCache(this.userEmail);
        
   }
    public void registrateEmail(String email){
    	this.userEmail = email;
    	emailInCache(this.userEmail);
    }
    
    public String getName() {
        return firstArgument;
    }
    
    public String getSecondName() {
    	return secondArgument;
    }
    
    public String getEmail() {
        return userEmail;
    }
}
