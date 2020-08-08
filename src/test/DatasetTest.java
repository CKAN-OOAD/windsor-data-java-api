import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import javax.xml.crypto.Data;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DatasetTest {
    ArrayList<String> formats = new ArrayList<String>();
    ArrayList<String> urls = new ArrayList<String>();
    ArrayList<String> fileNames = new ArrayList<String>();
    Dataset test;

    @BeforeAll
    void initAll(){
        formats.add("CSV");
        formats.add("CSV");
        urls.add("http://www.statweb.provincia.tn.it/indicatoristrutturalisubpro/exp.aspx?idind=430&info=d&fmt=csv");
        urls.add("http://www.statweb.provincia.tn.it/indicatoristrutturalisubpro/exp.aspx?ntab=Sub_RAI_Abbonati&info=d&fmt=csv");
        fileNames.add("Abbonamenti alla RAI");
        fileNames.add("Numero di abbonati alla RAI");
        test = new Dataset("abbonamenti-alla-rai", formats, urls, fileNames, 2);
    }
    @Test

    void getFormats() {
    }

    @Test
    void getUrls() {
    }

    @Test
    void getTemplate() {
    }

    @Test
    void testToString() {
    }
}