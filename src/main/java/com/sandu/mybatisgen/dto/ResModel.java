package com.sandu.mybatisgen.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * CopyRight (c) 2017 Sandu Technology Inc.<p>
 * 
 * 模型资源库
 * 
 * @author songjianming@sanduspace.cn <p>
 * 2017-12-20 16:22:13.356
 */

@Data
public class ResModel implements Serializable {
    
    /**
     * res_model.id
     */
    private Long id;

    /**
     * 模型编码<p>
     * res_model.model_code
     */
    private String modelCode;

    /**
     * 模型名称<p>
     * res_model.model_name
     */
    private String modelName;

    /**
     * 模型文件名称<p>
     * res_model.model_file_name
     */
    private String modelFileName;

    /**
     * 模型文件类型<p>
     * res_model.model_type
     */
    private String modelType;

    /**
     * 模型大小<p>
     * res_model.model_size
     */
    private String modelSize;

    /**
     * 模型后缀<p>
     * res_model.model_suffix
     */
    private String modelSuffix;

    /**
     * 模型级别<p>
     * res_model.model_level
     */
    private String modelLevel;

    /**
     * 模型路径<p>
     * res_model.model_path
     */
    private String modelPath;

    /**
     * 模型描述<p>
     * res_model.model_desc
     */
    private String modelDesc;

    /**
     * 系统编码<p>
     * res_model.sys_code
     */
    private String sysCode;

    /**
     * 创建者<p>
     * res_model.creator
     */
    private String creator;

    /**
     * res_model.gmt_create
     */
    private Date gmtCreate;

    /**
     * 修改人<p>
     * res_model.modifier
     */
    private String modifier;

    /**
     * 修改时间<p>
     * res_model.gmt_modified
     */
    private Date gmtModified;

    /**
     * 是否删除<p>
     * res_model.is_deleted
     */
    private Integer isDeleted;

    /**
     * 模型排序<p>
     * res_model.model_ordering
     */
    private Integer modelOrdering;

    /**
     * 字符备用1<p>
     * res_model.file_key
     */
    private String fileKey;

    /**
     * res_model.file_keys
     */
    private String fileKeys;

    /**
     * res_model.business_ids
     */
    private String businessIds;

    /**
     * 字符备用4<p>
     * res_model.att4
     */
    private String att4;

    /**
     * 字符备用5<p>
     * res_model.att5
     */
    private String att5;

    /**
     * 字符备用6<p>
     * res_model.att6
     */
    private String att6;

    /**
     * 时间备用1<p>
     * res_model.date_att1
     */
    private Date dateAtt1;

    /**
     * 时间备用2<p>
     * res_model.date_att2
     */
    private Date dateAtt2;

    /**
     * 整数备用1<p>
     * res_model.business_id
     */
    private Integer businessId;

    /**
     * 整数备用2<p>
     * res_model.num_att2
     */
    private Integer numAtt2;

    /**
     * 数字备用1<p>
     * res_model.num_att3
     */
    private BigDecimal numAtt3;

    /**
     * 数字备用2<p>
     * res_model.num_att4
     */
    private BigDecimal numAtt4;

    /**
     * 备注<p>
     * res_model.remark
     */
    private String remark;

    /**
     * 长<p>
     * res_model.LENGTH
     */
    private Integer length;

    /**
     * 高<p>
     * res_model.height
     */
    private Integer height;

    /**
     * 宽<p>
     * res_model.width
     */
    private Integer width;

    /**
     * 最小高度<p>
     * res_model.min_height
     */
    private Integer minHeight;

    /**
     * res_model.is_model_share
     */
    private Integer isModelShare;

    /**
     * 是否解压<p>
     * res_model.is_decompress
     */
    private Integer isDecompress;

    private static final long serialVersionUID = 1L;
}