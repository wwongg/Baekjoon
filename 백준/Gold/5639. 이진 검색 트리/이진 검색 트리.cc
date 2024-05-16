#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
	int data;
	struct Node* left;
	struct Node* right;
}Node;

Node* insert(Node* node, int input) {
	if(node == NULL) {
		Node* node = (Node*) malloc(sizeof(Node));
		node->data = input;
		node->left = node->right = NULL;
		return node;
	}
	else if(node->data > input) {
		node->left = insert(node->left, input);
	}
	else if(node->data < input){
		node->right = insert(node->right, input);
	}
	return node;
}

void postorder(Node* node){
	if(node == NULL) return;
	postorder(node->left);
	postorder(node->right);
	printf("%d\n", node->data);
	return;
}

int main() {
	int x;
	Node* node = NULL;
	while(scanf("%d\n", &x)!= EOF) {
		node = insert(node, x);	
	}
	postorder(node);
	
	return 0;
}