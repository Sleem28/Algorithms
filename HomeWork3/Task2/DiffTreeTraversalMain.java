//Реализовать несколько обходов дерева. https://en.wikipedia.org/wiki/Tree_traversal
package HomeWork3.Task2;

public class DiffTreeTraversalMain {
    public static void main(String[] args) {
        BTree<String> root = new BTree<String>("F",
                                      new BTree<String>("B",
                                                       new BTree<String>("A"),
                                                       new BTree<String>("D",
                                                                        new BTree<String>("C"),
                                                                        new BTree<String>("E"))),
                                      new BTree<String>("G",
                                                       null,
                                                        new BTree<String>("I",
                                                                         new BTree<String>("H"),
                                                                          null)));

        System.out.print("Pre-order traversal -> ");
        root.preOrderNLR();
        System.out.print("\nPost-order traversal -> ");
        root.postOrderLRN();
        System.out.print("\nIn-order traversal -> ");
        root.inOrderLNR();
        System.out.print("\nReverse pre-order traversal -> ");
        root.reversePreOrderNRL();
        System.out.print("\nReverse post-order traversal -> ");
        root.reversePostOrderRLN();
        System.out.print("\nReverse in-order traversal -> ");
        root.reverseInOrderRNL();
    }
}
