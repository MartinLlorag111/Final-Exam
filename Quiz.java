
public abstract class Quiz { 
	protected String studentName; 
	protected double grade; 
	public int totalScore; 
	public int maxScore; 

	public Quiz(String name, double grade) { 
		this.studentName = name; 
		this.grade = 0; 
	} 

	public Quiz(int totalScore, int maxScore) { 
		this.totalScore = 80; 
		this.maxScore= 40; 
	} 

	public double getGrade () { 
		return grade; 
	} 

	public void setTotalScore(int Tscore) { 
		grade = Tscore; 
	} 

	public String getStudentName () { 
		return studentName; 
	} 

	public void setStudentName (String name) { 
		studentName = name; 
	} 

	public abstract double calculateGrade(); 

}
