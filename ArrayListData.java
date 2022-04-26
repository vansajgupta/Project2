package com.phase2.project.FlyAway;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListData<CVSParser, CVSReader> {
	List<FlightDetails> list=new ArrayList<FlightDetails>();
	public <FlightDetails> Object getArray(){
		CVSParser cvsParser= new CSVParserBuilder() .withSeparator('|').build();
		File dir= new File("D:\FlyAway");
		File[] file = dir.listFlies();
		
		File[] file;
		for(File f: file) {
			try {
			CVSReader cvsReader= new CVSReaderBuilder(new FileReader(f.getAbsolutePath())).withCSVParser(csvParser).withSkipLines(1).build();
			
			String record[]= null;
			while((record=cvsReader.readnext()) !=null){
				FlightDetails fm =new FlightDetails (record[0],record[1],record[2],record[3],record[4],Double.parseDouble(record[5]),Double.parseDouble(record[6]),record[7],record[8]);
				list.add((com.phase2.project.FlyAway.FlightDetails) fm);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		}
		return list;
	}

}
