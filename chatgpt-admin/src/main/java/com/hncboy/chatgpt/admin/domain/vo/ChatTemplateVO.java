package com.hncboy.chatgpt.admin.domain.vo;

import com.hncboy.chatgpt.base.enums.ApiTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * @author hncboy
 * @date 2023-3-27
 * 聊天室展示参数
 */
@Data
@Schema(title = "聊天模板展示参数")
public class ChatTemplateVO {

    @Schema(title = "模板 id")
    private Long id;

    @Schema(title = "模板内容", description = "")
    private String template;

    @Schema(title = "所属行业")
    private String industryName;

    @Schema(title = "创建时间")
    private Date createTime;

    @Schema(title = "更新时间")
    private Date updateTime;
}
