package com.mine.music.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`tb_music`")
public class TbMusic {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "`singerid`")
    private String singerid;

    @Column(name = "`albumid`")
    private String albumid;

    @Column(name = "`click`")
    private Integer click;

    @Column(name = "`img`")
    private String img;

    @Column(name = "`path`")
    private String path;

    @Column(name = "`collect`")
    private Integer collect;

    @Column(name = "`search`")
    private Integer search;

    @Column(name = "`lyc`")
    private String lyc;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * @return albumid
     */
    public String getAlbumid() {
        return albumid;
    }

    /**
     * @param albumid
     */
    public void setAlbumid(String albumid) {
        this.albumid = albumid;
    }

    /**
     * @return click
     */
    public Integer getClick() {
        return click;
    }

    /**
     * @param click
     */
    public void setClick(Integer click) {
        this.click = click;
    }

    /**
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return collect
     */
    public Integer getCollect() {
        return collect;
    }

    /**
     * @param collect
     */
    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    /**
     * @return search
     */
    public Integer getSearch() {
        return search;
    }

    /**
     * @param search
     */
    public void setSearch(Integer search) {
        this.search = search;
    }

    /**
     * @return lyc
     */
    public String getLyc() {
        return lyc;
    }

    /**
     * @param lyc
     */
    public void setLyc(String lyc) {
        this.lyc = lyc;
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