
package eu.trentorise.opendata.jackan;

import eu.trentorise.opendata.jackan.model.CkanDataset;

import java.util.List;

/**
 * Show searching datasets 
 * @since 0.4.1
 */
public class TestApp3 {

    public static void main(String[] args) {

        CkanClient cc = new CkanClient("http://dati.trentino.it");        

        CkanQuery query = CkanQuery.filter().byGroupNames("turismo").byTagNames("ristoranti");

        List<CkanDataset> filteredDatasets = cc.searchDatasets(query, 10, 0).getResults();

        for (CkanDataset d : filteredDatasets) {
            System.out.println();
            System.out.println("DATASET: " + d.getName());
        }
    }


}
