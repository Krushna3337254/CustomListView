package com.example.krushnanrathod.customlistview;

class Item {
    String imageName;
    int imgNo;                                      //studio stores images as integers
    public Item(String imageName, int imgNo) {
    this.imageName=imageName;
    this.imgNo=imgNo;
    }
    public String getImageName(){
        return imageName;
    }
    public int getImgNo(){
        return imgNo;
    }
}
