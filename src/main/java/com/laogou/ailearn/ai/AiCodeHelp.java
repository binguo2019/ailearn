package com.laogou.ailearn.ai;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author guobin
 * @description:
 * @date 2025年09月16日
 */
@Service
@Slf4j
public class AiCodeHelp {

    @Resource
    private ChatModel qwenChatModel;

    public String getAiCode(String message){
        UserMessage userMessage = UserMessage.from(message);
        ChatResponse chatResponse = qwenChatModel.chat(userMessage);
        AiMessage aiMessage = chatResponse.aiMessage();
//        log.info("AI 输出：" + aiMessage.toString());
        return aiMessage.text();
    }
}
