package ro.sciit.generics.homework;

import java.util.ArrayList;
import java.util.List;

public class Utils<T extends Comparable<T>>{

    private List<T> elementsSortedAscending = new ArrayList<T>();
    private List<T> elementsSortedDescending = new ArrayList<T>();

    /**
     * Recursive method that traverses the tree in order to produce an ascending sorted tree
     * @param receivedPointer Node type element
     * @return an ascending sorted List of Nodes type objects
     */
    public List<T> getSortedTreeAscending(BinaryTree tree, BinaryTree.Node receivedPointer) {
        BinaryTree.Node pointer;
        pointer = receivedPointer;
        if ((pointer.getLeftchild() != null) && (pointer != getMin(tree))) {
            getSortedTreeAscending(tree, pointer.getLeftchild());
        }
        elementsSortedAscending.add((T) pointer.getValue());
        if ((pointer.getRighchild() != null) && (pointer != getMax(tree))) {
            getSortedTreeAscending(tree, pointer.getRighchild());
        }
        return elementsSortedAscending;
    }


    /**
     * Recursive method that traverses the tree in order to produce an descending sorted tree
     * @param receivedPointer Node type element representing the pointer from which the traversal is started
     * @return a descending sorted List of Nodes type objects
     */
    public List<T> getSortedTreeDescending(BinaryTree tree, BinaryTree.Node receivedPointer) {
        BinaryTree.Node pointer;
        pointer = receivedPointer;
        if ((pointer.getRighchild() != null) && (pointer != getMax(tree))) {
            getSortedTreeDescending(tree, pointer.getRighchild());
        }
        elementsSortedDescending.add((T) pointer.getValue());
        if ((pointer.getLeftchild() != null) && (pointer != getMin(tree))) {
            getSortedTreeDescending(tree, pointer.getLeftchild());
        }
        return elementsSortedDescending;
    }

    /**
     * @param tree Represents the binary tree from which the minimum value is extracted
     * @return the node which contains the minimum value
     */
    private BinaryTree.Node getMin(BinaryTree tree) {
        BinaryTree.Node left = tree.getRoot();
        while (left.getLeftchild() != null) {
            left = left.getLeftchild();
        }
        return left;
    }

    /**
     * @param tree Represents the binary tree from which the maximum value is extracted
     * @return the node which contains the maximum value
     */
    private BinaryTree.Node getMax(BinaryTree tree) {
        BinaryTree.Node right = tree.getRoot();
        while (right.getRighchild() != null) {
            right = right.getRighchild();
        }
        return right;
    }
}
