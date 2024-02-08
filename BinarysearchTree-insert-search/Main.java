public class Main {
    public static void main(String[] args) {
        BinarySerachTree b=new BinarySerachTree(50);
        b.insert(b.root, 20);
        b.insert(b.root,70);
        b.insert(b.root,10);
        b.insert(b.root,25);
        b.insert(b.root,60);
        b.insert(b.root,90);
        b.inorder(b.root);
        if(b.search(b.root,95)==null)
        {
            System.out.print("Not Found");
        }
        else
        {
            System.out.print("Found");
        }
      
     }
}















/*b.insertleft(b.root,5);
        b.insertright(b.root,15);
        b.insertleft(b.root.left,3);
        b.insertright(b.root.left,8);
        b.insertleft(b.root.right,12);
        b.preorder(b.root);//preorder traversal
        System.out.println();
        b.inorder(b.root);//inorder traversal
        System.out.println();
        b.postorder(b.root);//postorder traversal
        System.out.println(); */