package java0409;

public class Student {
	
	public Student()
	{
		
	}
	
	public Student(String sName,int sNum,int sScore)
	{
		this.sName = sName;
		this.sNum = sNum;
		this.sScore = sScore;
	}
	
	String sName;
	int sNum;
	int sScore;
	
	//÷ÿ–¥toString
	@Override
	public String toString() {
		return sName+","+sNum+","+sScore;
	}

}
