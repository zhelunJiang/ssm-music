package com.mine.music.service;


import com.mine.music.entity.TbTag;
import com.mine.music.mapper.TbMusicTagRelationMapper;
import com.mine.music.mapper.TbTagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService extends BaseService<TbTag> {

    @Autowired
    private TbTagMapper mapper;

    public List<TbTag> getListByMusicId(String id){

       /* TbMusicTagRelation tbMusicTagRelation = new TbMusicTagRelation();
        tbMusicTagRelation.setMusicId(id);
        List<TbMusicTagRelation> list = tbMusicTagService.getByEntity(tbMusicTagRelation);
        List<TbTag> tagList = new ArrayList<TbTag>();
        for(TbMusicTagRelation item:list){
        }*/

       return  mapper.getTagsByMusicId(id);
    }
}
