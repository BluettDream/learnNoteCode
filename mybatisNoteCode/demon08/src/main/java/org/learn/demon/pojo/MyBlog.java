package org.learn.demon.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
/**
 * 
 * @TableName myblog
 */
@Data
public class MyBlog implements Serializable {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private Integer views;
}