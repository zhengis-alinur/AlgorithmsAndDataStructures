package com.alinur.TreeApp;

public class Tree {
    Node root;
    public Node find(int id){
        Node current = root;
        while (current.id != id){
            if(id < current.id)
                current = current.leftNode;
            else
                current = current.rightNode;
            if(current == null){
                return null;
            }
        }
        return current;
    }
    public void insert(int id, double value){
        Node newNode = new Node(id, value);
        if(root==null){
            root = newNode;
            return;
        }
        Node current = root;
        Node parent;
        while(true){
            parent = current;
            if(id < current.id) // Двигаться налево?
            {
                current = current.leftNode;
                if(current == null) // Если достигнут конец цепочки
                { // вставить слева
                    parent.leftNode = newNode;
                    System.out.println("added to left " + id + " with " + value);
                    return;
                }
            }
            else // Или направо?
            {
                current = current.rightNode;
                if(current == null) // Если достигнут конец цепочки,
                { // вставить справа
                    parent.rightNode = newNode;
                    System.out.println("added to right " + id + " with " + value);
                    return;
                }
            }
        }
    }
    public void inOrder(Node localRoot) {
        if(localRoot != null) {
            inOrder(localRoot.leftNode);
            System.out.print(localRoot.id + " ");
            inOrder(localRoot.rightNode);
        }
    }
    public void delete(int id){
        Node current = root;
        Node parent = root;
        boolean isleft = true;
        while(id!=current.id){
            parent = current;
            if(id > current.id) {
                current = current.rightNode;
                isleft = false;
            }
            if(id < current.id) {
                current = current.leftNode;
                isleft = true;
            }
        }
        System.out.println("Мы нашли " + current.id + " " + current.value);
        if((current.leftNode == null) && (current.rightNode == null) || (current.leftNode != null) && (current.rightNode != null)){
            if(isleft)
                parent.leftNode = null;
            else
                parent.rightNode = null;
        }else if(current.rightNode == null){
            if(isleft)
                parent.leftNode = current.leftNode;
            else
                parent.rightNode = current.leftNode;
        }else{
            if(isleft)
                parent.leftNode = current.rightNode;
            else
                parent.rightNode = current.rightNode;
        }


    }//(ВНИМАНИЕ) если есть/нет одновременно две дочерних узла, то искомый узел удаляется вместе с дочерними. Иначе заменяется на соответсвующий единственный дочерний узел.
}
