public class Point{
	private double x ;
	private double y ;
	
	public Point (){
		System.out.println("enter your inpu properly");
	}
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public double getx(){
		return this.x;
	}
	public double gety(){
		return this.y;
	}
	public void setx(int x){
		this.x=x;
	}
	public void sety(int y){
		this.y=y;	
	}
	
	public void findDistance(double  x2,double y2){
		double dist = Math.sqrt((this.getx()-x2)*(this.gety()-y2)+(this.gety()-y2)*(this.gety()-y2));
		System.out.println(dist);
	}
		
	
	
	
} 
