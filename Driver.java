package exercise1;

public class Driver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// printing default values
		Singers singer1=new Singers();
		System.out.println("The default singer's record is:\n"+singer1 );
		
		//setting and printing singer's id using setter and getter
		System.out.println("Singer's record:");
		singer1.setSingerId(1);
		System.out.println("The singer's id:\n"+singer1.getSingerId() );	
		
		//setting and printing singer's name using setter and getter
		singer1.setSingerName("Justin beiber");
		System.out.println("The singer's name:\n"+singer1.getSingerName() );
		
		//setting and printing singer's address using setter and getter
		singer1.setSingerAddress("11 xyz street");
		System.out.println("The singer's Address:\n"+singer1.getSingerAddress() );
		
		//setting and printing singer's DOB using setter and getter
		singer1.setDateOfBirth("March 1, 1994");
		System.out.println("The singer's date of birth is:\n"+singer1.getDateOfBirth() );
		
		//setting and printing number of album published using setter and getter
		singer1.setAlbumsPublished(11);
		System.out.println("The singer's published albums:\n"+singer1.getAlbumsPublished() );
		
		//setting and printing the values of all instance variables using one setter
		singer1.setAll(2, "Diljeet Dosanjh", "Punjab, India","January 6, 1984" , 21);
		System.out.println("Singer's record:\n"+singer1);
		
	}//end of driver class

}