package com.example.android.miwokapp;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mResouce;

    public Word(String defaultTranslation, String miwokTranslation, int resouce){
        this.mDefaultTranslation =defaultTranslation;
        this.mMiwokTranslation =miwokTranslation;
        this.mResouce = resouce;
    }

    public void setDefaultTranslation(String DefaultTranslation) {
        this.mDefaultTranslation = DefaultTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.mMiwokTranslation = miwokTranslation;
    }

    public void setmResouce(int mResouce) {
        this.mResouce = mResouce;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmResouce() {
        return mResouce;
    }
}