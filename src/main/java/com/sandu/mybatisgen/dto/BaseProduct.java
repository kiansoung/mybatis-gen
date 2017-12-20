package com.sandu.mybatisgen.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * CopyRight (c) 2017 Sandu Technology Inc.<p>
 * 
 * 产品日报表
 * 
 * @author songjianming@sanduspace.cn <p>
 * 2017-12-20 16:22:13.361
 */

@Data
public class BaseProduct implements Serializable {
    
    /**
     * base_product.id
     */
    private Long id;

    /**
     * 产品编码<p>
     * base_product.product_code
     */
    private String productCode;

    /**
     * 产品名称<p>
     * base_product.product_name
     */
    private String productName;

    /**
     * 产品品牌<p>
     * base_product.brand_id
     */
    private Integer brandId;

    /**
     * 产品风格<p>
     * base_product.pro_style_id
     */
    private Integer proStyleId;

    /**
     * 产品规格<p>
     * base_product.product_spec
     */
    private String productSpec;

    /**
     * 产品颜色<p>
     * base_product.color_id
     */
    private Integer colorId;

    /**
     * 产品长度<p>
     * base_product.product_length
     */
    private String productLength;

    /**
     * 产品宽度<p>
     * base_product.product_width
     */
    private String productWidth;

    /**
     * 产品高度<p>
     * base_product.product_height
     */
    private String productHeight;

    /**
     * 销售价格<p>
     * base_product.sale_price
     */
    private BigDecimal salePrice;

    /**
     * 图片缩略图id<p>
     * base_product.pic_id
     */
    private Integer picId;

    /**
     * 模型id<p>
     * base_product.model_id
     */
    private Integer modelId;

    /**
     * 产品描述<p>
     * base_product.product_desc
     */
    private String productDesc;

    /**
     * 系统编码<p>
     * base_product.sys_code
     */
    private String sysCode;

    /**
     * 创建者<p>
     * base_product.creator
     */
    private String creator;

    /**
     * base_product.gmt_create
     */
    private Date gmtCreate;

    /**
     * 修改人<p>
     * base_product.modifier
     */
    private String modifier;

    /**
     * 修改时间<p>
     * base_product.gmt_modified
     */
    private Date gmtModified;

    /**
     * 是否删除<p>
     * base_product.is_deleted
     */
    private Integer isDeleted;

    /**
     * base_product.pic_ids
     */
    private String picIds;

    /**
     * 产品材质<p>
     * base_product.material_pic_ids
     */
    private String materialPicIds;

    /**
     * base_product.house_type_values
     */
    private String houseTypeValues;

    /**
     * 产品类型<p>
     * base_product.product_type_value
     */
    private String productTypeValue;

    /**
     * u3d模型<p>
     * base_product.u3dmodel_Id
     */
    private String u3dmodelId;

    /**
     * base_product.merge_product_ids
     */
    private String mergeProductIds;

    /**
     * 上架操作修改时间<p>
     * base_product.putaway_modified
     */
    private Date putawayModified;

    /**
     * 时间备用2<p>
     * base_product.date_att2
     */
    private Date dateAtt2;

    /**
     * base_product.product_small_type_value
     */
    private Integer productSmallTypeValue;

    /**
     * base_product.putaway_state
     */
    private Integer putawayState;

    /**
     * 数字备用1<p>
     * base_product.num_att3
     */
    private BigDecimal numAtt3;

    /**
     * 数字备用2<p>
     * base_product.num_att4
     */
    private BigDecimal numAtt4;

    /**
     * 备注<p>
     * base_product.remark
     */
    private String remark;

    /**
     * base_product.ipad_u3dmodel_id
     */
    private Integer ipadU3dmodelId;

    /**
     * base_product.ios_u3dmodel_id
     */
    private Integer iosU3dmodelId;

    /**
     * base_product.android_u3dmodel_id
     */
    private Integer androidU3dmodelId;

    /**
     * base_product.macbook_u3dmodel_id
     */
    private Integer macbookU3dmodelId;

