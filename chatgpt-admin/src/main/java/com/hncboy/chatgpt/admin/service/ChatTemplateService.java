package com.hncboy.chatgpt.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hncboy.chatgpt.admin.domain.query.ChatTemplatePageQuery;
import com.hncboy.chatgpt.admin.domain.vo.ChatRoomVO;
import com.hncboy.chatgpt.admin.domain.vo.ChatTemplateVO;
import com.hncboy.chatgpt.base.domain.entity.ChatTemplateDO;

public interface ChatTemplateService extends IService<ChatTemplateDO> {
    IPage<ChatTemplateVO> pageChatTemplate(ChatTemplatePageQuery chatTemplatePageQuery);
}
