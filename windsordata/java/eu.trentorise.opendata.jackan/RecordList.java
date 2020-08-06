/** RecordList maintains a list of Record(s)
	Records can be loaded from a file

    @author Dr. Ziad Kobti
    (C)2018 All Rights Reserved to the author. 
    This code is strictly for education use. May not be reproduced without
    express written permission of the author.
*/

package eu.trentorise.opendata.jackan;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Iterator;

class RecordList implements RecordTemplate
{

	// Could use hashmap as well here, however I opted to demonstrate how ArrayList can be used
	public ArrayList<Record> recordList;

	/** default constructor */
	public RecordList()
	{
		recordList = new ArrayList<>();

	}

	/** get a Record given its index from the list of records */
	public Record get(int n)
	{
		return recordList.get(n);
	}

	/** Load records from a file, defined filename in RecordTemplate */
	public int loadRecords()
	{
		try
		{
			String line = null;
			BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
			
			while ((line = br.readLine()) != null) 
			{	
				if (line.trim().length()==0) continue;	// skip empty line
			
				// So convenient to use the overloaded construcor of Record that takes a Line!
				recordList.add(new Record(line));				
  			}
			br.close();
		}
		catch(IOException ioe)
		{
			System.err.println(ioe);
		}
		
		return recordList.size();
	}

	/** New way without using the old Iterator method - only in Java 8 and above! */
	public void sort() // sort according to primary key defined in RecordTemplate
	{
   	// todo: make this support different data types such as dates, int etc.
	//	recordList.sort((Record r1, Record r2)->r1.getValue(PRIMARY_KEY_FIELD_INDEX).compareTo(r2.getValue(PRIMARY_KEY_FIELD_INDEX)));
      //recordList.forEach((r)->System.out.println(r));   
	}
	
	public int size()
	{
		return recordList.size();
	}	

	public String toString()
	{
		String s="";

		// recordList.forEach(Record -> s+=Record);	// new in Java8 has an issue with not final error

		for (Record r : recordList)	// for each Record r in recordList...
		    s+=r+"\n";				// append r (toString) and a new line to the output string

/* 	    Old iterator alternative way:

         (Iterator<String> keySetIterator = recordsMap.keySet().iterator(); 
		String key;
		while(keySetIterator.hasNext())
		{ 
			key = keySetIterator.next(); 
			s+=recordsMap.get(key)+"\n";
		}
*/
		return s;	// this string will contain all the lines (ie. all the records)
	}
	
}

