package com.mine.music.copy;

import com.mine.music.entity.TbMusic;
import com.mine.music.vo.MusicVo;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface TbMusicMapper extends Mapper<TbMusic> {
    @Select("select tb_music.*,tb_album.name as aname,tb_album.img as aimg,tb_singer.name " +
            "as sname,tb_singer.img as simg from tb_singer,tb_music,tb_album where tb_music.id = #{id} and tb_music.singerid = tb_singer.id and tb_album.id = tb_music.albumid;")
    MusicVo getMusicVoById(String id);
}