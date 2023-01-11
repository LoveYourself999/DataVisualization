package Test;

import Data_fetcher.Data_Fetcher;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DataFecherTest {

    @Test
    public void Data_Fecher_Test_00(){
        Data_Fetcher df = new Data_Fetcher("USA",2001,2020);
    }

    @Test
    public void Data_Fecher_Test_01(){
        Data_Fetcher df = new Data_Fetcher("USA",2002,2003);
        assertTrue(df.getStartYear()==2002);
    }

    @Test
    public void Data_Fecher_Test_02(){
        Data_Fetcher df = new Data_Fetcher("USA",2002,2003);
        assertTrue(df.getEndYear()==2003);
    }

    @Test
    public void Data_Fecher_Test_03(){
        Data_Fetcher df = new Data_Fetcher("USA",2004,2003);
        assertTrue(df.year()==false);
    }

    @Test
    public void Data_Fecher_Test_04(){
        Data_Fetcher df = new Data_Fetcher("USA",2001,2020);
        assertTrue(df.getCountryName().equals("USA"));
        assertTrue(2001 == df.getStartYear());
        assertTrue(2020 == df.getEndYear());
        assertNotNull(Data_Fetcher.getInstance());
        }
    }

