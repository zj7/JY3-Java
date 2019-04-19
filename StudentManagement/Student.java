package java0413;

public class Student {
	
	//无参构造器
	public Student() {
		
	}
	
	public Student(int id,String name,char stuSex,Short stuAge,String stuGrade,String address,String tel,String email)
	{
		this.id = id;
		this.stuName = name;
		this.stuSex = stuSex;
		this.stuAge = stuAge;
		this.stuGrade = stuGrade;
		this.stuAddress = address;
		this.stuTel = tel;
		this.stuEmail =email;
	}
	
	//toString的重写
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuAge=" + stuAge
				+ ", stuGrade=" + stuGrade + ", stuAddress=" + stuAddress + ", stuTel=" + stuTel + ", stuEmail="
				+ stuEmail + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public char getStuSex() {
		return stuSex;
	}

	public void setStuSex(char stuSex) {
		this.stuSex = stuSex;
	}

	public Short getStuAge() {
		return stuAge;
	}

	public void setStuAge(Short stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuGrade() {
		return stuGrade;
	}

	public void setStuGrade(String stuGrade) {
		this.stuGrade = stuGrade;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public String getStuTel() {
		return stuTel;
	}

	public void setStuTel(String stuTel) {
		this.stuTel = stuTel;
	}

	public String getStuEmail() {
		return stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	int id;
	
	String stuName;
	
	char stuSex;
	
	Short stuAge;
	
	String stuGrade;
	
	String stuAddress;
	
	String stuTel;
	
	String stuEmail;
}
