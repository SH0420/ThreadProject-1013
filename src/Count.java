
public class Count extends Thread{

	@Override
	public void run() {
		for(int i=10; i> 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);//�Ͻ��������� ����
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
