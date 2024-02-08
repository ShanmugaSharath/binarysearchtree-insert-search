public class BinarySerachTree
{
    Node root;
    class Node
    {
        int data;
        Node left,right;
        public int key;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    public BinarySerachTree(int data)
    {
        root=new Node(data);
    } 
    
    public void insertleft(Node n,int val)
    {
        Node newNode=new Node(val);
        n.left=newNode;

    }
    public void insertright(Node n,int val)
    {
        Node newNode=new Node(val);
        n.right=newNode;
    }
    public static void preorder(Node root)
    {
        if(root!=null)
        {
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        }
    }
    public static void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
           System.out.print(root.data+" ");
           inorder(root.right);
        }
    }
    public static void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
 /*   public void insert(Node root,int val)
    {
        if(root==null)
        {
           root = new Node(val);
        }
        else if(val<root.data)
        {
            insert(root.left,val);
        }
        else
        {
            insert(root.right,val);
        }
    }
    */
    public  Node insert(Node root,int val)
    {
        if(root==null)
        {
            return new Node(val);
        }
        else if(val<root.data)
        {
            root.left=insert(root.left,val);
        }
        else
        {
            root.right=insert(root.right,val);
        }
        return root;
    }
    public Node search(Node root,int val)
    {
         //   if(val==root.data || root==null )
         if(root == null || root.data == val)
            {
                return root; 
            }
         if(val<root.data)
            
                return search(root.left,val);
        
               return  search(root.right,val);
        
           
    }
    
}