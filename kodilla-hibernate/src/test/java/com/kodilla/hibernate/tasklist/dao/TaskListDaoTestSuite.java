package com.kodilla.hibernate.tasklist.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @AfterEach
    public void cleanUp() {
        taskListDao.deleteAll();
    }

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList = new TaskList("Test List", "Testing findByListName");
        taskListDao.save(taskList);

        // When
        List<TaskList> readTaskLists = taskListDao.findByListName("Test List");

        // Then
        assertEquals(1, readTaskLists.size());
        assertEquals("Test List", readTaskLists.get(0).getListName());
        assertEquals("Testing findByListName", readTaskLists.get(0).getDescription());
    }
}
