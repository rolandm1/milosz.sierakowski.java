package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Java";
    private static final String DESCRIPTION = "Java course";


    @Test
    void testTaskDaoFindByDuration() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListDao.findByListName(listName);

        //Then
        assertEquals(1, readTasksList.size());

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.deleteById(id);
    }

}
