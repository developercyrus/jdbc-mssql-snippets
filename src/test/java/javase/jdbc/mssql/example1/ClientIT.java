package javase.jdbc.mssql.example1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientIT {	
        
    @Before
    public void setup() {
        Client.insert();
    }
        
    @Test
    public void test1() throws Exception {    	
        String actual = Client.select();
        System.out.println(actual);
        
        assertEquals("sam", actual);
    }   
}
