import java.util.ArrayList;

public class Table {
	String[] dishNames = {"donut","donut","burger"};
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public  synchronized void add(String dish) {//접시에 음식을 추가
		while(dishes.size()>= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting");
			
			try {
				wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		dishes.add(dish);
		notify();
		System.out.println("Dishes :" + dishes.toString());
	}
//먹을음식이없을때
	public synchronized void remove(String dishName) {  //고객이 음식을 먹는다. 음식을 먹으면 접시를 빼준다.
		String name = Thread.currentThread().getName();
		
		while(dishes.size() == 0) {
			System.out.println(name + " is waiting");
			
			try {
				wait();
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//먹을 음식이있을때
		while(true) {
			for(int i=0;i<dishes.size();i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					notify();
					return; //메소드자체를 끝
				}
			}
			
			try {
				System.out.println(name + "is waiting");
				wait();
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public int dishName() {
		return dishNames.length;
	}
}
