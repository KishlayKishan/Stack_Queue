/*@Purpose::Ability to create a Queue and Deque
 *@File::Stack_Queue
 *@Author::Kishlay Kishan
 *@Date::06-April-2022
 */

package com.bridgelabz.stackqueue;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue");
		Queue queue = new Queue();
		queue.enque(56);
		queue.enque(30);
		queue.enque(70);
		queue.deque();
		queue.deque();
		queue.deque();
	}
}
