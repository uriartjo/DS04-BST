import java.util.ArrayList;

public class MyBST<K,V> {

    //true if this symbol table is empty; false otherwise
    public boolean isEmpty() {
        return false;
    }

    //Returns the number of key-value pairs in this symbol table.
    public int size() {
        return 0;
    }

    //true if this symbol table contains key and false otherwise
    public boolean containsKey(K key) {
        return false;
    }

    //true if this symbol table contains value and false otherwise
    public boolean containsValue(V value) {
        return false;
    }

    //the value associated with the given key if the key is in the symbol table and null if the key is not in the symbol table
    public V get(K key) {
        return null;
    }

    //Inserts the specified key-value pair into the symbol table, overwriting the old value with the new value if the symbol table already contains the specified key. Deletes the specified key (and its associated value) from this symbol table if the specified value is null.
    public void put(K key, V val) {

    }

    //Removes the smallest key and associated value from the symbol table.
    public void deleteMin() {

    }


    //Removes the largest key and associated value from the symbol table.
    public void deleteMax() {

    }

    //Removes the specified key and its associated value from this symbol table (if the key is in this symbol table).
    public void delete(K key) {

    }

    //the smallest key in the symbol table
    public K min() {
        return null;
    }

    //the largest key in the symbol table
    public K max() {
        return null;
    }

    //Returns the height of the BST
    public int height() {
        return 0;
    }

    //Returns the BST in Pre Order Traversal
    public ArrayList<Node> preOrderTraversal() {
        return null;
    }


    //Returns the BST in In Order Traversal
    public ArrayList<Node> inOrderTraversal() {
        return null;
    }


    //Returns the BST in Post Order Traversal
    public ArrayList<Node> postOrderTraversal() {
        return null;
    }
}
