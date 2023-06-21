package com.hncboy.chatgpt.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hncboy.chatgpt.admin.domain.query.ChatTemplatePageQuery;
import com.hncboy.chatgpt.admin.domain.vo.ChatTemplateVO;
import com.hncboy.chatgpt.admin.handler.converter.ChatTemplateConverter;
import com.hncboy.chatgpt.admin.service.ChatTemplateService;
import com.hncboy.chatgpt.base.domain.entity.ChatTemplateDO;
import com.hncboy.chatgpt.base.mapper.ChatTemplateMapper;
import com.hncboy.chatgpt.base.util.PageUtil;
import org.springframework.stereotype.Service;

/**
 * @author hncboy
 * @date 2023-3-27
 * 聊天室业务实现类
 */
@Service
public class ChatTemplateServiceImpl extends ServiceImpl<ChatTemplateMapper, ChatTemplateDO> implements ChatTemplateService {

    @Override
    public IPage<ChatTemplateVO> pageChatTemplate(ChatTemplatePageQuery chatTemplatePageQuery) {
        Page<ChatTemplateDO> chatTemplatePage = page(new Page<>(chatTemplatePageQuery.getPageNum(), chatTemplatePageQuery.getPageSize()), new LambdaQueryWrapper<ChatTemplateDO>()
                .orderByDesc(ChatTemplateDO::getId));

        return PageUtil.toPage(chatTemplatePage, ChatTemplateConverter.INSTANCE.entityToVO(chatTemplatePage.getRecords()));
    }
}
