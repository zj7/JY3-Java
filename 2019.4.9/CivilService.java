package java0409;

public class CivilService {

	//结婚规则
	public boolean marryRules(Person p1,Person p2)
	{
		if(p1.pSex != p2.pSex)
		{
			if(p1.pAge>=22 && p2.pAge>=20 && p1.pSex == '男' || p1.pAge>=20 && p2.pAge>=22 && p1.pSex == '女')
			{
				if(!p1.isMarry && !p2.isMarry)
				{
					p1.isMarry = true;
					p2.isMarry = true;
					p1.anotherPerson.pName = p2.pName;
					p2.anotherPerson.pName = p1.pName;
					
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
}
