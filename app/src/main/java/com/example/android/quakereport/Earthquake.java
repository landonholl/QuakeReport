package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {

private double mMagnitude;
private String mLocation;
private long mTime;
private String mUrl;

    public Earthquake(double magnitude, String location, long time, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTime = time;
        mUrl = url;

    }

    public double getMagnitude() {return mMagnitude;}
    public String getLocation() {return mLocation;}
    public String getTime() {
        Date date=new Date(mTime);
        SimpleDateFormat df2 = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        String dateText = df2.format(date);
        return dateText; }
    public String getUrl() {return mUrl;}
}
