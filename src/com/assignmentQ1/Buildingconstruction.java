package com.assignmentQ1;



import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


//Class of Building Costruction

    public class Buildingconstruction {   
	
	
	//Driver code
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the total no. of floor in the building" );
		int floor = sc.nextInt();
		
		//PriorityQueue
		//Collections.reverseOrder()
		
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		int floorSize[] = new int [floor+1];
		
		
		for (int i=1; i<=floor; i++)
		{
		System.out.println("Enter the floor size given on day:"+i);
		floorSize[i]=sc.nextInt();
		
		}
		
		buildSkyScraper(floor,floorSize);
		
	}
	
	
     //Function to arrange the order of Contruction
	
	
	    private static void buildSkyScraper(int floor, int[] floorSize) {
	        	 
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		
		int max = floor ;
	
		
		for (int i=1; i<=floor; i++) {
			
			
			pq.add(floorSize[i]);
			
			System.out.print("\nDay:"  + i  + "\n");
			
			while (pq.peek()!=null && pq.peek()==max) {
				
			System.out.print(pq.poll()+   "  ");
			
			max--;
			
			}
		}
		
		
	}
}
	

			
			
	
	
		
	
