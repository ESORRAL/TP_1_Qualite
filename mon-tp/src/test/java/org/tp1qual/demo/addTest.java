package org.tp1qual.demo;
import static org.tp1qual.demo.add.add;

import org.junit.Test;


public class addTest  {

    @Test
    
    public void testAdd() {
        assert(add(2, 3) == 5);
        assert(add(-1, 1) == 0);
        assert(add(-2, -3) == -5);
    }

}
