package com.example.utsmusicplayer.util;

public class SearchIndex {
    private String search;
    private String index;

    public SearchIndex(String search){
        this.search = search;
        this.index = search();
    }

    public String getIndex(){
        return index;
    }

    public String search(){
        return search;
    }
}
