package com.mine.music.service;

import com.mine.music.entity.TbAlbum;
import com.mine.music.entity.TbMusic;
import com.mine.music.entity.TbSinger;
import com.mine.music.mapper.TbMusicMapper;
import com.mine.music.mapper.TbSingerMapper;
import com.mine.music.vo.MusicVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowHomeService {
    @Autowired
    private TbMusicMapper tbMusicMapper;
    @Autowired
    private SingerService singerService;
    @Autowired
    private AlbumService albumService;
    @Autowired
    private TbSingerMapper tbSingerMapper;

    public List<MusicVo> getHotSongList(Integer count){
        List<TbMusic> list = tbMusicMapper.getSongsByClickRank(count);
        List<MusicVo> voList = new ArrayList<MusicVo>();
        /* BeanUtils.copyProperties(list,voList);*/
        for(TbMusic item:list){
            TbSinger singer = singerService.getOne(item.getSingerid());
            TbAlbum album = albumService.getOne(item.getAlbumid());
            MusicVo musicVo = new MusicVo();
            BeanUtils.copyProperties(item,musicVo);
            musicVo.setSimg(singer.getImg());
            musicVo.setSname(singer.getName());
            musicVo.setAimg(album.getImg());
            musicVo.setAname(album.getName());
            System.out.println("musicVo为:"+ musicVo);
            voList.add(musicVo);
        }
        return voList;
    }
    public List<TbSinger> getHotSingerList(Integer count){
        List<TbSinger> list = tbSingerMapper.getSingersByClickRank(count);
        return list;
    }
    public List<TbMusic> getNewSongs(Integer count){
        return tbMusicMapper.getSongsByClickRank(count);
    }

}
