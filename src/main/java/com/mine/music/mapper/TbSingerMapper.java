package com.mine.music.mapper;

import com.mine.music.entity.TbSinger;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbSingerMapper extends Mapper<TbSinger> {
    @Select("select * from tb_singer where dr = 0 order by click limit 0,#{count}")
    List<TbSinger> getSingersByClickRank(Integer count);
}