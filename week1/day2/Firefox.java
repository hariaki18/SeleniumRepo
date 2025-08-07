package week1.day2;

public class Firefox {
	
	
	float version =100.2f;
	String name="firefox";
	boolean isVisible=true;
	int releaseyear=1998;
	char logo='f';
    
	public void chrome() {
		System.out.println("version "+ version+" name "+ name+" isVisible "+" releaseyear "+releaseyear+"logo "+logo);
	}
	

	public static void main(String[] args) {
	
   Firefox obj1=new Firefox();
System.out.println(obj1.version);
System.out.println(obj1.releaseyear);
     obj1.chrome();
	}


	
	

}
