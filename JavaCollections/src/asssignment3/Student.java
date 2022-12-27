package asssignment3;

public class Student implements Comparable<Student>{

	private int studentId;
	private String studentName;
	private int studentScore;
	
	
	public Student(int studentId, String studentName, int studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getStudentScore() {
		return studentScore;
	}


	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}


	@Override
	public int compareTo(Student o) {
		if(studentId==o.getStudentId())
			return 0;
		else if(studentId>o.getStudentId())
			return 1;
		else
			return -1;
		
	}

}
