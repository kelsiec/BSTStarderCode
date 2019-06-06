public class Tree<E extends Comparable<E>> {
    public Node<E> root;

    public Node<E> search(E data) {
        return search(this.root, data);
    }

    public Node<E> search(Node<E> node, E data) {
        if (node == null || node.data.equals(data)) {
            return node;
        } else if (node.data.compareTo(data) > 0) {
            return search(node.left, data);
        } else {
            return search(node.right, data);
        }
    }

    public void insert(E data) {
        insert(this.root, data);
    }

    public Node<E> insert(Node<E> node, E data) {
        if (node == null) {
            return new Node<>(data);
        } else if (node.data.compareTo(data) > 0) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }

        return node;
    }

    public void deleteValue(E value) {
        deleteValue(root, value);
    }

    public Node<E> deleteValue(Node<E> node, E value) {
        if (node != null) {
            if (node.data.equals(value)) {
                if (node.left == null) {
                    return node.right;
                } else if (node.right == null){
                    return node.left;
                } else {
                    Node<E> result = findMax(node.left);
                    node.data = result.data;
                    deleteValue(node.left, result.data);
                    return result;
                }

            } else if (node.data.compareTo(value) > 0) {
                node.left = deleteValue(node.left, value);
            } else {
                node.right = deleteValue(node.right, value);
            }
        }
        return node;

    }

    private Node<E> findMax(Node<E> subtree) {
        // return the maximum value in this subtree
    }

}