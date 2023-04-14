package com.iteratorpattern;

public class IterateName implements Container{

	public String[] names= {"sonali","drashti","khyati","gracy","vanshy"};
	@Override
	public Iterator getIterator() {
		
		return new Name();
	}
	
	private class Name implements Iterator{
  
		int i=0;
		
		@Override
		public boolean hasNext() {
			if(i<names.length) {
			return true;
		}
		  return false;
		}	

		@Override
		public Object next() {
			if(this.hasNext())
			{
				return names[i++];
			}
			return null;
		}
		
	}

	
}
