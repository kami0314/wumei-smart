package com.ruoyi.iot.model.ThingsModels;

import com.alibaba.fastjson.JSONObject;

/**
 * 物模型值的项
 *
 * @author kerwincui
 * @date 2021-12-16
 */
public class ThingsModelValueItemDao
{
    /** 物模型唯一标识符 */
    private String id;

    /** 物模型名称 */
    private String name;

    /** 物模型值 */
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
