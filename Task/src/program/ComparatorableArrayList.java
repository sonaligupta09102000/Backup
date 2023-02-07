package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
	
	 class Ratings
	{
		String MovieName;
		int ToTalSeat;
		int Rate;
		
		
		 Ratings(String movieName, int toTalSeat, int rate) {
			super();
			this.MovieName = movieName;
			this.ToTalSeat = toTalSeat;
			this.Rate = rate;
		}
		
		public String getMovieName() {
			return MovieName;
		}
		public void setMovieName(String movieName) {
			this.MovieName = movieName;
		}
		public int getToTalSeat() {
			return ToTalSeat;
		}
		public void setToTalSeat(int toTalSeat) {
			this.ToTalSeat = toTalSeat;
		}
		public int getRate() {
			return Rate;
		}
		public void setRate(int rate) {
			this.Rate = rate;
		}

		@Override
		public String toString() {
			return "Ratings [MovieName=" + MovieName + ", ToTalSeat=" + ToTalSeat + ", Rate=" + Rate + "]";
		}
		
	}	
	public class ComparatorableArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Ratings> list1= new ArrayList<Ratings>();
		list1.add(new Ratings("ABC",80,200));
		list1.add(new Ratings("BCD",45,500));
		list1.add(new Ratings("CDE",90,900));
		list1.add(new Ratings("EFG",100,600));
		list1.add(new Ratings("GHI",50,100));
		
		Comparator<Ratings>com=new Comparator<Ratings>()
		{
		    public int compare(Ratings r1,Ratings r2)
		    {
		    	if(r1.getRate()>r2.getRate())
		    		return 1;
		    	else
		    		return -1;	
		    }
		};
		
		System.out.println("The Total ArrayLists are: " +list1 );
		System.out.println("\n");
		
		Iterator<Ratings>it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println("The Values Of the ArrayList Are: " +it.next());
		}
		
		System.out.println("\n");
		
		Collections.sort(list1,com);
		
		for(Ratings r:list1)
		{
			System.out.println(r);
		}
			
	}
}
  

