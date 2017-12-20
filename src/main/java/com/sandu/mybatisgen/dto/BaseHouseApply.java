package com.sandu.mybatisgen.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * CopyRight (c) 2017 Sandu Technology Inc.<p>
 * 
 * 户型申请表
 * 
 * @author songjianming@sanduspace.cn <p>
 * 2017-12-20 16:22:13.346
 */

@Data
public class BaseHouseApply implements Serializable {
    
    /**
     * base_house_apply.id
     */
    private Long id;

    /**
     * 申请时间<p>
     * base_house_apply.apply_time
     */
    private Date applyTime;

    /**
     * 用户id<p>
     * base_house_apply.user_id
     */
    private Integer userId;

    /**
     * 图片id<p>
     * base_house_apply.pic_id
     */
    private Integer picId;

    /**
     * 描述<p>
     * base_house_apply.description
     */
    private String description;

    /**
     * 处理状态<p>
     * base_house_apply.status
     */
    private Integer status;

    /**
     * 城市信息<p>
     * base_house_apply.city_info
     */
    private String cityInfo;

    /**
     * 小区信息<p>
     * base_house_apply.living_info
     */
    private String livingInfo;

    /**
     * 系统编码<p>
     * base_house_apply.sys_code
     */
    private String sysCode;

    /**
     * 创建者<p>
     * base_house_apply.creator
     */
    private String creator;

    /**
     * 创建时间<p>
     * base_house_apply.gmt_create
     */
    private Date gmtCreate;

    /**
     * 修改人<p>
     * base_house_apply.modifier
     */
    private String modifier;

    /**
     * 修改时间<p>
     * base_house_apply.gmt_modified
     */
    private Date gmtModified;

    /**
     * 是否删除<p>
     * base_house_apply.is_deleted
     */
    private Integer isDeleted;

    /**
     * 字符备用1<p>
     * base_house_apply.att1
     */
    private String att1;

    /**
     * 字符备用2<p>
     * base_house_apply.att2
     */
    private String att2;

    /**
     * 整数备用1<p>
     * base_house_apply.numa1
     */
    private Integer numa1;

    /**
     * 整数备用2<p>
     * base_house_apply.numa2
     */
    private Integer numa2;

    /**
     * 备注<p>
     * base_house_apply.remark
     */
    private String remark;

    /**
     * 户型名称<p>
     * base_house_apply.house_name
     */
    private String houseName;

    /**
     * 户型面积<p>
     * base_house_apply.house_area
     */
    private String houseArea;

    private static final long serialVersionUID = 1L;
}