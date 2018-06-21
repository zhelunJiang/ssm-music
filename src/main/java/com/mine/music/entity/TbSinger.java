package com.mine.music.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`tb_singer`")
public class TbSinger {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "`gender`")
    private Byte gender;

    @Column(name = "`img`")
    private String img;

    @Column(name = "`introduction`")
    private String introduction;

    @Column(name = "`click`")
    private Integer click;

    @Column(name = "`search`")
    private Integer search;

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
     * @return gender
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(Byte gender) {
        this.gender = gender;
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
     * @return introduction
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * @param introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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

    @Override
    public String toString() {
        return "TbSinger{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", img='" + img + '\'' +
                ", introduction='" + introduction + '\'' +
                ", click=" + click +
                ", search=" + search +
                ", create=" + create +
                ", update=" + update +
                ", dr=" + dr +
                '}';
    }
}