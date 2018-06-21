package com.mine.music.utils;

import java.util.UUID;

public class Upload{
    private String defaultSingerImgUrl;
    private String defaultUserImgUrl;
    private String defaultMusicImgUrl;
    private String defaultAlbumImgUrl;
    private String lycFilePath;
    private String imgName;
    private String uploadPath;

    public String getUUID(){
        String uuid = UUID.randomUUID().toString().replace("-","");
         return uuid;
    }
}
