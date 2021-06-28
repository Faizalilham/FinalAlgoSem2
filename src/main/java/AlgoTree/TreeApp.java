package AlgoTree;
public class TreeApp {
    public static void main(String[] args) {
        Tree binding;
        binding = new Tree();
        TreeNode node;
        
        node = new TreeNode(60);
        binding.insert(node);
        
        node = new TreeNode(40);
        binding.insert(node);
        
        node = new TreeNode(30);
        binding.insert(node);
        
        node = new TreeNode(50);
        binding.insert(node);
        
        node = new TreeNode(80);
        binding.insert(node);
          
    
        System.out.println("\nTraversal dengan Inorder : " );
        binding.inOrder();
        System.out.println("\nTraversal dengan Preorder : ");
        binding.preOrder();
        System.out.println("\nTraversal dengan Postorder : " );
        binding.postOrder();
       
        System.out.println();
        System.out.println("Hai Faizal");
    }
}
