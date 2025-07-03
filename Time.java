public class Time {
	private int hour ;
	private int minute ;
	private int second ;
	
	public Time (int hour){
		this.hour=hour;
		minute=0;
		second=0;
		
	}
	public Time(int hour , int minute){
		this.hour=hour;
		this.minute=minute;
		second=0;
	}
	public Time(int hour , int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	public int getHour(){
		return this.hour;
	}
	public int getMinute(){
		return this.minute;
	}
	public int getSecond(){
		return this.second;
	}
	
	public void setHour(){
		this.hour=hour;
	}
	public void setMinute(){
		this.minute=minute;
	}
	public void setSecond(){
		this.second= second;
	}
	public String toString (){
		return "Your time is "+this.getHour()+"."+this.getMinute()+"."+getSecond();
	}
}