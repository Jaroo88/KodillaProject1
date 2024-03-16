package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> users = new ArrayList<>();

    public Forum() {

        users.add(new ForumUser(1, "Adam", 'M', 1998, 15));
        users.add(new ForumUser(2, "Justyna", 'F', 1995, 25));
        users.add(new ForumUser(3, "Daniel", 'M', 1997, 10));
        users.add(new ForumUser(4, "Dominika", 'F', 2002, 33));
        users.add(new ForumUser(5, "Agnieszka", 'F', 1994, 5));
    }
    public List<ForumUser>getList(){
        return new ArrayList<>(users);
    }
}
