package com.laogou.ailearn.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiCodeHelpTest {


    @Resource
    private AiCodeHelp aiCodeHelp;

    @Test
    void getAiCode() {
        System.out.println(aiCodeHelp.getAiCode("我是谁"));
    }
}