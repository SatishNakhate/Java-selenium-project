package stepdefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newdemo {

		@Given ("User on the dashbord page")
		 public void dashbord_page ()
		 {
			 System.out.println("Dashboard Page");
		 }
		 @When ("user provide the creaditational")
	    public void User_Crediationals ()
	    {
			 System.out.println("User data");
	    }
	    @Then ("User on the login page")
	    public void User_Login_Page()
	    {
	    	System.out.println("User Login page");
	    }
	    @And ("profile picture display")
	    public void profile_picture()
	    {
	    	System.out.println("Profile Picture");
	    }
}
