public class Date 
{


   private int month, day,year;

   public Date (int m, int d, int y)
   {
      month = m;
      day =  d;
      year = y;
   }
   
   public int  getmonth()
   {
      return month;
   }
   
   public int getday()
   {
      return day;
   }
   
   public int getyear()
   {
      return year;
   }
    
   public String toString()
   {
      return month + "/" + day + "/" + year;
     
   }
     
   public int subtract(Date other)
   { 
      int total = 0;
      int m1 = month;
      int d1 = day;
      int y1 = year;
      int m2 = other.month;
      int d2 = other.day;
      int y2 = other.year;
      
        
        
      if  ((y1==y2&& m1==m2))
         total = d2 - d1 + 1;
      
      else if (y1==y2)
      {
         total = daysInMonth(m1,y1)-d1+1;
        
         for( int i = m1+1; i<m2; ++i)
            total+= daysInMonth(i,y1);
        
         total += other.day;
      }
      else 
      {
      total = daysInMonth(m1,y1)-d1+1;
      for (int i = m1+1; i <= 12; ++i)
         total+= daysInMonth(i,y1);
      for (int j = y1 + 1; j < y2; ++j)
         total+= daysInYear(j);
      for (int i =1; i <m2; ++i)
         total+= daysInMonth(i,y2);
      total += d2;
      }
      return total;
   }
    
   public boolean isleap( int yr)
   {
      if ( yr % 400 == 0)
         return true;
             
      else if( yr % 4 == 0 && yr % 100!=0)
         return true;
                 
      else 
         return false;
   }
         
   int daysInMonth(int m,int y)
   {
      switch (m)
      { 
         case 1: case 3: case 5: case 7:
           
           case 8:
           
           case 10:
           
           case 12:
           
           
          
            return 31;
          
          
          
         case 4: 
          
          case 6: 
          
          case 9:
          
          case 11: 
          
            return 30;
          
          
         case 2:
          
            if(isleap(y))
            
               return 29;
            
            else 
               return 28;
          
         default:
         return -99999;
      }
   }
         
   public int daysInYear(int year)
   {
      if(isleap(year))
         return 366;
      else
         return 365;
   }
}
      

         
           
        
       
      

