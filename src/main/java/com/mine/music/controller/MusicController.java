package com.mine.music.controller;

import com.mine.music.entity.TbMusic;
import com.mine.music.service.MusicService;
import com.mine.music.utils.WriteJson;
import com.mine.music.vo.MusicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@RequestMapping("music-manager/music")
public class MusicController extends BaseController<TbMusic> {
    @Autowired
    private MusicService musicService;

    @RequestMapping("getList")
    @ResponseBody
    public WriteJson getMusicVoList(){
        List<MusicVo> list =musicService.getAll();
        return new WriteJson(list);
    }

    @RequestMapping("getVo")
    @ResponseBody
    public WriteJson getMusicVo(String id){
        TbMusic musicVo = musicService.getVo(id);
        System.out.println(musicVo);
        return new WriteJson(musicVo);
    }
}
