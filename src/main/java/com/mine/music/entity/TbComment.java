package com.mine.music.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`tb_comment`")
public class TbComment {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private String id;

    @Column(name = "`by`")
    private String by;

    @Column(name = "`to`")
    private String to;

    @Column(name = "`content`")
    private String content;

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
     * @return by
     */
    public String getBy() {
        return by;
    }

    /**
     * @param by
     */
    public void setBy(String by) {
        this.by = by;
    }

    /**
     * @return to
     */
    public String getTo() {
        return to;
    }

    /**
     * @param to
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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