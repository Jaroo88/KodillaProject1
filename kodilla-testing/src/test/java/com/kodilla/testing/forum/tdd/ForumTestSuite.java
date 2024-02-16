package com.kodilla.testing.forum;
import com.kodilla.testing.forum.ForumUser;

import org.junit.jupiter.api.*;


@DisplayName("Forum Test Suite")
public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

        @Test
        void testAddPost () {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

            //When
            forumUser.addPost("mrsmith",
                    "Hello everyone, this is my first contribution here!");

            //Then
            Assertions.assertEquals(1, forumUser.getPostsQuantity());
        }
    }
}
