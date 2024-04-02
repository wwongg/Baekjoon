#include <iostream>
#include <queue>

using namespace std;

int main() {
	queue<int> q;
	string inst;
	int N;
	int x;
	cin >> N;
	
	for(int i = 0; i < N; i++) {
		cin >> inst;
		if(inst == "push") {
			cin >> x;
			q.push(x);
		} else if(inst == "pop"){
			if(q.size() == 0) {
				cout << -1 << "\n";
			} else {
				cout << q.front() << "\n";
				q.pop();
			}
		} else if(inst == "size") {
			cout << q.size() << "\n";
		} else if(inst == "empty") {
			if(q.size() == 0) {
				cout << 1 << "\n";
			} else {
				cout << 0 << "\n";
			}
		} else if(inst == "front") {
			if(q.size() == 0) {
				cout << -1 << "\n";
			} else {
				int num = q.front();
				cout << num << "\n";
			}
		} else if(inst == "back") {
			if(q.size() == 0) {
				cout << -1 << "\n";
			} else {
				int number = q.back();
				cout << number << "\n";
			}
		} else {
			cout << "Not instruction";
		}
		
		
	}
	
}