    /**
     * base_product.windows_u3dmodel_id
     */
    private Integer windowsU3dmodelId;

    /**
     * base_product.web_u3dmodel_id
     */
    private Integer webU3dmodelId;

    /**
     * base_product.decoration_id
     */
    private String decorationId;

    /**
     * base_product.designer_id
     */
    private Integer designerId;

    /**
     * base_product.modeling_id
     */
    private Integer modelingId;

    /**
     * base_product.rendering_id
     */
    private Integer renderingId;

    /**
     * base_product.product_type_mark
     */
    private String productTypeMark;

    /**
     * base_product.product_small_type_mark
     */
    private String productSmallTypeMark;

    /**
     * base_product.original_product_code
     */
    private String originalProductCode;

    /**
     * base_product.spaceComon_id
     */
    private Integer spacecomonId;

    /**
     * base_product.product_short_code
     */
    private String productShortCode;

    /**
     * base_product.bm_ids
     */
    private String bmIds;

    /**
     * base_product.code_number
     */
    private Integer codeNumber;

    /**
     * base_product.parent_id
     */
    private Integer parentId;

    /**
     * base_product.designTemplet_id
     */
    private Integer designtempletId;

    /**
     * base_product.material_file_id
     */
    private Integer materialFileId;

    /**
     * base_product.material3d_pic_ids
     */
    private String material3dPicIds;

    /**
     * base_product.sync_status
     */
    private String syncStatus;

    /**
     * 该code使用状态 ， 1:已使用 2未使用<p>
     * base_product.code_is_employ
     */
    private Integer codeIsEmploy;

    /**
     * 批次<p>
     * base_product.code_batch
     */
    private String codeBatch;

    /**
     * 产品型号<p>
     * base_product.product_model_number
     */
    private String productModelNumber;

    /**
     * 背景墙全铺长度<p>
     * base_product.full_pave_length
     */
    private String fullPaveLength;

    /**
     * 记录测试操作修改时间<p>
     * base_product.test_modified
     */
    private Date testModified;

    /**
     * 产品价格单位<p>
     * base_product.sale_price_value
     */
    private Integer salePriceValue;

    /**
     * 最小高度<p>
     * base_product.min_height
     */
    private String minHeight;

    /**
     * 产品材质描述<p>
     * base_product.product_material_desc
     */
    private String productMaterialDesc;

    /**
     * 产品色系编码<p>
     * base_product.colors_long_code
     */
    private String colorsLongCode;

    /**
     * 产品配置文件<p>
     * base_product.config_id
     */
    private Integer configId;

    /**
     * FBX配置文件<p>
     * base_product.fbx_file_id
     */
    private Integer fbxFileId;

    /**
     * FBX贴图<p>
     * base_product.fbx_texture
     */
    private String fbxTexture;

    /**
     * FBX处理状态 0未处理 1已处理<p>
     * base_product.fbx_state
     */
    private Integer fbxState;

    /**
     * 选中风格信息<p>
     * base_product.product_style_id_info
     */
    private String productStyleIdInfo;

    /**
     * base_product.style_id
     */
    private Long styleId;

    /**
     * 区域标识<p>
     * base_product.region_mark
     */
    private String regionMark;

    /**
     * 尺寸代码<p>
     * base_product.measure_code
     */
    private String measureCode;

    /**
     * 墙体分类<p>
     * base_product.wall_type
     */
    private String wallType;

    /**
     * 天花布局标识<p>
     * base_product.product_smallpox_identify
     */
    private Integer productSmallpoxIdentify;

    /**
     * 地面布局标识<p>
     * base_product.product_ground_identify
     */
    private Integer productGroundIdentify;

    /**
     * 拼花信息文件id <p>
     * base_product.spelling_flower_file_id
     */
    private Integer spellingFlowerFileId;

    /**
     * base_product.split_textures_info
     */
    private String splitTexturesInfo;

    private static final long serialVersionUID = 1L;
}