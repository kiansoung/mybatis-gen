package com.sandu.mybatisgen.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * CopyRight (c) 2017 Sandu Technology Inc.<p>
 * 
 * 
 * @author songjianming@sanduspace.cn <p>
 * 2017-12-20 16:22:13.353
 */

@Data
public class DesignTempletProduct implements Serializable {
    
    /**
     * design_templet_product.id
     */
    private Long id;

    /**
     * 位置文本信息id<p>
     * design_templet_product.location_file_id
     */
    private Integer locationFileId;

    /**
     * 产品顺序<p>
     * design_templet_product.product_sequence
     */
    private String productSequence;

    /**
     * 产品id<p>
     * design_templet_product.product_id
     */
    private Integer productId;

    /**
     * 方案id<p>
     * design_templet_product.design_templet_id
     */
    private Integer designTempletId;

    /**
     * 系统编码<p>
     * design_templet_product.sys_code
     */
    private String sysCode;

    /**
     * 创建者<p>
     * design_templet_product.creator
     */
    private String creator;

    /**
     * design_templet_product.gmt_create
     */
    private Date gmtCreate;

    /**
     * 修改人<p>
     * design_templet_product.modifier
     */
    private String modifier;

    /**
     * 修改时间<p>
     * design_templet_product.gmt_modified
     */
    private Date gmtModified;

    /**
     * 是否删除<p>
     * design_templet_product.is_deleted
     */
    private Integer isDeleted;

    /**
     * 字符备用1<p>
     * design_templet_product.att1
     */
    private String att1;

    /**
     * 字符备用2<p>
     * design_templet_product.att2
     */
    private String att2;

    /**
     * 整数备用1<p>
     * design_templet_product.numa1
     */
    private Integer numa1;

    /**
     * 整数备用2<p>
     * design_templet_product.numa2
     */
    private Integer numa2;

    /**
     * 备注<p>
     * design_templet_product.remark
     */
    private String remark;

    /**
     * design_templet_product.pos_index_path
     */
    private String posIndexPath;

    /**
     * design_templet_product.init_product_id
     */
    private Integer initProductId;

    /**
     * 产品组合ID<p>
     * design_templet_product.product_group_id
     */
    private Integer productGroupId;

    /**
     * 是否是主产品<p>
     * design_templet_product.is_main_product
     */
    private Integer isMainProduct;

    /**
     * 挂节点名称<p>
     * design_templet_product.pos_name
     */
    private String posName;

    /**
     * 并没有什么卵用<p>
     * design_templet_product.timeId
     */
    private String timeid;

    /**
     * 样板房组合ID<p>
     * design_templet_product.plan_group_id
     */
    private String planGroupId;

    /**
     * 绑定父产品Id<p>
     * design_templet_product.bind_parent_productId
     */
    private String bindParentProductid;

    /**
     * 是组合还是结构,0:组合,1:结构<p>
     * design_templet_product.group_type
     */
    private Integer groupType;

    /**
     * 产品同小分类序号<p>
     * design_templet_product.same_product_type_index
     */
    private Integer sameProductTypeIndex;

    /**
     * 标准(1标准 0 非标准)<p>
     * design_templet_product.is_standard
     */
    private Integer isStandard;

    /**
     * 中心点<p>
     * design_templet_product.center
     */
    private String center;

    /**
     * 区域标识<p>
     * design_templet_product.region_mark
     */
    private String regionMark;

    /**
     * 款式id<p>
     * design_templet_product.style_id
     */
    private Integer styleId;

    /**
     * 尺寸代码<p>
     * design_templet_product.measure_code
     */
    private String measureCode;

    /**
     * 描述(区域、尺寸代码)<p>
     * design_templet_product.describe_info
     */
    private String describeInfo;

    /**
     * 序号<p>
     * design_templet_product.product_index
     */
    private Integer productIndex;

    /**
     * 是否为结构中的主产品标识（1是，0否）<p>
     * design_templet_product.is_main_structure_product
     */
    private Integer isMainStructureProduct;

    /**
     * 主产品单品是否可以作为组合方式替换（1是，0否）<p>
     * design_templet_product.is_group_replace_way
     */
    private Integer isGroupReplaceWay;

    /**
     * 记录删除数据标识<p>
     * design_templet_product.del_data_mark
     */
    private String delDataMark;

    /**
     * 墙体方位<p>
     * design_templet_product.wall_orientation
     */
    private String wallOrientation;

    /**
     * 墙体类型<p>
     * design_templet_product.wall_type
     */
    private String wallType;

    private static final long serialVersionUID = 1L;
}