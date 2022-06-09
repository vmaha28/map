package com.fastrack;

public class Door {
    private boolean opened = true;
    private boolean locked;



    public Door(boolean opened) {
        this.opened = opened;

    }

    public Door(boolean opened, boolean locked) {
        this.opened = opened;
        if (opened) {
            this.locked = false;
        } else {
            this.locked = locked;
        }


    }

    public boolean isOpened() {
        return opened;
    }
    public void hidefield(){
        int opened = 1;
        System.out.println(this.opened);
    }
    public void closeDoor(){
        if(this.opened==false){
            System.out.println("door is closed");

        }else{
            this.opened=false;
            System.out.println("Close the door");
        }


    }
}
