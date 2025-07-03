public class Date {
	private int year ;
	private int month;
	private int day;
	
	public Date(int year){
		this.year=year;
		month=0;
		day=0;
		
	}
	public Date(int year , int month){
		this.year=year;
		this.month=month;
		day=0;
	}
	public Date(int year , int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}
	
	public void setYear(){
		this.year=year;
	}
	public void setMonth(){
		this.month=month;
	}
	public void setDay(){
		this.day=day;
	}
	public void setDate(int year,int month, int day){
				this.year=year;
				this.month=month;
				this.day=day;

	}
	
	public String toString (){
		return "your given date is "+this.day+"."+this.month+"."+this.year;
	}
	
	public void findTomorrow (){
		
		int tempDay = this.getDay();
		int tempMonth = this.getMonth();
		int tempYear = this.getYear();
		
		
		// this is more proffessional 
	
		
		switch (tempMonth){
			case 1 : case 3: case 5: case 7: case 8: case 10: case 12: 
				if (tempDay==31){
						tempDay=1;
						tempMonth=(tempMonth+1)%12;
						if (tempMonth==1){
							tempYear=tempYear+1;
						}
						
					
					
					//tempMonth=this.getMonth()+date/31;
				}
				else{
					tempDay = tempDay+1;

				}
				break;
			
			case 4: case 6:case 9: case 11:
				if (tempDay==30){
					tempDay=1;
						tempMonth=(tempMonth+1)%12;
						
					
				}
				else{
							tempDay = tempDay+1;
				}
				break;
			case 2:
				if ((tempYear%4==0&&tempYear%100!=0)||(year % 400 == 0))
				{
					if (tempDay==28){
						tempDay = tempDay+1;
						//tempMonth=(tempMonth+1)%12;
					}
					
				}
				else if (tempDay==28){
						tempDay=1;
						tempMonth=(tempMonth+1)%12;
						
					//tempMonth=this.getMonth()+date/28;
			}
				
				break;
			
		
		}	
		System.out.println("Tomorow is "+tempDay+"/"+tempMonth+"/"+tempYear);
		
		
}}
	

