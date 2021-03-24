package aggregators;



import java.io.IOException;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor <T extends Aggregator>{  //mean any child of Aggregator or Aggregator itself can be utilize in this class
	
	T agg;
	String file;
	
	
	public AggregatorProcessor(T agg, String file) {
		this.agg = agg;
		this.file = file;
	}
	
	
	
	public double runAggregator(int columnIndex) throws IOException {
		StockFileReader fileReader = new StockFileReader(file);
	    List<String> lines = fileReader.readFileData();
	    
	    columnIndex--; //this is because arrays start from "0" so if we need the first column we'll send 1
	    for(String line: lines) {
	    	String[] numberStrings = line.split(",");
	    	Double value = Double.parseDouble(numberStrings[columnIndex]);
	    	agg.add(value);    //agg will find the add() method because "agg" varaiable class extends "Aggregator" abstract class
	    }
	    
	    double number = agg.calculate();  //polimorphism example . on the runtime it will run the @overridden method in MaxAggregator/MinAggregator 
	    return number;
	}
	
	
	
	
	
	
}
