package com.mine.music.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`tb_admin`")
public class TbAdmin {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private String id;

    @Column(name = "`username`")
    private String username;

    @Column(name = "`password`")
    private String password;

    @Column(name = "`img`")
    private String img;

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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
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