package java0409;

public class Person {

	
	public Person()
	{
		
	}
	
	public Person(String pNo,String pName,char pSex,int pAge,boolean isMarry,
			String pId,String pAddress,String pTel,Person anotherPerson)
	{
		this.pNo = pNo;
		this.pName = pName;
		this.pSex = pSex;
		this.pAge = pAge;
		this.isMarry = isMarry;
		this.pId = pId;
		this.pAddress = pAddress;
		this.pTel = pTel;
		this.anotherPerson = anotherPerson;
	}
	
	String pNo;
	String pName;
	char pSex;
	int pAge;
	boolean isMarry;
	String pId;
	String pAddress;
	String pTel;
	Person anotherPerson;
	
	//½á»é
	public boolean marry(Person aPerson)
	{
		CivilService civilService = new CivilService();
		boolean marryRules = civilService.marryRules(this, aPerson);
		return marryRules;
	}
}
