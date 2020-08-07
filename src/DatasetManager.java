/** DatasetManager
 A dataset manager controls the loading (really displaying) of datasets
 and instantiates a DatasetViewer

 @author Jose Guillen Santos
 (C)2018 All Rights Reserved to the author.
 This code is strictly for education use. May not be reproduced without
 express written permission of the author.
 */
public class DatasetManager {
    public DatasetManager(){
        System.out.println("DatasetManager initiated....");
        DatasetViewer dv = new DatasetViewer();
        dv.displayViewer();
    }
}
