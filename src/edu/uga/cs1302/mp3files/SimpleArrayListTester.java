package edu.uga.cs1302.mp3files;

import java.util.ListIterator;

public class SimpleArrayListTester {

	public static void main(String[] args) {
		SimpleArrayList<String> sList = new SimpleArrayList<String>();
		
		sList.add("hello");
		sList.add("world");
		 ListIterator<String> iter = sList.listIterator( 0 );
	       System.out.print( "List: {" );
	       while( iter.hasNext() )
		   System.out.print( " " + iter.next() );
	       System.out.println( " }" );
		
		

	}

}
