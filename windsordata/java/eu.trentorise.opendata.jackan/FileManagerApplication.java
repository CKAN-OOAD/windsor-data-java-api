/** FileManagerApplication is a wrapper class.
	it handles the user command line arguments from the terminal shell

    @author Dr. Ziad Kobti
    (C)2018 All Rights Reserved to the author. 
    This code is strictly for education use. May not be reproduced without
    express written permission of the author.
*/
package eu.trentorise.opendata.jackan;
class FileManagerApplication
{
	public static void main(String args[])
	{

		FileManager fm;
		boolean err = true;

		System.out.println(args.length);

		if (args.length==1)
		{
			if (args[0].compareToIgnoreCase("graphics")==0)
			{
				fm = new FileManager("graphics");
				err=false;
			}
			else if (args[0].compareToIgnoreCase("console")==0)
			{
				fm = new FileManager("console");
				err=false;
			}
		}
		if (err==true)
			System.out.println("***FileManagerApplication\nUSAGE:\njava FileManagerApplication graphics | console\nParameters: \ngraphics: enable graphic interface mode\nconsole: enable text mode\n\n");
	}
}
