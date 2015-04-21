/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liqkwidb;

import java.sql.Date;

/**
 *
 * @author manuel
 */
public class DatabaseChangeLog {
    private String id;
    private String author;
    private String filename;
    private Date dateExecuted;
    private int orderExecuted;
    private String execType;
    private String md5Sum;
    private String description;
    private String comments;
    private String tag;
    private String liquibase;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getDateExecuted() {
        return dateExecuted;
    }

    public void setDateExecuted(Date dateExecuted) {
        this.dateExecuted = dateExecuted;
    }

    public int getOrderExecuted() {
        return orderExecuted;
    }

    public void setOrderExecuted(int orderExecuted) {
        this.orderExecuted = orderExecuted;
    }

    public String getExecType() {
        return execType;
    }

    public void setExecType(String execType) {
        this.execType = execType;
    }

    public String getMd5Sum() {
        return md5Sum;
    }

    public void setMd5Sum(String md5Sum) {
        this.md5Sum = md5Sum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getLiquibase() {
        return liquibase;
    }

    public void setLiquibase(String liquibase) {
        this.liquibase = liquibase;
    }

    public DatabaseChangeLog() {
    }
}
