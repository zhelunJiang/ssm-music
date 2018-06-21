package com.mine.music.vo;

import com.mine.music.entity.TbMusic;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

@NameStyle(Style.lowercase)
public class MusicVo extends TbMusic {
    private String sname;
    private String aname;
    private String simg;
    private String aimg;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getSimg() {
        return simg;
    }

    public void setSimg(String simg) {
        this.simg = simg;
    }

    public String getAimg() {
        return aimg;
    }

    public void setAimg(String aimg) {
        this.aimg = aimg;
    }
}
