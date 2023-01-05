package com.masai;
//import java.lang.reflect.Array;
import java.util.*;
public class A {
	
	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
////	System.out.println("Enter the no.");
////	int x=sc.nextInt();
////	int[] arr=new int[x];
////		for(int i=0;i>x;i++) {
////			arr[i]=sc.nextInt();
////		}
////		hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
	int[] arr1= {6,2,6,2,1,9,8};
	int[] arr= {3,6,8,2,4};
//	
//	ArrayList<Integer> list=
			removeDup(arr,arr1);
//	System.out.println(list);
	}
	public static ArrayList<Integer> removeDup (int [] arr,int[] arr1){
		ArrayList<Integer> remove= new ArrayList<>();
		HashMap<Integer,Integer> hmap= new HashMap<>();
		
		for(int i=0;i<arr1.length;i++) {
			hmap.put(arr1[i],hmap.getOrDefault(arr1[i],0)+1);
		}
		for(Map.Entry<Integer, Integer> i: hmap.entrySet()) {
			return (i.getKey(),i.getValue());
		}
		
	}
	
		
		
		
	
		
//		ArrayList<Integer> remove= new ArrayList<>();
//		
//		Arrays.sort(arr);
//		Arrays.sort(arr1);
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr1));
//		
//		int up=arr.length;//
//		int dn=arr1.length;//6
//		int i= 0;
//		int j=0;
//		
//		System.out.println(up);
//		System.out.println(dn);

//			while(i<up && j<dn)
//			{	
//				if(arr[i]==arr1[j]) {
////					System.out.println(arr[i]+" ");
//					remove.add(arr[i]);
//					i++;
//					j++;
//				}
//				else if(arr[i]>arr1[j]) {
//					j++;
//
//				}else{
//					i++;
//
//				}
//			}
//			
//			return remove;
//		}
		
		
	
}