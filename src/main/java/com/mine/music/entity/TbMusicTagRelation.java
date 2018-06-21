package com.mine.music.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`tb_music_tag_relation`")
public class TbMusicTagRelation {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private String id;

    @Column(name = "`musicid`")
    private String musicid;

    @Column(name = "`tagid`")
    private String tagid;

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
     * @return tagid
     */
    public String getTagid() {
        return tagid;
    }

    /**
     * @param tagid
     */
    public void setTagid(String tagid) {
        this.tagid = tagid;
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