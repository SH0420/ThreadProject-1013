
public class Thread6 implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()); //Thread.currentThread().getName()->스레드의 이름을 출력하는 코드
			try {
				Thread.sleep(1000); //sleep 메소드 사용할때 예외처리해야함
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
