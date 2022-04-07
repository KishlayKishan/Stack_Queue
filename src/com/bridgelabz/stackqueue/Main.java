/*@Purpose::Ability to peak and pop from the Stack till it is empty 56 ->30 ->70
 *@File::Stack_Queue
 *@Author::Kishlay Kishan
 *@Date::06-April-2022
 */

package com.bridgelabz.stackqueue;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and queue");
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.displayStack();
		stack.pop();
		stack.displayStack();

	}
}
