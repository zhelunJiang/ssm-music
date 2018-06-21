package com.mine.music.copy;

import com.mine.music.entity.TbTag;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbTagMapper extends Mapper<TbTag> {
    @Select("select * from tb_tag where id in (select tb_music_tag_relation.tag_id from tb_music_tag_relation where music_id=#{music_id})")
    public List<TbTag> getTagsByMusicId(String music_id);
}