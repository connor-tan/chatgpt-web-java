package com.hncboy.chatgpt.admin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hncboy.chatgpt.admin.domain.query.ChatRoomPageQuery;
import com.hncboy.chatgpt.admin.domain.query.ChatTemplatePageQuery;
import com.hncboy.chatgpt.admin.domain.vo.ChatRoomVO;
import com.hncboy.chatgpt.admin.domain.vo.ChatTemplateVO;
import com.hncboy.chatgpt.admin.service.ChatTemplateService;
import com.hncboy.chatgpt.base.annotation.ApiAdminRestController;
import com.hncboy.chatgpt.base.handler.response.R;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@AllArgsConstructor
@Tag(name = "管理端-聊天室相关接口")
@ApiAdminRestController("/chat_template")
public class ChatTemplateController {
    private final ChatTemplateService chatTemplateService;

    @Operation(summary = "聊天室分页列表")
    @PostMapping("/page")
    public R<IPage<ChatTemplateVO>> page(@Validated @RequestBody ChatTemplatePageQuery chatTemplatePageQuery) {
        return R.data(chatTemplateService.pageChatTemplate(chatTemplatePageQuery));
    }
}
