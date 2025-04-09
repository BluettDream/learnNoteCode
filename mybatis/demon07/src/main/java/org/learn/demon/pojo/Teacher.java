package org.learn.demon.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * teacher
 * @author 
 */
@Data
public class Teacher{
    private Integer id;
    private String name;
    private List<Student> students;
}