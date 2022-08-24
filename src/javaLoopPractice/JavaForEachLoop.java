package javaLoopPractice;

import java.util.ArrayList;
import java.util.List;

public class JavaForEachLoop {

	public static void main(String[] args) {
		
		List <String> gameList = new ArrayList<>();
		gameList.add("Cricket");
		gameList.add("FootBall");
		gameList.add("Hockey");
		gameList.add("Chess");
		
		gameList.add(0, "BasketBall");
		//gameList.forEach(game-> System.out.println(game));
		//gameList.forEach(System.out::println);
		//gameList.stream().forEach(System.out::println);
		//gameList.stream().forEach(game->System.out.println(game));
		gameList.stream().forEachOrdered(System.out::println);
		
		
	}

}
