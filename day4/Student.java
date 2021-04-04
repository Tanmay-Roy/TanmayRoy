package day4;
/*  student business logic and student as an entity */
public class Student {
	// add property of student
	private int studentId;
	private String studentName;
	private int studentClass;
	private String schoolName;
	private int englishMarks;
	private int projectMarks;
	private int mathsmarks;
	private int vivaMarks;
	private double percentageMarks=0.0;
	private double fees=1000.0;
	
		// add getters and setters
		
	
	
	
	
		
		
		public int getStudentId() {
			return studentId;
		}

		public Student(int studentId, String studentName, int studentClass, String schoolName, int englishMarks,
				int projectMarks, int mathsmarks, int vivaMarks) 
		{
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentClass = studentClass;
			this.schoolName = schoolName;
			this.englishMarks = englishMarks;
			this.projectMarks = projectMarks;
			this.mathsmarks = mathsmarks;
			this.vivaMarks = vivaMarks;
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

		public int getStudentClass() {
			return studentClass;
		}

		public void setStudentClass(int studentClass) {
			this.studentClass = studentClass;
		}

		public String getSchoolName() {
			return schoolName;
		}

		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}

		public int getEnglishMarks() {
			return englishMarks;
		}

		public void setEnglishMarks(int englishMarks) {
			this.englishMarks = englishMarks;
		}

		public int getProjectMarks() {
			return projectMarks;
		}

		public void setProjectMarks(int projectMarks) {
			this.projectMarks = projectMarks;
		}

		public int getMathsmarks() {
			return mathsmarks;
		}

		public void setMathsmarks(int mathsmarks) {
			this.mathsmarks = mathsmarks;
		}

		public int getVivaMarks() {
			return vivaMarks;
		}

		public void setVivaMarks(int vivaMarks) {
			this.vivaMarks = vivaMarks;
		}
		
		public int calculateMarks()
		{
			//double percentageMarks=0;
			percentageMarks=(double)((englishMarks+projectMarks+mathsmarks+vivaMarks)/4);
			System.out.println("percentage marks obtained: "+percentageMarks);
			calculateFees();
			// ......
			return 0;
		}

		/*  trigger
		 *  if student marks is less than 50 
		 *  ---->> fees += 50%
		 * */
		public void calculateFees()
		{
			if (percentageMarks<50)
			{
				fees+=(0.5*fees);
				System.out.println("Fees payable for course repeatation due to marks less than 50%: "+fees);
			}
			else
			{
				System.out.println("Fees payable for next couse: "+fees);
			}
		}

}
