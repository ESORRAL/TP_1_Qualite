package org.tp1qual.demo;
import org.junit.Test;

public class subTest {
    @Test
    public void testSub() {
        assert(sub.sub(5, 3) == 2);
        assert(sub.sub(10, 4) == 6);
    }
}
