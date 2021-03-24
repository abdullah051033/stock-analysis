package fileprocessors;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class StockFileData {
	
//	List<HashMap<String, Double>> data = new LinkedList<>();
//	
//	public void printData(){
//		System.out.println(data);
//	}
//	
//	public void addData(List<HashMap<String, Double>> dataIn){
//		data = dataIn;
//	}
	
	
	public void printData(List<HashMap<String, Double>> data) {
		int count = 0;
		
		for(HashMap<String, Double> mapdata : data) {
			System.out.println("line ---> " +count + " data ");
			System.out.println(mapdata);
			count++;
		}
	}
	
	
}




