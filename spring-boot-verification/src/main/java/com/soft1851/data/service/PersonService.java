package com.soft1851.data.service;

import com.soft1851.data.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @Author: fwt
 * @Date: 2020/4/30 16:32
 * @Description:
 */
@Service
@Validated@Slf4j
public class PersonService {
    public void validatePerson(@Valid Person person){
        log.info("service方法验证");
    }
}
