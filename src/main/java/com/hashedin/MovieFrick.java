package com.hashedin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.io.IOUtils;

public class MovieFrick {
	public void mostWatched(List<Map> list,Map<String, Movie> movieMap){
		
		

			
			
			List<Object> list2 = new ArrayList<>();
			for (int i = 0; i <list.size(); i++) {
				
				
				list2.add((list.get(i).get("itemid")));
			}
			//System.out.println(list1);
			
			Hashtable<Object,Integer> frequencyHash2 = new Hashtable();
			

		
			ArrayList uniqueList2 = new ArrayList();

			
			for( int i = 0; i < list2.size(); i++)
			{
			if (uniqueList2.contains(list2.get(i)))
			{
			int elementCount2 =
			frequencyHash2.get(list2.get(i));
			

			elementCount2++;
			frequencyHash2.put(list2.get(i), elementCount2);
			}
			else
			{
			uniqueList2.add(list2.get(i));
			frequencyHash2.put(list2.get(i),1);
			}
			}
			
			Object maxKey1=null;
			Integer maxValue2 = Integer.MIN_VALUE; 
			for(Map.Entry<Object,Integer> entry : frequencyHash2.entrySet()) {
			     if(entry.getValue() > maxValue2) {
			         maxValue2 = entry.getValue();
			         maxKey1 = entry.getKey();
			     }
			}
  
			    System.out.println("Most Watched "+ movieMap.get(maxKey1).getTitle()); 
			
			//System.out.println(frequencyHash2);
			
		}
	public void mostActiveUser(List<Map> list){
		
		List<Object> list1 = new ArrayList<>();
		for (int i = 0; i <list.size(); i++) {
			
			
			list1.add((list.get(i).get("itemid")));
		}
		Hashtable<Object,Integer> frequencyHash = new Hashtable();
		Hashtable<Object,Integer> frequencyHash2 = new Hashtable();
		

		ArrayList uniqueList = new ArrayList();
		ArrayList uniqueList2 = new ArrayList();

		for( int i = 0; i < list1.size(); i++)
		{
		if (uniqueList.contains(list1.get(i)))
		{
		int elementCount =
		Integer.parseInt(frequencyHash.get(list1.get(i)).toString());
		

		elementCount++;
		frequencyHash.put(list1.get(i), elementCount);
		}
		else
		{
		uniqueList.add(list1.get(i));
		frequencyHash.put(list1.get(i),1);
		}
		}
		
		Object maxKey=null;
		Integer maxValue = Integer.MIN_VALUE; 
		for(Map.Entry<Object,Integer> entry : frequencyHash.entrySet()) {
		     if(entry.getValue() > maxValue) {
		         maxValue = entry.getValue();
		         maxKey = entry.getKey();
		     }
		}
		System.out.println("Most Axtive User Id "+maxKey); 
		
}
	
	public void topMovieByGerne(ArrayList<Gerne> movieGerneMap , String s){
		
		for(int i=0;i<movieGerneMap.size();i++){
			
			
			System.out.println(movieGerneMap.get(i));
		}
			
		
		
	}




}