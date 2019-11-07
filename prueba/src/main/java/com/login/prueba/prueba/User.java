package com.login.prueba.prueba;

/**
 * User
 */
public class User {
    private String id;
    private String email;
    private String completeName;
    private String firstName;
    private String lastName;
    private String profileImage;
    private String tokenType;
    private String tokenValue;


    public User() {
    }

    public User(String id, String email, String completeName, String firstName, String lastName, String profileImage, String tokenType, String tokenValue) {
        this.id = id;
        this.email = email;
        this.completeName = completeName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profileImage = profileImage;
        this.tokenType = tokenType;
        this.tokenValue = tokenValue;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompleteName() {
        return this.completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfileImage() {
        return this.profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getTokenValue() {
        return this.tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public User id(String id) {
        this.id = id;
        return this;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public User completeName(String completeName) {
        this.completeName = completeName;
        return this;
    }

    public User firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User profileImage(String profileImage) {
        this.profileImage = profileImage;
        return this;
    }

    public User tokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    public User tokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
        return this;
    }
    
}