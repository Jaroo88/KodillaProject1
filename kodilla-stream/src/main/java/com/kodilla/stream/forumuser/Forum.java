package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> users = new ArrayList<>();

    public Forum() {

        users.add(new ForumUser(1, "Adam", 'M', LocalDate.of(1998,2,15), 15));
        users.add(new ForumUser(2, "Justyna", 'F',LocalDate.of(1992,9,5), 25));
        users.add(new ForumUser(3, "Daniel", 'M',LocalDate.of(1997,3,21), 10));
        users.add(new ForumUser(4, "Dominika", 'F',LocalDate.of(2002,11,25), 33));
        users.add(new ForumUser(5, "Agnieszka", 'F',LocalDate.of(1994,7,12), 5));
    }
    public List<ForumUser>getList(){
        return new ArrayList<>(users);
    }
}
