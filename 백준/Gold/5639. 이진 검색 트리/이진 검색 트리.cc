#include <stdio.h>
#include <stdlib.h>

typedef struct node{
	int key;
	struct node* left;
	struct node* right;
	
}node;

node* insert(node* root, int input) {
	if(root == NULL) {
		node* root = (node*) malloc(sizeof(node));
		root->key = input;
		root->left = root->right = NULL;
		return root; 
	}
	else if(root->key > input) {
		root->left = insert(root->left, input);
	}
	else if(root->key < input) {
		root->right = insert(root->right, input);
	}
	return root;
}

void post(node* root) {
	if(root == NULL) {
		return;
	}
	
	post(root->left);
	post(root->right);
	printf("%d\n", root->key);
}

int main(){
	int n;
	node* root = NULL;
	
	while(scanf("%d\n", &n) != EOF) {
		root = insert(root, n);
	}
	post(root);
	
	return 0;
}