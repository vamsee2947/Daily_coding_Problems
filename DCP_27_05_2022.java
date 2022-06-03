//Suppose an arithmetic expression is given as a binary tree. Each leaf is an integer and each internal node is one of '+', '−', '∗', or '/'.

import java.lang.*;

class Main{
	
Node root;

public static class Node
{
	String data;
	Node left, right;

	Node(String d)
	{
		data = d;
		left = null;
		right = null;
	}
}

private static int toInt(String str)
{
	int num = 0;
	if (str.charAt(0) != '-')
		for(int i = 0; i < str.length(); i++)
			num = num * 10 + ((int)str.charAt(i) - 48);
			
	else
	{
		for(int i = 1; i < str.length(); i++)
		num = num * 10 + ((int)(str.charAt(i)) - 48);
		num = num * -1;
	}
	return num;
}

public static int eval(Node root)
{
	
	if (root == null)
		return 0;

	if (root.left == null && root.right == null)
		return toInt(root.data);

	int leftEval = eval(root.left);

	int rightEval = eval(root.right);

	if (root.data.equals("+"))
		return leftEval + rightEval;

	if (root.data.equals("-"))
		return leftEval - rightEval;

	if (root.data.equals("*"))
		return leftEval * rightEval;

	return leftEval / rightEval;
}


public static void main(String[] args)
{
	

    Node root = new Node("*");
	root.left = new Node("+");
	root.left.left = new Node("3");
	root.left.right = new Node("2");
	root.right = new Node("+");
	root.right.left = new Node("4");
	root.right.right = new Node("5");

	System.out.println(eval(root));
}
}


