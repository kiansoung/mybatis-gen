package com.sandu.mybatisgen.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * CopyRight (c) 2017 Sandu Technology Inc.<p>
 * 
 * 
 * @author songjianming@sanduspace.cn <p>
 * 2017-12-20 16:22:13.350
 */

@Data
public class DesignPlanProduct implements Serializable {
    
    /**
     * design_plan_product.id
     */
    private Long id;

    /**
     * 系统编码<p>
     * design_plan_product.sys_code
     */
    private String sysCode;

    /**
     * 方案id<p>
     * design_plan_product.plan_id
     */
    private Integer planId;

    /**
     * 产品id<p>
     * design_plan_product.product_id
     */
    private Integer productId;

    /**
     * design_plan_product.material_pic_id
     */
    private Integer materialPicId;

    /**
     * 相机配置<p>
     * design_plan_product.location_file_id
     */
    private Integer locationFileId;

    /**
     * 顺序<p>
     * design_plan_product.product_sequence
     */
    private String productSequence;

    /**
     * 创建者<p>
     * design_plan_product.creator
     */
    private String creator;

    /**
     * design_plan_product.gmt_create
     */
    private Date gmtCreate;

    /**
     * 修改人<p>
     * design_plan_product.modifier
     */
    private String modifier;

    /**
     * 修改时间<p>
     * design_plan_product.gmt_modified
     */
    private Date gmtModified;

    /**
     * 是否删除<p>
     * design_plan_product.is_deleted
     */
    private Integer isDeleted;

    /**
     * 字符备用1<p>
     * design_plan_product.att1
     */
    private String att1;

    /**
     * 字符备用2<p>
     * design_plan_product.att2
     */
    private String att2;

    /**
     * 字符备用3<p>
     * design_plan_product.att3
     */
    private String att3;

    /**
     * 字符备用4<p>
     * design_plan_product.att4
     */
    private String att4;

    /**
     * 字符备用5<p>
     * design_plan_product.att5
     */
    private String att5;

    /**
     * 字符备用6<p>
     * design_plan_product.att6
     */
    private String att6;

    /**
     * 时间备用1<p>
     * design_plan_product.date_att1
     */
    private Date dateAtt1;

    /**
     * 时间备用2<p>
     * design_plan_product.date_att2
     */
    private Date dateAtt2;

    /**
     * design_plan_product.planProduct_id
     */
    private Integer planproductId;

    /**
     * design_plan_product.display_status
     */
    private Integer displayStatus;

    /**
     * 数字备用1<p>
     * design_plan_product.num_att3
     */
    private BigDecimal numAtt3;

    /**
     * 数字备用2<p>
     * design_plan_product.num_att4
     */
    private BigDecimal numAtt4;

    /**
     * 备注<p>
     * design_plan_product.remark
     */
    private String remark;

    /**
     * design_plan_product.is_hide
     */
    private Integer isHide;

    /**
     * design_plan_product.pos_index_path
     */
    private String posIndexPath;

    /**
     * design_plan_product.init_product_id
     */
    private Integer initProductId;

    /**
     * design_plan_product.is_dirty
     */
    private Integer isDirty;

    /**
     * 产品组合ID<p>
     * design_plan_product.product_group_id
     */
    private Integer productGroupId;

    /**
     * 是否是主产品<p>
     * design_plan_product.is_main_product
     */
    private Integer isMainProduct;

    /**
     * 挂节点名称<p>
     * design_plan_product.pos_name
     */
    private String posName;

    /**
     * 设计方案组合ID<p>
     * design_plan_product.plan_group_id
     */
    private String planGroupId;

    /**
     * 有模型的产品<p>
     * design_plan_product.model_product_id
     */
    private Integer modelProductId;

    /**
     * 绑定父产品Id<p>
     * design_plan_product.bind_parent_productId
     */
    private String bindParentProductid;

    /**
     * 默认材质信息<p>
     * design_plan_product.split_textures_choose_info
     */
    private String splitTexturesChooseInfo;

    /**
     * 是组合还是结构,0:组合,1:结构<p>
     * design_plan_product.group_type
     */
    private Integer groupType;

    /**
     * 产品同小分类序号<p>
     * design_plan_product.same_product_type_index
     */
    private Integer sameProductTypeIndex;

    /**
     * 标准(1标准 0 非标准)<p>
     * design_plan_product.is_standard
     */
    private Integer isStandard;

    /**
     * 中心点<p>
     * design_plan_product.center
     */
    private String center;

    /**
     * 区域标识<p>
     * design_plan_product.region_mark
     */
    private String regionMark;

    /**
     * 款式id<p>
     * design_plan_product.style_id
     */
    private Integer styleId;

    /**
     * 尺寸代码<p>
     * design_plan_product.measure_code
     */
    private String measureCode;

    /**
     * 描述(区域、尺寸代码)<p>
     * design_plan_product.describe_info
     */
    private String describeInfo;

    /**
     * 序号<p>
     * design_plan_product.product_index
     */
    private Integer productIndex;

    /**
     * 是否为结构中的主产品标识（1是，0否）<p>
     * design_plan_product.is_main_structure_product
     */
    private Integer isMainStructureProduct;

    /**
     * 主产品单品是否可以作为组合方式替换（1是，0否）<p>
     * design_plan_product.is_group_replace_way
     */
    private Integer isGroupReplaceWay;

    /**
     * 墙体方位<p>
     * design_plan_product.wall_orientation
     */
    private String wallOrientation;

    /**
     * 墙体类型<p>
     * design_plan_product.wall_type
     */
    private String wallType;

    /**
     * 组合产品唯一标识<p>
     * design_plan_product.group_product_uniqueId
     */
    private String groupProductUniqueid;

    private static final long serialVersionUID = 1L;
}