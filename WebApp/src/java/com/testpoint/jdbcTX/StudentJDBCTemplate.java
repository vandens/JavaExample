
package com.testpoint.jdbcTX;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author TP32447
 */
public class StudentJDBCTemplate implements StudentDAO{
    private JdbcTemplate jdbcTemplateObject;
    
    @Override
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void create(String name, Integer age, Integer marks, Integer year){
        
        try{
            String SQL1     = "INSERT INTO student (name, age) VALUES (?,?)";
            jdbcTemplateObject.update(SQL1,name,age);
            
            //get latest student id
            String SQL2     = "SELECT MAX(id) FROM student";
            int sid         = jdbcTemplateObject.queryForInt(SQL2);
            
            String SQL3     = "INSERT INTO marks(sid, marks, year)"
                            + " VALUES (?,?,?)";
            jdbcTemplateObject.update(SQL3,sid,marks,year);
            
            System.out.println("Created Name = "+name+", Age = "+age);
            
            throw new RuntimeException("Simulate error condition");
        }catch(DataAccessException e){
            System.out.println("Error in creating record, rolling back.");
            throw e;
        }
    }
    
    public List<StudentMarks> listStudents(){
        String SQL  = "SELECT * FROM student, marks WHERE student.id = marks.id";
        List<StudentMarks> studentMarks = jdbcTemplateObject.query(SQL, new StudentMarksMapper());
        return studentMarks;
    }
}
