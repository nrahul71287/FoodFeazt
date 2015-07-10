package com.syracuse.android.foodfeast;

import android.app.Application;

/**
 *  This class will save the state across multiple activities and all parts of the application
 *  Created by Sandesh on 7/9/2015.
 */
public class MyApplication extends Application {

    private static ApplicationManager applicationManager;


    public ApplicationManager getApplicationManager() {
        if(applicationManager == null)  {
            applicationManager =  new ApplicationManager();
            return applicationManager;
        }
        else {
            return applicationManager;
        }
    }

    // Singleton class which contains global attributes
    public class ApplicationManager {

        ApplicationManager() {

        }

        private String userName;
        private String email;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setUserName(String name) {
            this.userName = name;
        }

        public String getUserName() {
            return userName;
        }


    }
}

