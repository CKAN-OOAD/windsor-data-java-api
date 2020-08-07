
package eu.trentorise.opendata.jackan;

/**
 * Gets dataset list
 * @since 0.4.1
 */
public class TestApp1 {

    public static void main(String[] args) {

        CkanClient cc = new CkanClient("http://dati.trentino.it");
        System.out.println(cc.getDatasetList());

    }
}
