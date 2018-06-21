package com.mine.music.service;

import com.mine.music.entity.TbAlbum;
import com.mine.music.entity.TbMusic;
import com.mine.music.entity.TbSinger;
import com.mine.music.mapper.TbMusicMapper;
import com.mine.music.vo.MusicVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicService extends BaseService<TbMusic> {

    @Autowired
    private SingerService singerService;
    @Autowired
    private AlbumService albumService;
    @Autowired
    private TbMusicMapper tbMusicMapper;


    //用业务进行多表查询
    public List<MusicVo> getAll(){
        List<TbMusic> list = this.queryAll();
        List<MusicVo> voList = new ArrayList<MusicVo>();
        /* BeanUtils.copyProperties(list,voList);*/
        for(TbMusic item:list){
            TbSinger singer = singerService.getOne(item.getSingerid());
            TbAlbum album = albumService.getOne(item.getAlbumid());
            MusicVo musicVo = new MusicVo();
            BeanUtils.copyProperties(item,musicVo);
            System.out.println("item"+ item);
            System.out.println(musicVo);
            musicVo.setSimg(singer.getImg());
            musicVo.setSname(singer.getName());
            musicVo.setAimg(album.getImg());
            musicVo.setAname(album.getName());
            System.out.println("musicVo为:"+ musicVo);
            voList.add(musicVo);
        }
        return voList;
    }
    public TbMusic getVo(String id){
        TbMusic musicVo = tbMusicMapper.getMusicVoById(id);
        return musicVo;
    }

}
