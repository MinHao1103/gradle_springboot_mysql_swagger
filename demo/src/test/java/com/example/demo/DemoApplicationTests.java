package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

    @Test
    public void testAddition() {
        int sum = 1 + 2;
        assertEquals(3, sum);
    }

}
