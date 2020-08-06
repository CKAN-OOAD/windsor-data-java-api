/** RecordTemplate is an interface intended to maintain a global list of
    constants (final) accessible throughout the program. Naturally, nearly
    every class that needs the details of the file or fields would need to 
    implement it. This is a way around "global variables" done C/C++
    @author Dr. Ziad Kobti
    (C)2018 All Rights Reserved to the author. 
    This code is strictly for education use. May not be reproduced without
    express written permission of the author.
*/
package eu.trentorise.opendata.jackan;
interface RecordTemplate 
{

// Lab 9 data set
// How to use this? Simply remove the comment block of code that you want
/* to use - and comment the other.

	public static final int NUMBER_OF_FIELDS = 3;
	public static final String[] FIELD_LABELS = {"First Name", "Last Name", "Date of Birth"};
	public static final String[] FIELD_TYPES = {"String", "String", "Date"};
	public static final String FILE_NAME = "file1.txt";
	public static final String DELIMITER = ",";
	public static final int PRIMARY_KEY_FIELD_INDEX = 1; // last name


*/// This is another data set from the City of Windsor open data repository
// FID,ADDRESS,CENTRE,X,Y
// SOURCE: https://opendata.citywindsor.ca/opendata/details/195

// How to use: comment out for this, and comment the above block of code.
// only one version of this code may be uncommented.

//   <-- block comments to disable, remove to enable

	public static final int NUMBER_OF_FIELDS = 5;
	public static final String[] FIELD_LABELS = {"FID", "Address", "Centre","X","Y"};
	public static final String[] FIELD_TYPES = {"Integer", "String", "String", "Long", "Long"};
	public static final String FILE_NAME = "file2.txt";
	public static final String DELIMITER = ",";
	public static final int PRIMARY_KEY_FIELD_INDEX = 2; // Centre

//

}

