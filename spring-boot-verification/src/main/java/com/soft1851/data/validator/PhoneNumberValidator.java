package com.soft1851.data.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: fwt
 * @Date: 2020/4/30 17:41
 * @Description:
 */
public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber,String > {
    @Override
    public boolean isValid(String number, ConstraintValidatorContext constraintValidatorContext){
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Matcher m = p.matcher(number);
        return m.matches();
    }
}
