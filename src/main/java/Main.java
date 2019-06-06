public class Main {
    public static void main(String[] args) {
        Tree<Integer> testTree = new Tree();

        testTree.root = new Node<>(14);
        testTree.insert(4);
        testTree.insert(15);
        testTree.insert(3);
        testTree.insert(9);
        testTree.insert(7);
        testTree.insert(18);
        testTree.insert(16);
        testTree.insert(20);

        System.out.println(testTree.search(14) != null);
        System.out.println(testTree.search(4) != null);
        System.out.println(testTree.search(15) != null);
        System.out.println(testTree.search(3) != null);
        System.out.println(testTree.search(9) != null);
        System.out.println(testTree.search(7) != null);
        System.out.println(testTree.search(18) != null);
        System.out.println(testTree.search(16) != null);
        System.out.println(testTree.search(20) != null);

        System.out.println("Now false");
        System.out.println(testTree.search(10) != null);
        System.out.println(testTree.search(21) != null);
        System.out.println(testTree.search(0) != null);

    }
}
