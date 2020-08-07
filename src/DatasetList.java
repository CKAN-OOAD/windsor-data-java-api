import eu.trentorise.opendata.jackan.CkanClient;
import eu.trentorise.opendata.jackan.model.CkanDataset;
import eu.trentorise.opendata.jackan.model.CkanResource;

import java.util.ArrayList;
import java.util.List;

public class DatasetList implements DatasetTemplate {
    ArrayList<Dataset> datasetList;
    public DatasetList(){
        datasetList = new ArrayList<Dataset>();
    }

    //querys the ckan site for the first 10 datasets to view

    public void loadDatasets(){
        CkanClient cc = new CkanClient(CKAN_URL);
        List<String> ds = cc.getDatasetList(DATASET_LIMIT, 0);
        ArrayList<String> urls = new ArrayList<>();
        ArrayList<String> formats = new ArrayList<>();
        ArrayList<String> fileNames = new ArrayList<>();
        for (String dataset : ds) {
            CkanDataset d = cc.getDataset(dataset);
            int fileCount = 0;
            for (CkanResource r : d.getResources()) {
                if (r.getFormat().equals("CSV")){
                    urls.add(r.getUrl());
                    formats.add(r.getFormat());
                    fileNames.add(r.getName());
                    fileCount++;
                }
            }
            datasetList.add(new Dataset(dataset, formats, urls, fileNames, fileCount));
        }

    }
    public Dataset get(int n) //gets the nth dataset from list
    {
        return datasetList.get(n);
    }
    public int size(){
        return datasetList.size();
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < this.datasetList.size(); i++) {
            output+= datasetList.get(i).toString();
        }
        return output;
    }
}
