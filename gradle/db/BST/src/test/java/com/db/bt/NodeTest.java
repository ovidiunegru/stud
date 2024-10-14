package test.java.com.db.bt;

import main.java.com.db.bt.model.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {

    private BinaryTree tree;

    @BeforeEach
    void setUp() {
        tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(10);
        tree.insert(11);
    }

    @Test
    void getMaxTest() {
        assertEquals(11, this.tree.getMax());
    }

    @Test
    void calculateDepthTest() {
        assertEquals(3, this.tree.calculateDepth());
    }

    @Test
    void testCalculateDepthEmptyTree() {
        BinaryTree tree = new BinaryTree();
        assertEquals(0, tree.calculateDepth());
    }

    @Test
    void oneNodeTest() {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);

        assertEquals(10, tree.getMax());
        assertEquals(1, tree.calculateDepth());
    }
}