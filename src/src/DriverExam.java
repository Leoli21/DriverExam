
public class DriverExam {
	private char[] correctAnswers;
	
	public  DriverExam(char[] c)
	{
		correctAnswers = c;
	}
	public boolean passed(char[] studentAnswers)
	{
		double passedPercent = 0;
		passedPercent = (double)totalCorrect(studentAnswers)/studentAnswers.length;
		if (passedPercent < 0.75)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public int totalCorrect(char[] studentAnswers)
	{
		int totalCorrect = 0;
		for(int i = 0; i < studentAnswers.length; i++)
		{
			if(studentAnswers[i] == correctAnswers[i])
			{
				totalCorrect += 1;
			}
		}
		return totalCorrect;
	}
	public int totalIncorrect(char[] studentAnswers)
	{
		int totalIncorrect = 0;
		for (int i = 0; i < studentAnswers.length; i++)
		{
			if (studentAnswers[i] != correctAnswers[i])
			{
				totalIncorrect +=1;
			}
		}
		return totalIncorrect;
	}
	public int[] questionsMissed(char[] studentAnswers)
	{
		int[] questionsMissed = new int[studentAnswers.length - 1];
		for(int i = 1; i < studentAnswers.length; i++)
		{
			if(studentAnswers[i] != correctAnswers[i])
			{
				questionsMissed[i] = 0;  
			}
			else
			{
				questionsMissed[i] = 1;
			}
		}
		return questionsMissed;
	}
	
}