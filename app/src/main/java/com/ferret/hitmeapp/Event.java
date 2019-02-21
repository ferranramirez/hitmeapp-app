package com.ferret.hitmeapp;

public class Event {
    private String name, description, url, img, startTime, endTime, latitude, longitude;

    public Event(String name, String description, String url, String img, String startTime,
                 String endTime, String latitude, String longitude) {
        put(name, description, url, img, startTime, endTime, latitude, longitude);
    }

    public void put(String name, String description, String url, String img, String startTime,
                    String endTime, String latitude, String longitude) {
        this.name = name;
        this.description = description;
        this.url = url;
        this.img = img;
        this.startTime = startTime;
        this.endTime = endTime;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getImg() {
        return img;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

}

