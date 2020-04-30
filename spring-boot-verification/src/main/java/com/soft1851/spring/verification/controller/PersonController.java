package com.soft1851.spring.verification.controller;

import com.soft1851.spring.verification.entity.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author F*WT
 * @Date 2020/4/30 14:30
 * @Description 验证Controller层输入
 */
@RestController
@RequestMapping("/api")
public class PersonController {

    @PostMapping("/person")
    public ResponseEntity<Person> savePerson(@RequestBody @Valid Person person) {
        return ResponseEntity.ok().body(person);
    }
}
