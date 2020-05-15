package com.androidstudio.demosmd;

import android.app.Application;

import com.androidstudio.demosmd.models.User;


public class UserClient extends Application {

    private User user = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
