package common.user.nyarlathotep.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author haoran hou
 * @since 2022-09-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String password;

    private String salt;

    private String headImage;

    private String sex;

    private String phone;

    /**
     * 时间戳
     */
    private Long birthday;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 实名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String identityCard;

    private String country;

    private String province;

    private String city;

    /**
     * 地址
     */
    private String location;

    private Boolean del;

    @TableField(fill = FieldFill.INSERT)
    private Long gmtCreate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long gmtModified;


}
