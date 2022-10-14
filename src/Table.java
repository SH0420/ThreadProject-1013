import java.util.ArrayList;

public class Table {
	String[] dishNames = {"donut","donut","burger"};
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public  synchronized void add(String dish) {//���ÿ� ������ �߰�
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
//���������̾�����
	public synchronized void remove(String dishName) {  //���� ������ �Դ´�. ������ ������ ���ø� ���ش�.
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
		//���� ������������
		while(true) {
			for(int i=0;i<dishes.size();i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					notify();
					return; //�޼ҵ���ü�� ��
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
