package collections;

import java.util.ArrayList;

public class PrintingUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,4,5,2,3,3,3,5,7,4,5,4};
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!list.contains(a[i])) {
				list.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
						
					}
					
				}
				System.out.println(a[i]);
				System.out.println(k);
			}
		}
	}

}
