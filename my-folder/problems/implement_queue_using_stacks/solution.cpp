class MyQueue {

private:
    stack<int> first;
    stack<int> second;

    // Helper function to move elements from first to second
    void transfer() {
        while (!first.empty()) {
            second.push(first.top());
            first.pop();
        }
    }

public:
    MyQueue() {

    }

    void push(int x) {
        first.push(x);
    }

    int pop() {
        if (second.empty()) {
            transfer();
        }
        int removed = second.top();
        second.pop();
        return removed;
    }

    int peek() {
        if (second.empty()) {
            transfer();
        }
        return second.top();
    }

    bool empty() {
        return first.empty() && second.empty();
    }
};


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */