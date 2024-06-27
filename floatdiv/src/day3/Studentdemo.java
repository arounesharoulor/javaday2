package day3;

public class Studentdemo {

	public static void main(String[] args) {
	student S1= new student();
	student S2= new student();
	student S3= new student();
    S1.setId(07);
    S1.setCity("chennai");
    S1.setSname("arounesh");
    System.out.println(S1.toString());	
    S2.setId(77);
    S2.setCity("salem");
    S2.setSname("bala");
    System.out.println(S2.toString());	
    S3.setId(87);
    S3.setCity("puducherry");
    S3.setSname("arish");
    System.out.println(S3.toString());	
	}

}
