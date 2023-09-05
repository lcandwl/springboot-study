package com.hidisp.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName("user")
@Data
public class User implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer uid;

    /**
     * 
     */
    private String uname;

    /**
     * 
     */
    private String upwd;

    /**
     * 
     */
    private String sex;

    /**
     * 
     */
    private String birthday;

    /**
     * 
     */
    private Integer marry;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(", uid=").append(uid);
        sb.append(", uname=").append(uname);
        sb.append(", upwd=").append(upwd);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", marry=").append(marry);
        sb.append("]");
        return sb.toString();
    }
}