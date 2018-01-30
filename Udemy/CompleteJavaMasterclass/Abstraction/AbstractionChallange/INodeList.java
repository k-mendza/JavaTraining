package Udemy.CompleteJavaMasterclass.InnerClass.AbstractionChallange;

import java.util.List;

public interface INodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
