
public class DriverExam {
	private char[] correctAnswers;
	
	public  DriverExam(char[] c)
	{
		correctAnswers = c;
	}
	public boolean passed(char[] studentAnswers)
	{
		double passedPercent = (double)totalCorrect(studentAnswers)/studentAnswers.length;
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
		int numCorrect = 0;
		for(int i = 0; i < studentAnswers.length; i++)
		{
			if(studentAnswers[i] == correctAnswers[i])
			{
				numCorrect += 1;
			}
		}
		return numCorrect;
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
		int size = totalIncorrect(studentAnswers);
		int[] questionsMissed = new int[size];
		int j = 0;
		for(int i = 0; i < studentAnswers.length; i++)
		{
			if(studentAnswers[i] != correctAnswers[i])
			{
				questionsMissed[j] = i+1;  
				j++;
			}
		}
		return questionsMissed;
	}
	
}