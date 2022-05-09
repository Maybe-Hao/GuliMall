package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lh
 * @email 1348114176@qq.com
 * @date 2022-05-09 21:47:30
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
