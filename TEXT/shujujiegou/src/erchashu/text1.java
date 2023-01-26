package erchashu;
//测试
public class text1 {
    public static void main(String[] args) {
        TreeNode<String> a1=new TreeNode<>("A");
        a1.left=new TreeNode<>("B");
        a1.right=new TreeNode<>("E");
        a1.left.left=new TreeNode<>("C");
        a1.left.right=new TreeNode<>("D");
        a1.right.right=new TreeNode<>("F");
        text(a1);
    }
    //前序遍历
    public static void text(TreeNode<String> a1){
        if(a1==null) return;
        System.out.println(a1.t+" ");
        text(a1.left);
        text(a1.right);
    }
    //中序遍历
    public static void text1(TreeNode<String> a1){
        if(a1==null) return;
        text(a1.left);
        System.out.println(a1.t+" ");
        text(a1.right);
    }
    //后序遍历
    public static void text2(TreeNode<String> a1){
        if(a1==null) return;
        text(a1.left);
        text(a1.right);
        System.out.println(a1.t+" ");
    }

}
