package com.laogou.ailearn.ai;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;


//@AiService
public interface AiCodeHelperService {


/**
 * 这是一个聊天方法，用于处理用户消息并返回AI助手的回复
 * @param memoryId 用于标识会话内存的ID，用于维护多轮对话的上下文
 * @param userMessage 用户输入的消息内容
 * @return 返回AI助手的回复消息
 */
    @SystemMessage(fromResource = "system-prompt.txt")
    String chat(@MemoryId String memoryId, @UserMessage String userMessage);
}
