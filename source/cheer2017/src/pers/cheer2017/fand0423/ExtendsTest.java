package pers.cheer2017.fand0423;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ExtendsTest {
	public static void main(String args[]) throws Exception{

		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Person p=new Person();
		p.setId("fandi");
		p.setName("∑Æµœ");
		p.setBirthday(df.parse("1991-01-11"));
		System.out.println(p);
		
		Teacher t=new Teacher();
		t.setId("zhaofeng");
		t.setName("’‘∑Â");
		t.setBirthday(df.parse("1981-10-01"));
		System.out.println(t);
    }
}
class Person{
	private String id;
	private String name;
	private Date birthday;

	public Person(){
		System.out.println("new Person called");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String toString(){
	
		StringBuilder sb=new StringBuilder(1024);
		sb.append("Person[id=").append(id).
		append("],Person[name=").append(name).
		append("],Person[birthday=").append(birthday).
		append("]");
		return sb.toString();
	}
	
	
}
class Teacher extends Person{
	private int workYears;
	
	
	public int getWorkYears() {
		return workYears;
	}
	public void setWorkYears(int workYears) {
		this.workYears = workYears;
	}
	public Teacher(){
		System.out.println("new Teacher called");
	}
		public String toString(){
			StringBuilder sb=new StringBuilder(1024);
			sb.append("Teacher[id=").append(getId()).
			append("],Teacher[name=").append(getName()).
			append("],Teacher[birthday=]").append(getBirthday()).
			append("]");
			return sb.toString();
		}
	}
