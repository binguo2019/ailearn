package com.laogou.ailearn.ai;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AiCodeHelperServiceFactory 配置类
 * 用于创建和配置 AiCodeHelperService Bean
 */
@Configuration
public class AiCodeHelperServiceFactory {

    @Resource
    private ChatModel qwenChatModel;  // 注入 ChatModel 类型的 qwenChatModel Bean

    /**
     * 创建并配置 AiCodeHelperService Bean
     * @return 配置好的 AiCodeHelperService 实例
     */
    @Bean
    public AiCodeHelperService aiCodeHelperService() {
        // 创建聊天记忆实例，设置最大消息数为10
 /*       ChatMemory chatMemory = MessageWindowChatMemory.builder()
                .maxMessages(10)  // 设置最大消息数量
                // Todo: 持久化
//                .chatMemoryStore(new PresistentChatMemoryStore())  // 注释掉的持久化存储配置
                .build();*/
        // 使用构建器模式创建 AiCodeHelperService 实例
        return AiServices.builder(AiCodeHelperService.class)
                .chatMemoryProvider(memoryId -> MessageWindowChatMemory.withMaxMessages(10))  // 设置聊天记忆提供者
                .chatModel(qwenChatModel)  // 设置聊天模型
                .build();
    }
}
