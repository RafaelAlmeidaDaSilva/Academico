using System;
using System.Collections.Generic;
					
public class Program
{
	public static void Main()
	{
		
	}
}

public class Answer {}

public class AnswerTrueFalse : Answer
{
	public bool ans {get;set;}
}

public class AnswerAlternative: Answer
{
	public char ans {get;set;}
}

public class Question
{ 
	public string ask {get;set;}
	public Answer ansSolution {get;set;}
	public Answer ansResponse {get;set;}
	public bool right{ get;set;}
	
	public void   correct()
	{
		// verificar o tipo de resposta essa question possui
		 Answer s = new AnswerAlternative();
		 Answer a = new AnswerTrueFalse();
		Type tTrueFalse = a.GetType();
		Type tAlternative = s.GetType();
		
    
		 
		Type t = ansSolution.GetType();
    
		if(t.Equals(s.GetType())) // type alternative
		{
				// verificar se os dois objetos são o mesmo tipo de resposta 
				// comparar adequadamente para cada tipo de objeto
				if (((AnswerAlternative)ansSolution).ans.Equals(((AnswerAlternative)ansResponse).ans))
					this.right = true;
				
					
		}
		if(t.Equals(a.GetType())) // type true or false
		{
				// verificar se os dois objetos são o mesmo tipo de resposta 
				// comparar adequadamente para cada tipo de objeto 
				if (((AnswerTrueFalse)ansSolution).ans.Equals(((AnswerTrueFalse)ansResponse).ans))
					this.right = true;
		}
		
	
	
	}
	

}


public class Quiz 
{
	public List<Question> questions {get;set;}
	
	public void correctQuestions(){
		//this.questions.ForEach(q => q.correct);
		foreach(Question q in questions)
			q.correct();
		
	}
	
}
