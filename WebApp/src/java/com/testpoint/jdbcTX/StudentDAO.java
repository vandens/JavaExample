
package com.testpoint.jdbcTX;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author TP32447
 */
public interface StudentDAO {
    
    /**
     *
     * @param ds
     */
    public void setDataSource(DataSource ds);
    public void create(String name, Integer age, Integer marks, Integer year);
    public List<StudentMarks> listStudents();
    
}

