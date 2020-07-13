import org.junit.Test;

import java.util.ArrayList;

public class TestSolution {
    private TreeNode ans;

    public TestSolution() {
        this.ans = null;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;

    }


    public boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean lSon = dfs(root.left, p, q);
        boolean rSon = dfs(root.right, p, q);

        if ((lSon && rSon) || ((root.val == p.val || root.val == q.val)) && (lSon || rSon)) {
            ans = root;
        }

        return lSon || rSon || (root.val == p.val || root.val == q.val);

    }


    public static void main(String[] args) {
        TestSolution testSolution = new TestSolution();

//        TreeNode treeNode = new ArrayList(){3,5,1,6,2,0,8,null,null,7,4};
//
//        System.out.println(testSolution.lowestCommonAncestor(treeNode);


    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}