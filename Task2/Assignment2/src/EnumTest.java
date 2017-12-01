


public class EnumTest {
    
    public static void main (String[] args) 
    {
    	System.out.println("hi");
    	tellItLikeItIs() day2= new tellItLikeItIs();
    	day2.tellItLikeItIs().MONDAY;
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}

	 enum Day {
		MONDAY, WEDNESDAY, FRIDAY, SATURDAY, SUNDAY;
	  private Day day2;
        public void EnumTest(Day day1) 
    {
        this.day2 = day1;
        System.out.println(day1);
    }
    public void tellItLikeItIs() 
    {
        switch (MONDAY) 
        {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
   
    