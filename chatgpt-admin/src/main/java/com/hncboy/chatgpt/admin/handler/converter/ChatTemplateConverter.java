package com.hncboy.chatgpt.admin.handler.converter;

import com.hncboy.chatgpt.admin.domain.vo.ChatRoomVO;
import com.hncboy.chatgpt.admin.domain.vo.ChatTemplateVO;
import com.hncboy.chatgpt.base.domain.entity.ChatRoomDO;
import com.hncboy.chatgpt.base.domain.entity.ChatTemplateDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author hncboy
 * @date 2023-3-27
 * 聊天室相关转换
 */
@Mapper
public interface ChatTemplateConverter {

    ChatTemplateConverter INSTANCE = Mappers.getMapper(ChatTemplateConverter.class);

    /**
     * entityToVO
     *
     * @param chatTemplateDOList chatTemplateDOList
     * @return List<ChatRoomVO>
     */
    List<ChatTemplateVO> entityToVO(List<ChatTemplateDO> chatTemplateDOList);
}
