package com.kodilla.stream.immutable;

public class Application {
    public static void main(String[] args) {
        ForumUser forumUser = new ForumUser("Adam","Kowal");
        ForumUser forumUser1 = new ForumUser("Daniel","Radomski");

        System.out.println(forumUser.getRealName());
        System.out.println(forumUser.getUsername());
        System.out.println(forumUser1.getUsername());
        System.out.println(forumUser1.getRealName());

    }
}
