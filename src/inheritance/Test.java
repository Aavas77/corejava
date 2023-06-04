package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		p.id = 777;
		p.name = "Aavas";
		p.company = "Google";
		p.salary = 2300000;
		p.progLang = "Java";
		p.project = "Alpha";
		p.bonus = 770000;
		
		p.print();
		
	}

}
