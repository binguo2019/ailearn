package com.laogou.ailearn.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCodeHelperServiceTest {

    @Resource
    private AiCodeHelperService aiCodeHelperService;


    @Test
    void chatWithMemory() {
        String result = aiCodeHelperService.chat("user01", "你好，我是程序员鱼皮");
        System.out.println(result);
        result = aiCodeHelperService.chat("user01","你好，我是谁来着？");
        System.out.println(result);
    }

}