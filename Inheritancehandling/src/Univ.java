public class Univ extends Colg {  
	//CHILD CLASS calling Parent class COLG (INHERITANCE)
String w= "dean";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println(a);
		 Univ d= new Univ();
		 System.out.println(d.w);
		 d.art();
		 eng1();
		d.build();
		techpark();
		}
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("nice");
	}

	public static void techpark() {
		// TODO Auto-generated method stub
		System.out.println("beauty");
		
	}


}
