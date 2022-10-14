
public class Count extends Thread{

	@Override
	public void run() {
		for(int i=10; i> 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);//일시정지상태 구현
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
