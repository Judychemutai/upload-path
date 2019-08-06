package com.example.firebaseproject;

import android.content.Intent;
import android.widget.ImageView;

public class Upload {

    private String mProfileImage;
    private String et_enter_name;
    private int et_enter_phone_number;
    private String et_enter_email;


    public Upload() {

        //empty constructor needed
    }

    public Upload(String mProfileImage, String et_enter_name, int et_enter_phone_number, String et_enter_email) {
        this.mProfileImage = mProfileImage;
        this.et_enter_name = et_enter_name;
        this.et_enter_phone_number = et_enter_phone_number;
        this.et_enter_email = et_enter_email;
    }

    public String getmProfileImage() {
        return mProfileImage;
    }

    public String getEt_enter_name() {
        return et_enter_name;
    }

    public int getEt_enter_phone_number() {
        return et_enter_phone_number;
    }

    public String getEt_enter_email() {
        return et_enter_email;
    }

    public void setmProfileImage(String mProfileImage) {
        this.mProfileImage = mProfileImage;
    }

    public void setEt_enter_name(String et_enter_name) {
        this.et_enter_name = et_enter_name;
    }

    public void setEt_enter_phone_number(int et_enter_phone_number) {
        this.et_enter_phone_number = et_enter_phone_number;
    }

    public void setEt_enter_email(String et_enter_email) {
        this.et_enter_email = et_enter_email;
    }















}
