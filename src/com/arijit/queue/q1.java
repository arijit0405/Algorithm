package com.arijit.queue;
import java.util.Queue;
import java.util.LinkedList;
 class q1 {
     public static void main(String[] args) {
         System.out.println("The required packages have been imported");
         Queue<Integer> input_queue = new LinkedList<>();
         input_queue.offer(150);
         input_queue.offer(300);
         input_queue.offer(450);
         input_queue.offer(600);
         System.out.println("The queue is defined as: " + input_queue);
         int removedNumber = input_queue.poll();
         System.out.println("After removing an element, the elements of the queue are: " + input_queue);
     }
 }