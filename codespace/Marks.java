class Ex1 {
	private String name;
	private int marks;
	
	public String getName(){
		return name;
	}
	public int getMarks(){
		return marks;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setMarks(int marks){
		if(marks >= 0 && marks <= 100){
			this.marks = marks;
		}
		else{
			System.out.println("Invalid marks");
		}
	}
}
public class Marks{
	public static void main(String args[]){
		Ex1 obj = new Ex1();
		obj.setName("Hasini");
		obj.setMarks(95);
		System.out.println(obj.getName());
		System.out.println(obj.getMarks());
	}
}