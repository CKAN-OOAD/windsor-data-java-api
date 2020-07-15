
package eu.trentorise.opendata.jackan;

import eu.trentorise.opendata.jackan.model.CkanDataset;
import eu.trentorise.opendata.jackan.model.CkanResource;

import java.util.List;

/**
 * GETTING FIRST 10 DATASETS, SHOWING RESOURCES
 * @author David Leoni 
 * @since 0.4.1
 */
public class TestApp2 {

    public static void main(String[] args) {
                   
        CkanClient cc = new CkanClient("http://dati.trentino.it");
       
        List<String> ds = cc.getDatasetList(10, 0);
        System.out.println(getDataSetResources(ds, cc));


    }

    public static String getDataSetResources(List<String> ds, CkanClient cc){
        String output = "";
        for (String s : ds) {
            output = String.format("\n");
            output += String.format("DATASET: %s\n", s);
            CkanDataset d = cc.getDataset(s);
            output+= String.format("  RESOURCES:\n");
            for (CkanResource r : d.getResources()) {
                output = String.format("    %s\n", r.getName());
                output = String.format("    FORMAT: %s\n", r.getFormat());
                String.format("       URL: %s\n",r.getUrl());
            }
        }
        return output;
    }

}
