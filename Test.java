import java.util.Scanner;
public class Test {
	public static void main(String [] args){
		//Date a = new Date();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your point's x value :");
		double x = sc.nextDouble();
		System.out.println("Enter your point's y value :");
		double y = sc.nextDouble();
		
		
		Point p1 = new Point(10,10);
		Point p2 = new Point(5,5);
		
		p1.findDistance(p2.getx(),p2.gety());
		//p1.findDistance(2,2);
		//double dis = (p2.getx()-p1.getx())*((p2.getx()-p1.getx()))+(p2.gety()-p1.gety())*((p2.gety()-p1.gety()));
		//double dis=dis2 ;
		
		//System.out.println("The Distance is :"+Math.sqrt(dis));
		
		/*
		System.out.println("Year: ");
		int year = sc.nextInt();
		System.out.println("Month: ");
		int month = sc.nextInt();
		System.out.println("Date: ");
		int date = sc.nextInt();
		
		
		Date day = new Date(year,month,date);
		day.findTomorrow ();
		
		Date case1 = new Date (2021,5,31);
		System.out.println(case1.getyear());
		
		Date case2 = new Date (2022,12,31);
		Date case3 = new Date(2000,2,28);
		Date case4 = new Date(1900,2,29);
		case1.findTomorrow ();
		case2.findTomorrow ();
		case3.findTomorrow ();
		case4.findTomorrow ();
		*/
		

	}
}