package com.kodilla.stream.forumuser;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char gender;
    private final int yearOfBirth;
    private final int quantityOfPosts;
    public ForumUser(final int userId, final String userName, final char gender, final int yearOfBirth, final int quantityOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.quantityOfPosts = quantityOfPosts;
    }

    public int getUserId() {
        return userId;
    }
    public String getUserName(){
        return userName;
    }
    public char getGender() {
        return gender;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + yearOfBirth +
                ", quantityOfPosts=" + quantityOfPosts +
                '}';
    }
}
