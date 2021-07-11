package leetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
* take a look at stack and queue and other collections 
*  to see the which one is a thread safe and which  one is faster 
*
*  the fastest one is ArrayDeque 
*
*
*/
public class StackQueue {
	/**
	 * 
	 * @param args
	*/
	public static void main(String[] args) {
		// stack by vector, stack is thread safe
		Stack stack = new Stack();

		// queue by slow linkedlist
		// linkedList is not not  thread safe ,
		// the solution is  to use   List list = Collections.synchronizedList(new LinkedList(...))
		Queue queue = new LinkedList();

		//  queue by fast array
		//  ArrayDeque is not not thread safe
		Queue queue2 = new ArrayDeque<>();

		// ArrayDeque can use it as stack, queue or doble queue
		// as documentation ArrayDeque is faster than Stack [vector],
		// ArrayDeque is faster than queue [linkedList],
		// ArrayDeque is not not  thread safe
		//      ===================== 
                //     first             last
		//      =====================
		//   
		//   offerFirst == push
		Deque<Integer> stackDoubleQueue = new ArrayDeque<>();

		stackDoubleQueue.offer(1);
		stackDoubleQueue.push(2);
		stackDoubleQueue.offer(3);
		stackDoubleQueue.push(4);
		stackDoubleQueue.offer(5);
		stackDoubleQueue.push(6);
		stackDoubleQueue.offerFirst(0);
		stackDoubleQueue.offerFirst(11);
		stackDoubleQueue.offer(22);
		stackDoubleQueue.push(33);
		System.out.println(stackDoubleQueue.pop());
		System.out.println(stackDoubleQueue.pollFirst());
		System.out.println(stackDoubleQueue.pollLast());

		// ArrayBlockingQueue is like ArrayDeque
		// ArrayBlockingQueue  is thread safe
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(33);

		// min heap but not not  thread safe, 
		Queue priorityQueue = new PriorityQueue();

		// min heap but thread safe
		Queue priorityQueue2 = new PriorityBlockingQueue<>();
	}
}
