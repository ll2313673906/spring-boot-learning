package com.soft1851.springboot.mybatisplus.service.impl;

import com.soft1851.springboot.mybatisplus.entity.Student;
import com.soft1851.springboot.mybatisplus.mapper.StudentMapper;
import com.soft1851.springboot.mybatisplus.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhent
 * @since 2020-04-16
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
