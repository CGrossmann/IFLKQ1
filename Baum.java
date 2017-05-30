public class Baum{
    //Attribute
    private BinaryTree<Integer> b1,b2,b3,b4,b5,b6,b7;
    //Konstruktoren
    public Baum(){
        b1 = new BinaryTree<Integer>(7);
        b2 = new BinaryTree<Integer>(10);
        b3 = new BinaryTree<Integer>(6, null, b1);
        b4 = new BinaryTree<Integer>(11, b2, null);
        b5 = new BinaryTree<Integer>(9, b3, b4);
        b6 = new BinaryTree<Integer>(3);
        b7 = new BinaryTree<Integer>(5, b6, b5);
    }

    public void inOrder(BinaryTree<Integer> wurzel){
       if(!wurzel.isEmpty()){
          inOrder(wurzel.getLeftTree());
          System.out.print(wurzel.getContent() + ", ");
          inOrder(wurzel.getRightTree());
       }  
    }
    public void preOrder(BinaryTree<Integer> wurzel){
       if(!wurzel.isEmpty()){
          System.out.print(wurzel.getContent() + ", ");
          preOrder(wurzel.getLeftTree());
          preOrder(wurzel.getRightTree());
       }  
       
    }
    public void postOrder(BinaryTree<Integer> wurzel){
       if(!wurzel.isEmpty()){
          postOrder(wurzel.getLeftTree());
          postOrder(wurzel.getRightTree());
          System.out.print(wurzel.getContent() + ", ");
       }  
    }
    public void postOrderAusgabe(){
      postOrder(b7);
      System.out.println("\n");
    } 
    public void inOrderAusgabe(){
       inOrder(b7);
       System.out.println("\n");
    }
    public void preOrderAusgabe(){
       preOrder(b7);
       System.out.println("\n");
    }
}
