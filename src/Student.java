
public class Student {
	private String studentNo;
	private String studentName;
	private Integer age;
	private Boolean isBoy;
	public Student(String studentNo,String studentName,Integer age,Boolean isBoy) {
		this.studentNo=studentNo;
		this.studentName=studentName;
		this.age=age;
		this.isBoy=isBoy;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getIsBoy() {
		return isBoy;
	}
	public void setIsBoy(Boolean isBoy) {
		this.isBoy = isBoy;
	}
}
