package ro.sciit.generics.homework;

public class Main {

    public static void main(String[] args) {

        BinaryTree<Integer> t1 = new BinaryTree<Integer>();
        t1.addNode(5, t1.getRoot());
        t1.addNode(4, t1.getRoot());
        t1.addNode(7, t1.getRoot());
        t1.addNode(2, t1.getRoot());
        t1.addNode(11, t1.getRoot());
        t1.addNode(14, t1.getRoot());
        t1.addNode(6, t1.getRoot());
        t1.addNode(8, t1.getRoot());
        t1.addNode(17, t1.getRoot());
        Utils t3 = new Utils();
        System.out.println(t3.getSortedTreeAscending(t1, t1.getRoot()));
        System.out.println(t3.getSortedTreeDescending(t1, t1.getRoot()));

        //String
        BinaryTree<String> t2 = new BinaryTree<String>();
        t2.addNode("a", t2.getRoot());
        t2.addNode("b", t2.getRoot());
        t2.addNode("e", t2.getRoot());
        t2.addNode("c", t2.getRoot());
        t2.addNode("d", t2.getRoot());
        t2.addNode("h", t2.getRoot());
        t2.addNode("f", t2.getRoot());
        t2.addNode("g", t2.getRoot());
        Utils t4 = new Utils();
        System.out.println(t4.getSortedTreeAscending(t2, t2.getRoot()));
        System.out.println(t4.getSortedTreeDescending(t2, t2.getRoot()));


        Utils t6 = new Utils();
        BinaryTree<Example> t5 = new BinaryTree<Example>();
        t5.addNode(new Example("One", 1), t5.getRoot());
        t5.addNode(new Example("Three", 3), t5.getRoot());
        t5.addNode(new Example("Five", 5), t5.getRoot());
        t5.addNode(new Example("Two", 2), t5.getRoot());
        t5.addNode(new Example("Four", 4), t5.getRoot());
        System.out.println(t6.getSortedTreeAscending(t5, t5.getRoot()));
        System.out.println(t6.getSortedTreeDescending(t5, t5.getRoot()));
    }
}

