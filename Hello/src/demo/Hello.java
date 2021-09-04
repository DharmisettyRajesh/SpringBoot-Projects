package demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Hello {
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		
		CompletableFuture<String> cf = new CompletableFuture<>();
		System.out.println(Thread.currentThread());
		cf.complete("Hello");
		String value = cf.get();
		System.out.println("Value- " + value);
		
	}
}
