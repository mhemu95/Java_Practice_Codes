package com.company;

public class Window {

    private int count;
    private String size;

    public Window(int count, String size) {
        this.count = count;
        this.size = size;
    }

    public void windowStatus(){
        System.out.println("Window is closed");
    }

    public int getCount() {
        return count;
    }

    public String getSize() {
        return size;
    }
}
