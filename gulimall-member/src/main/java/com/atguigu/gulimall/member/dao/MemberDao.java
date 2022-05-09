package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lh
 * @email 1348114176@qq.com
 * @date 2022-05-08 18:23:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
