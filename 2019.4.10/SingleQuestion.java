package java0410;

public class SingleQuestion extends Question{
	
	//标准答案
	String answer;
	
	public SingleQuestion()
	{
		
	}
	
	//构建了一个题
	public SingleQuestion(int id,String text,String[] ops,String answer)
	{
		this.id = id;
		this.text = text;
		this.options = ops;
		this.answer = answer;
	}
	
	public boolean checkAnswer(String[] answers)
	{
		if(answers == null || answers.length != 1)
		{
			return false;
		}else
		{
			return this.answer.equals(answers[0]);
			
//			if(answer == answers[0])
//			{
//				return true;
//			}else 
//			{
//				return false;
//			}
		}
		
	}
	
	//测试
	public static void main(String[] args) {
		String[] options = new String[]{"一","二","三","四"};
		SingleQuestion sq = new SingleQuestion(1,"一加一等于",options,"二");
		
		String[] answers = new String[]{"2"};
		//打印题目
		sq.printQuestion();
		//检查答案
		System.out.println(sq.checkAnswer(answers) == true ? "对了":"错了");
		
		
	}

}
