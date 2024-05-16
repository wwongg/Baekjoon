#include <stdio.h>

int arr[26][2];

void pre(int x){
	if(x<0) return;
	
	printf("%c",x+65);
	pre(arr[x][0]);
	pre(arr[x][1]);
	
	return;
}

void in(int x){
	if(x<0) return;
	
	in(arr[x][0]);
	printf("%c",x+65);
	in(arr[x][1]);
	
	return;
}

void post(int x){
	if(x<0) return;
	
	post(arr[x][0]);
	post(arr[x][1]);
	printf("%c",x+65);
	
	return;
}

int main(){
	int n;
	char a,b,c;
	
	scanf("%d",&n);
	
	for(int i=0;i<n;i++){
		scanf("\n%c \n%c \n%c",&a,&b,&c);
		
		arr[a-65][0] = b-65;
		arr[a-65][1] = c-65;
	}
	
	pre(0); printf("\n");
	in(0); printf("\n");
	post(0); printf("\n");
	
	return 0;
}