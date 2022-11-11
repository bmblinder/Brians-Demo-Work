// --== CS400 File Header Information ==--
// Name: Brian Blinder
// Email: bblinder@wisc.edu
// Team: KC
// TA: Keren Chen
// Lecturer: Gary Dahl
// Notes to Grader: N/A

import org.junit.Test;
import static org.junit.Assert.*;

public class TestRedBlackTree {


  /**
   * Test whether the inserting onto a black node will produce the correct order in the tree
   */
  @Test
  public void testInsertBlackParent() {
    RedBlackTree test = new RedBlackTree();

    test.insert(50);
    test.insert(45);

    if (!test.root.toString().equals("[50, 45]") && test.root.isBlack == true
        && test.root.leftChild.isBlack == false) {
      fail("InsertBlackParent Test 1 Doesn't work ");
    }

    test.insert(70);

    if (!test.root.toString().equals("[50, 45, 70]") && test.root.isBlack == true
        && test.root.leftChild.isBlack == false && test.root.rightChild.isBlack == false) {
      fail("InsertBlackParent Test 2 Doesn't work ");
    }
  }

  /**
   * Test whether the inserting onto a parent node that is red and is the same side as the
   * child(RR/LL), whilst the parent's sibling is black/null will produce the correct order in the
   * tree
   */
  @Test
  public void testInsertSameSideRedParentBlackSibling() {
    RedBlackTree test = new RedBlackTree();

    test.insert(50);
    test.insert(25);
    test.insert(12);

    if (!test.root.toString().equals("[25, 12, 50]") && test.root.isBlack == true
        && test.root.leftChild.isBlack == false && test.root.rightChild.isBlack == false) {
      fail("InsertSameSideRedParentBlackSibling Test 1 Doesn't work ");
    }

    RedBlackTree test2 = new RedBlackTree();

    test2.insert(50);
    test2.insert(75);
    test2.insert(87);

    if (!test2.root.toString().equals("[75, 50, 87]") && test2.root.isBlack == true
        && test2.root.leftChild.isBlack == false && test2.root.rightChild.isBlack == false) {
      fail("InsertSameSideRedParentBlackSibling Test 2 Doesn't work ");
    }
  }

  /**
   * Test whether the inserting onto a parent node that is red and is the opposite side as the
   * child(RL/LR), whilst the parent's sibling is black/null will produce the correct order in the
   * tree
   */
  @Test
  public void testInsertDiffSideRedParentBlackSibling() {
    RedBlackTree test = new RedBlackTree();

    test.insert(50);
    test.insert(25);
    test.insert(37);

    if (!test.root.toString().equals("[37, 25, 50]") && test.root.isBlack == true
        && test.root.leftChild.isBlack == false && test.root.rightChild.isBlack == false) {
      fail("InsertDiffSideRedParentBlackSibling Test 1 Doesn't work ");
    }

    RedBlackTree test2 = new RedBlackTree();

    test2.insert(50);
    test2.insert(75);
    test2.insert(63);

    if (!test2.root.toString().equals("[63, 50, 75]") && test2.root.isBlack == true
        && test2.root.leftChild.isBlack == false && test2.root.rightChild.isBlack == false) {
      fail("InsertDiffSideRedParentBlackSibling Test 2 Doesn't work ");
    }
  }

  /**
   * Test whether the inserting onto a parent node that is red and parent node's sibling node is red
   * will produce the correct order in the tree
   */
  @Test
  public void testInsertRedParentRedSibling() {
    RedBlackTree test = new RedBlackTree();

    test.insert(50);
    test.insert(25);
    test.insert(75);
    test.insert(12);
    
  //tests a the red parent-red parent sibling case in a height = 1
    if (!test.root.toString().equals("[50, 25, 75, 12]") && test.root.isBlack == true
        && test.root.leftChild.isBlack == true && test.root.rightChild.isBlack == true
        && test.root.leftChild.leftChild.isBlack == false) {
      fail("InsertRedParentRedSibling Test 1 Doesn't work ");
    }

    test.insert(37);
    test.insert(6);
    
    //tests a the red parent-red parent sibling case in a height > 1
    if (!test.root.toString().equals("[50, 25, 75, 12, 37, 6]") && test.root.isBlack == true
        && test.root.leftChild.isBlack == false && test.root.rightChild.isBlack == false
        && test.root.leftChild.leftChild.isBlack == true
        && test.root.leftChild.rightChild.isBlack == true
        && test.root.leftChild.leftChild.leftChild.isBlack == false) {
      fail("InsertRedParentRedSibling Test 2 Doesn't work ");
    }

  }
}
