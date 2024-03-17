package com.kodilla.stream.forumuser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        List<ForumUser> users = forum.getList();

        Map<Integer, ForumUser> userMap = users.stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> user.getDateOfBirth().getYear() <= 2003)
                .filter(user -> user.getQuantityOfPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        userMap.forEach((userId, user) -> System.out.println("User ID: " + userId + ", User: " + user));
    }
}
