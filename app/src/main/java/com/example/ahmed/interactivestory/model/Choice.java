package com.example.ahmed.interactivestory.model;

/**
 * Created by Ahmed on 2/1/2016.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
