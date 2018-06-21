package com.mine.music.controller;

import com.mine.music.entity.TbTag;
import com.mine.music.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("music-manager/tag")
public class TagController extends BaseController<TbTag> {
    @Autowired
    private TagService tagService;

    @RequestMapping("getMusicTags")
    @ResponseBody
    public List<TbTag> getTagsByMusicId(String id){
        return tagService.getListByMusicId(id);
    }
}
