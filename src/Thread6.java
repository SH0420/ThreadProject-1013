
public class Thread6 implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()); //Thread.currentThread().getName()->�������� �̸��� ����ϴ� �ڵ�
			try {
				Thread.sleep(1000); //sleep �޼ҵ� ����Ҷ� ����ó���ؾ���
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
