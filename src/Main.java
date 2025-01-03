/*
Nasir Johnson
01/02/2024

Feature1 adds linked list capabilities to repository.

Node class contains first name, last name, age, gender, and next node pointer.
Also contains a getInfo method which prints current node data.

LinkedList class contains head node and current node.
Insert method inserts node given as parameters.
Traverse method prints out each node's data until the end is reached.

Test_data.txt is given in form "FirstName LastName Age Gender"

 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        Scanner scnr = new Scanner(new File(args[0]));
        LinkedList linkedListObj = new LinkedList();

        while (scnr.hasNextLine()){
            String[] nodeInfo = scnr.nextLine().split(" ");
            Node newNode = new Node(nodeInfo[0], nodeInfo[1], Integer.parseInt(nodeInfo[2]), nodeInfo[3].charAt(0));
            linkedListObj.insert(newNode);
        }

        linkedListObj.traverse();
    }
}