package com.dwb.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author manke
 * @date 2020-06-23 16:10:00
 * @email 
 */
@Data
@ApiModel("技师")
public class SJishi implements Serializable  {

    @ApiModelProperty(value = "自增id")
    private Integer id;

    @ApiModelProperty(value = "支付宝openid")
    private String alipayOpenid;

    @ApiModelProperty(value = "微信openid")
    private String weixinOpenid;

    @ApiModelProperty(value = "微信unionid")
    private String weixinUnionid;

    @ApiModelProperty(value = "微信web用户openid")
    private String weixinWebOpenid;

    @ApiModelProperty(value = "百度openid")
    private String baiduOpenid;

    @ApiModelProperty(value = "百度openid")
    private String toutiaoOpenid;

    @ApiModelProperty(value = "QQopenid")
    private String qqOpenid;

    @ApiModelProperty(value = "QQunionid")
    private String qqUnionid;

    @ApiModelProperty(value = "状态（0正常,1禁止发言,2禁止登录）")
    private Boolean status;

    @ApiModelProperty(value = "配合密码加密串")
    private String salt;

    @ApiModelProperty(value = "登录密码")
    private String pwd;

    @ApiModelProperty(value = "token")
    private String token;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "用户昵称")
    private String nickname;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "电子邮箱（最大长度60个字符）")
    private String email;

    @ApiModelProperty(value = "性别（0保密，1女，2男）")
    private Boolean gender;

    @ApiModelProperty(value = "用户头像地址")
    private String avatar;

    @ApiModelProperty(value = "所在省")
    private String province;

    @ApiModelProperty(value = "所在市")
    private String city;

    @ApiModelProperty(value = "生日")
    private Integer birthday;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "积分")
    private Integer integral;

    @ApiModelProperty(value = "锁定积分")
    private Integer lockingIntegral;

    @ApiModelProperty(value = "推荐人用户id")
    private Integer referrer;

    @ApiModelProperty(value = "是否已删除（0否,大于0删除时间）")
    private Integer isDeleteTime;

    @ApiModelProperty(value = "添加时间")
    private Integer addTime;

    @ApiModelProperty(value = "更新时间")
    private Integer updTime;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "技能介绍")
    private String jinengDesc;

    @ApiModelProperty(value = "身份证号")
    private String idcard;

}