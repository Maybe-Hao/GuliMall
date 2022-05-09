package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lh
 * @email 1348114176@qq.com
 * @date 2022-05-08 14:17:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
