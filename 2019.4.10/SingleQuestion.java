package java0410;

public class SingleQuestion extends Question{
	
	//��׼��
	String answer;
	
	public SingleQuestion()
	{
		
	}
	
	//������һ����
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
	
	//����
	public static void main(String[] args) {
		String[] options = new String[]{"һ","��","��","��"};
		SingleQuestion sq = new SingleQuestion(1,"һ��һ����",options,"��");
		
		String[] answers = new String[]{"2"};
		//��ӡ��Ŀ
		sq.printQuestion();
		//����
		System.out.println(sq.checkAnswer(answers) == true ? "����":"����");
		
		
	}

}
