package Udemy.CompleteJavaMasterclass.InnerClass.AbstractionChallange;

public class MyLinkedList implements INodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return null;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    item.serPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item);
                    item.serPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.serPrevious(item);
            } else {
                item.setNext(this.root);
                this.root.serPrevious(item);
                this.root = item;
            }
            return true;
        } else {
            System.out.println(item.getValue() + " is present in the list");
        }
    }
    return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null){
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if (comparison == 0){
                if (currentItem == this.root){
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null){
                        currentItem.next().serPrevious(currentItem.previous());

                    }
                }
                return true;
            } else if (comparison < 0){
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            while (root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
