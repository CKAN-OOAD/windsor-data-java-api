/** FileManager 
    A file manager controls the loading (really displaying) of the parameters
   and decides whther to instantiate a GraphicViewer or a ConsoleViewer 

    @author Dr. Ziad Kobti
    (C)2018 All Rights Reserved to the author. 
    This code is strictly for education use. May not be reproduced without
    express written permission of the author.
*/
package eu.trentorise.opendata.jackan;
class FileManager implements RecordTemplate
{
	public RecordViewer rv;

	public FileManager(String mode)	// graphic or console
	{
		System.out.println("FileManager initiated....");

		System.out.println("FILE_NAME = " + FILE_NAME);
		System.out.println("NUMBER_OF_FIELDS " + NUMBER_OF_FIELDS);
		for (int i=0; i < NUMBER_OF_FIELDS; i++)
			System.out.println("FIELD: " + i + " " + FIELD_TYPES[i] + " " + FIELD_LABELS[i]);
		System.out.println("PRIMARY_KEY_FIELD_INDEX = " + FIELD_LABELS[PRIMARY_KEY_FIELD_INDEX]);

		if (mode.compareToIgnoreCase("graphics")==0)
		{
			System.out.println("Entering graphics mode...\n\n");
			rv = new GraphicViewer();
			rv.displayViewer();
		}
		else
		{
			// console by default
			System.out.println("Entering console mode...\n\n");
			rv = new ConsoleViewer();
			rv.displayViewer();
		}	
	}
}
