
package com.testpoint.jdbcTX;

/**
 *
 * @author TP32447
 */
public class StudentMarks {
    private Integer age;
    private String name;
    private Integer id;
    private Integer marks;
    private Integer year;
    private Integer sid;
    
    public void setAge(Integer param){
        this.age    = param;
    }
    public Integer getAge(){
        return age;
    }
    public void setName(String param){
        this.name   = param;
    }
    public String getName(){
        return name;
    }
    public void setId(Integer param){
        this.id     = param;
    }
    public Integer getId(){
        return id;
    }
    public void setMarks(Integer param){
        this.marks = param;
    }
    public Integer getMarks(){
        return marks;
    }
    public void setYear(Integer param){
        this.year   = param;
    }
    public Integer getYear(){
        return year;
    }
    public void setSid(Integer param){
        this.sid    = param;
    }
    public Integer getSid(){
        return sid;
    }
}
