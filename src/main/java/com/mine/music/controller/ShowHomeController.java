package com.mine.music.controller;

import com.mine.music.entity.TbMusic;
import com.mine.music.entity.TbSinger;
import com.mine.music.service.MusicService;
import com.mine.music.service.ShowHomeService;
import com.mine.music.utils.WriteJson;
import com.mine.music.vo.MusicVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Controller
@RequestMapping("nice-music/home")
public class ShowHomeController {
    @Autowired
    private ShowHomeService showHomeService;
    @Autowired
    private MusicService musicService;

    @RequestMapping("getHotSongs")
    @ResponseBody
    public List<MusicVo> showHotMusic() {
        Integer count = 10;
        List<MusicVo> list = showHomeService.getHotSongList(count);
        return list;
    }
    @RequestMapping("getHotSingers")
    @ResponseBody
    public List<TbSinger> showHotSinger(){
        Integer count = 6;
        List<TbSinger> list = showHomeService.getHotSingerList(count);
        return  list;
    }
    @RequestMapping("getCarouselItems")
    @ResponseBody
    public List<TbMusic> showNewSongs(){
        Integer count = 6;
        List<TbMusic> list = showHomeService.getNewSongs(count);
        return  list;
    }
    @RequestMapping("getVo")
    @ResponseBody
    public WriteJson getMusicVo(String id){
        TbMusic musicVo = musicService.getVo(id);
        System.out.println(musicVo);
        return new WriteJson(musicVo);
    }

}
