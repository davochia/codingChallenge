package com.wisekingdavid;

public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object objectValue;

    public ListItem(Object objectValue) {
        this.objectValue = objectValue;
    }

    public Object getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(Object objectValue) {
        this.objectValue = objectValue;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);
}
