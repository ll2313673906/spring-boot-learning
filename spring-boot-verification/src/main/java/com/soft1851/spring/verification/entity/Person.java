package com.soft1851.spring.verification.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * @Author F*WT
 * @Date 2020/4/30 14:19
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NotNull(message = "Id 不能为空")
    private String id;

    @Size(max = 30)
    @NotNull(message = "name 不能为空")
    private String name;

    @Min(18)
    private Integer age;

    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$", message = "手机号码格式错误")
    @NotBlank(message = "手机号码不能为空")
    private String phone;

    @NotNull(message = "email 不能为空")
    @Email(message = "邮箱的格式错误")
    private String email;


    @Pattern(regexp = "((^Man$|^Woman$|^UGM$))",message = "sex 值不在选取范围")
    @NotNull(message = "sex 不能为空")
    private String sex;
}
