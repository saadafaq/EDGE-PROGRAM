package task1;

import java.util.List;

import task1.Sorting;

public class BubbleSort implements Sorting {

	@Override
	public void sort(List<Integer> list) {
		for(int i = 0 ; i < list.size() ; i++) {
			for(int j = i+1 ; j < list.size() ; j++ ) {
				if(list.get(i) > list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}		
	}
}
