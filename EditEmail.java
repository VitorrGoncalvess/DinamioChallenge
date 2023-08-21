package entities;

public class EditEmail extends Validate{
	private String firstArgument, secondArgument, userEmail;
	
	public void genEmail(String firstArgument, String secondArgument){
        this.firstArgument = StringTreater.stringRegulator(firstArgument);
        this.secondArgument = StringTreater.stringRegulator(secondArgument);
        userEmail = this.secondArgument + "." + this.firstArgument + "@consoto.com";
      
 }
	public void genEmail(String firstArgument, String secondArgument, int num){
        this.firstArgument = StringTreater.stringRegulator(firstArgument);
        this.secondArgument = StringTreater.stringRegulator(secondArgument);
        userEmail = firstArgument + "." + secondArgument +num+ "@consoto.com";
        emailInCache(this.userEmail);
 }
	public String getNewEmail() {
		return userEmail;
	}
}