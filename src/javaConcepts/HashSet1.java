package javaConcepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {
public static void main(String[] args) {
	Set<String> a = new HashSet<String>();
	a.add("java");
	a.add("hey");
	a.add("java");
//	
//	for(String temp:a){
//		System.out.println(temp);
//	}
	
	Iterator itr = a.iterator();
    while(itr.hasNext())	{
System.out.println(itr.next());
	}
}
}