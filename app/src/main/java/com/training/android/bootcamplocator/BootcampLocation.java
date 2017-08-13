package com.training.android.bootcamplocator;

/**
 * Created by Dyste on 8/13/2017.
 */

public class BootcampLocation {

    private String Title, Snippet;
    private Double Lat, Lng;

    public BootcampLocation(String title, String snippet, Double lat, Double lng) {
        Title = title;
        Snippet = snippet;
        Lat = lat;
        Lng = lng;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSnippet() {
        return Snippet;
    }

    public void setSnippet(String snippet) {
        Snippet = snippet;
    }

    public Double getLat() {
        return Lat;
    }

    public void setLat(Double lat) {
        Lat = lat;
    }

    public Double getLng() {
        return Lng;
    }

    public void setLng(Double lng) {
        Lng = lng;
    }
}
