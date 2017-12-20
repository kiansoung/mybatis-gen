package com.sandu.mybatisgen.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * CopyRight (c) 2017 Sandu Technology Inc.<p>
 * 
 * 设计方案
 * 
 * @author songjianming@sanduspace.cn <p>
 * 2017-12-20 16:22:13.348
 */

@Data
public class DesignPlan implements Serializable {
    
    /**
     * design_plan.id
     */
    private Long id;

    /**
     * 方案编码<p>
     * design_plan.plan_code
     */
    private String planCode;

    /**
     * 方案名称<p>
     * design_plan.plan_name
     */
    private String planName;

    /**
     * 设计者id<p>
     * design_plan.user_id
     */
    private Integer userId;

    /**
     * 方案来源类型<p>
     * design_plan.design_source_type
     */
    private Integer designSourceType;

    /**
     * 来源id<p>
     * design_plan.design_id
     */
    private Integer designId;

    /**
     * 设计风格<p>
     * design_plan.design_style_id
     */
    private Integer designStyleId;

    /**
     * 方案图片<p>
     * design_plan.pic_id
     */
    private Integer picId;

    /**
     * design_plan.model_3d_id
     */
    private Integer model3dId;

    /**
     * design_plan.model_u3d_id
     */
    private Integer modelU3dId;

    /**
     * 方案模型<p>
     * design_plan.model_id
     */
    private Integer modelId;

    /**
     * 配置文件<p>
     * design_plan.config_file_id
     */
    private Integer configFileId;

    /**
     * 空间id<p>
     * design_plan.space_common_id
     */
    private Integer spaceCommonId;

    /**
     * 方案描述<p>
     * design_plan.plan_desc
     */
    private String planDesc;

    /**
     * 系统编码<p>
     * design_plan.sys_code
     */
    private String sysCode;

    /**
     * 创建者<p>
     * design_plan.creator
     */
    private String creator;

    /**
     * design_plan.gmt_create
     */
    private Date gmtCreate;

    /**
     * 修改人<p>
     * design_plan.modifier
     */
    private String modifier;

    /**
     * 修改时间<p>
     * design_plan.gmt_modified
     */
    private Date gmtModified;

    /**
     * 是否删除<p>
     * design_plan.is_deleted
     */
    private Integer isDeleted;

    /**
     * 备注<p>
     * design_plan.remark
     */
    private String remark;

    /**
     * design_plan.design_template_id
     */
    private String designTemplateId;

    /**
     * design_plan.ipad_model_u3d_id
     */
    private Integer ipadModelU3dId;

    /**
     * design_plan.ios_model_u3d_id
     */
    private Integer iosModelU3dId;

    /**
     * design_plan.android_model_u3d_id
     */
    private Integer androidModelU3dId;

    /**
     * design_plan.macBookpc_model_u3d_id
     */
    private Integer macbookpcModelU3dId;

    /**
     * design_plan.pc_model_u3d_id
     */
    private Integer pcModelU3dId;

    /**
     * design_plan.web_model_u3d_id
     */
    private Integer webModelU3dId;

    /**
     * design_plan.media_type
     */
    private Integer mediaType;

    /**
     * design_plan.evening_file_id
     */
    private Integer eveningFileId;

    /**
     * design_plan.dawn_file_id
     */
    private Integer dawnFileId;

    /**
     * design_plan.night_file_id
     */
    private Integer nightFileId;

    /**
     * design_plan.share_total
     */
    private Integer shareTotal;

    /**
     * design_plan.is_open
     */
    private Integer isOpen;

    /**
     * design_plan.draft_state
     */
    private Integer draftState;

    /**
     * design_plan.baiMo_state
     */
    private Integer baimoState;

    /**
     * design_plan.stuff_finish_state
     */
    private Integer stuffFinishState;

    /**
     * design_plan.decorate_finish_state
     */
    private Integer decorateFinishState;

    /**
     * design_plan.is_change
     */
    private Integer isChange;

    /**
     * 是否装修过<p>
     * design_plan.is_decorated
     */
    private Integer isDecorated;

    /**
     * 方案来源<p>
     * design_plan.plan_source
     */
    private String planSource;

    /**
     * 小区户型名称<p>
     * design_plan.residential_units_name
     */
    private String residentialUnitsName;

    /**
     * 户型ID<p>
     * design_plan.house_id
     */
    private Integer houseId;

    /**
     * 小区ID<p>
     * design_plan.living_id
     */
    private Integer livingId;

    /**
     * 设计方案封面<p>
     * design_plan.cover_pic_id
     */
    private Integer coverPicId;

    /**
     * 设计方案是否发布 0 否 1是<p>
     * design_plan.is_release
     */
    private Integer isRelease;

    /**
     * 方案推荐风格ID<p>
     * design_plan.design_recommended_style_id
     */
    private Integer designRecommendedStyleId;

    /**
     * 设计方案发布时间 （需要通过发布时间进行排序）<p>
     * design_plan.release_time
     */
    private Date releaseTime;

    /**
     * 特效配置<p>
     * design_plan.effects_config
     */
    private String effectsConfig;

    /**
     * 是否默认推荐<p>
     * design_plan.is_recommended
     */
    private Integer isRecommended;

    /**
     * 是否支持一键装修<p>
     * design_plan.is_default_decorate
     */
    private Integer isDefaultDecorate;

    /**
     * 方案编号<p>
     * design_plan.plan_number
     */
    private String planNumber;

    /**
     * 表明该设计由进入渲染场景时创建的临时方案，0代表不可见，1代表可见<p>
     * design_plan.visible
     */
    private Byte visible;

    /**
     * 设计方案副本id<p>
     * design_plan.design_scene_id
     */
    private Long designSceneId;

    /**
     * 和副本比较，判断场景是否发生改变<p>
     * design_plan.scene_modified
     */
    private Long sceneModified;

    /**
     * 设计方案类型(0:普通设计方案;1:一件装修设计方案)<p>
     * design_plan.plan_type
     */
    private Byte planType;

    /**
     * 推荐方案ID<p>
     * design_plan.recommended_plan_id
     */
    private Long recommendedPlanId;

    /**
     * 拼花产品集合 <p>
     * design_plan.spelling_flower_product
     */
    private String spellingFlowerProduct;

    /**
     * 拼花信息文件id <p>
     * design_plan.spelling_flower_file_id
     */
    private Integer spellingFlowerFileId;

    /**
     * design_plan.designPlan_render_pic_ids
     */
    private byte[] designplanRenderPicIds;

    private static final long serialVersionUID = 1L;
}