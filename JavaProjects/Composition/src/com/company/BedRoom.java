package com.company;

public class BedRoom {

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Window window;
    private Door door;

    public BedRoom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Window window, Door door) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.window = window;
        this.door = door;
    }

    public void openDoor(){
        door.doorOn();
    }

    public void IsWindowOpen() {
        window.windowStatus();
    }

    public Window getWindow(){
        return window;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Door getDoor() {
        return door;
    }
}
