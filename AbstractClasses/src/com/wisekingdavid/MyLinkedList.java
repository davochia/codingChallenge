package com.wisekingdavid;

public class SearchTree implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public MyLinkedList() {
        super();
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newiItem) {
        if (this.root == null){
            this.root = newiItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int compare = (currentItem.compareTo((newiItem)));
            if (compare < 0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    currentItem.setNext(newiItem).setPrevious(currentItem);
                    return true;
                }
            }else if(compare > 0){
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newiItem).setPrevious(currentItem.previous());
                    newiItem.setNext(currentItem).setPrevious(newiItem);
                }else{
                    newiItem.setNext(this.root).setPrevious(newiItem);
                    this.root = newiItem;
                }
                return true;

            }
            else {
                System.out.println(newiItem.getObjectValue() + " is already present, not added.");
                return false;
            }
        }return false;

    }

    @Override
    public boolean removeItem(ListItem itemToRemove) {
        if (itemToRemove != null){
            System.out.println("Deleting " + itemToRemove.getObjectValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int compare = (currentItem.compareTo((itemToRemove)));
            if (compare == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if(compare < 0){
                currentItem = currentItem.next();
            }else {
                return false;
            }
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if (root == null){
            System.out.println("This list is empty");
        }else{
            while (root != null){
                System.out.println(root.getObjectValue());
                root = root.next();
            }
        }
    }
}
