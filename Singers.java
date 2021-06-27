package exercise1;

public class Singers
{
	private int	singerId;   //five instance variables
	private String singerName;
    private String singerAddress;
    private String dateOfBirth;
	private int albumsPublished;
	
	//Five constructors with different numbers of arguments
	public Singers ()
	{
		
		
	}
	
	public Singers (int singerId)
	{
		this.singerId= singerId;
		
		
	}
	public Singers (int singerId, String singerName)
	{
		this.singerId= singerId;
		this.singerName= singerName;
	}
	public Singers (int singerId, String singerName, String singerAddress)
	{
		this.singerId= singerId;
		this.singerName= singerName;
		this.singerAddress= singerAddress;
	}
	public Singers (int singerId, String singerName, String singerAddress, String dateOfBirth)
	{
		this.singerId= singerId;
		this.singerName= singerName;
		this.singerAddress= singerAddress;
		this.dateOfBirth= dateOfBirth ;
	}
	public Singers (int singerId, String singerName, String singerAddress, String dateOfBirth, int albumsPublished)
	{
		this.singerId= singerId;
		this.singerName= singerName;
		this.singerAddress= singerAddress;
		this.dateOfBirth= dateOfBirth ;
		this.albumsPublished= albumsPublished ;
	}
	
	//getter for singer id
	public int getSingerId() 
	{
		return singerId;
	}
	
	//setter for singer id
	public void setSingerId(int singerId)
	{
		this.singerId = singerId;
	}
	
	//getter for singer name
	public String getSingerName()
	{
		return singerName;
	}
	
	//setter for singer name
	public void setSingerName(String singerName)
	{
		this.singerName = singerName;
	}
	
	//getter for singer address
	public String getSingerAddress() 
	{
		return singerAddress;
	}
	
	//setter for singer address
	public void setSingerAddress(String singerAddress) 
	{
		this.singerAddress = singerAddress;
	}
	
	//getter for singer's date of birth
	public String getDateOfBirth() 
	{
		return dateOfBirth;
	}
	
	//setter for singer's date of birth
	public void setDateOfBirth(String dateOfBirth) 
	{
		this.dateOfBirth = dateOfBirth;
	}
	
	//getter for singer's number of album published
	public int getAlbumsPublished()
	{
		return albumsPublished;
	}
	
	//setter for singer's number of album published
	public void setAlbumsPublished(int albumsPublished)
	{
		this.albumsPublished = albumsPublished;
	}
	//setter to set all the records
	public void setAll(int singerId, String singerName, String singerAddress, String dateOfBirth, int albumsPublished)
	{
		this.singerId = singerId;
		this.singerName = singerName;
		this.singerAddress = singerAddress;
		this.dateOfBirth = dateOfBirth;
		this.albumsPublished = albumsPublished;
	}
	
	public String toString()
	{
		return "Singer Id:\n" +singerId+ "\nSinger Name:\n" +singerName+ "\nSinger Address:\n" +singerAddress+
				
				"\nDate of birth:\n"+dateOfBirth+ "\nAlbum Published:\n"+albumsPublished;
	}
	

}//end of class
