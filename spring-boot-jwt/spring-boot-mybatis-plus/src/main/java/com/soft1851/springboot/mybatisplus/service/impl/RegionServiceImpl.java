package com.soft1851.springboot.mybatisplus.service.impl;

import com.soft1851.springboot.mybatisplus.entity.Region;
import com.soft1851.springboot.mybatisplus.mapper.RegionMapper;
import com.soft1851.springboot.mybatisplus.service.RegionService;
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
public class RegionServiceImpl extends ServiceImpl<RegionMapper, Region> implements RegionService {

}
