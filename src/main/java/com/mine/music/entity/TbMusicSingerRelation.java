package com.mine.music.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`tb_music_singer_relation`")
public class TbMusicSingerRelation {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private String id;

    @Column(name = "`musicid`")
    private String musicid;

    @Column(name = "`singerid`")
    private String singerid;

    @Column(name = "`create`")
    private Date create;

    @Column(name = "`update`")
    private Date update;

    @Column(name = "`dr`")
    private Integer dr;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return musicid
     */
    public String getMusicid() {
        return musicid;
    }

    /**
     * @param musicid
     */
    public void setMusicid(String musicid) {
        this.musicid = musicid;
    }

    /**
     * @return singerid
     */
    public String getSingerid() {
        return singerid;
    }

    /**
     * @param singerid
     */
    public void setSingerid(String singerid) {
        this.singerid = singerid;
    }

    /**
     * @return create
     */
    public Date getCreate() {
        return create;
    }

    /**
     * @param create
     */
    public void setCreate(Date create) {
        this.create = create;
    }

    /**
     * @return update
     */
    public Date getUpdate() {
        return update;
    }

    /**
     * @param update
     */
    public void setUpdate(Date update) {
        this.update = update;
    }

    /**
     * @return dr
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * @param dr
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }
}