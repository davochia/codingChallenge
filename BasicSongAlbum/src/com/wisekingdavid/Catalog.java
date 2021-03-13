package com.wisekingdavid;

import java.util.ArrayList;

public class  Catalog {
    private String CatalogName;
    private ArrayList<Album> albumList;

    public Catalog(String catalogName) {
        CatalogName = catalogName;
        this.albumList = new ArrayList<Album>();
    }

    public String getCatalogName() {
        return CatalogName;
    }

    public ArrayList<Album> getAlbumList() {
        return albumList;
    }

    public void printAlbum(){
        for (int i = 0; i < this.albumList.size(); i++){
            System.out.println("*** Album: " + this.albumList.get(i).getAlbumName() + " ***");
        }
    }
}
