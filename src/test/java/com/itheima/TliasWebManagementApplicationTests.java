package com.itheima;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.jsonwebtoken.Jwts;

import java.util.UUID;

@SpringBootTest
class TliasWebManagementApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testUuid(){
        for (int i = 0; i < 1000; i++) {
            String uuid = UUID.randomUUID().toString();
            System.out.println(uuid);
        }
    }

    @Test
    public void testGenJwt(){
        Jwts.builder();

    }


}
