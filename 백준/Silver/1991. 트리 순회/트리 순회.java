import java.util.*;

class Node {
    char left;
    char right;

    Node(char left, char right) {
        this.left = left;
        this.right = right;
    }
}

public class Main {
    static HashMap<Character, Node> map;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        map = new HashMap<>();
        int n = kb.nextInt();
        for(int i = 0; i < n; i++) {
            char a = kb.next().charAt(0);
            char b = kb.next().charAt(0);
            char c = kb.next().charAt(0);
            map.put(a, new Node(b, c));
        }

        front('A');
        System.out.println();
        middle('A');
        System.out.println();
        back('A');
    }

    static void front(char c) {
        Node node = map.get(c);
        System.out.print(c);
        if(node.left != '.') {
            front(node.left);
        }
        if(node.right != '.') {
            front(node.right);
        }
    }
    static void middle(char c) {
        Node node = map.get(c);
        if(node.left != '.') {
            middle(node.left);
        }
        System.out.print(c);
        if(node.right != '.') {
            middle(node.right);
        }
    }
    static void back(char c) {
        Node node = map.get(c);
        if(node.left != '.') {
            back(node.left);
        }
        if(node.right != '.') {
            back(node.right);
        }
        System.out.print(c);
    }
}