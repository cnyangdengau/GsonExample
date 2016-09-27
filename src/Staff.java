import java.math.BigDecimal;
import java.util.List;

public class Staff {
	private String name;
	private int age;
	private String position;
	private BigDecimal salary;
	private List<String> skills;
	public void setName(String string) {
		// TODO Auto-generated method stub
		this.name = string; 
		
	}
	public void setAge(int i) {
		// TODO Auto-generated method stub
		this.age = i;
	}
	public void setPosition(String string) {
		// TODO Auto-generated method stub
		this.position = string;
	}
	public void setSalary(BigDecimal bigDecimal) {
		// TODO Auto-generated method stub
		this.salary = bigDecimal;
	}
	public void setSkills(List<String> skills2) {
		// TODO Auto-generated method stub
		this.skills = skills2;
	}

}