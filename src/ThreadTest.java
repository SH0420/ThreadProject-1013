import javax.swing.JOptionPane;

public class ThreadTest {

	public static void main(String[] args) {
//		//프로그램 -> 프로세스 -> 스레드(멀티스레드)
//		//모든프로그래은 기본적으로 스레드가 동작(1개 이상의 스레드가 있다)
//		//스레드 만드는 방법
		//1.Thread클래스를 상속
		//2.Runnable인터페이스 상속
		
//		for(int i = 0;i<10;i++) {
//			System.out.println(i);
//		}
//		
//		for(int j = 0;j<10;j++) {
//			System.out.println(j);
//		}
		
		//Thread 클래스를 상속받은경우
//		Count cnt = new Count(); //멀티 스레드 코드방식
//		cnt.start();
		
		//인터페이스 Runnable을 상속받은 경우
//		Runnable r/*Count2 cnt2*/ = new Count2();
//		Thread cnt2 = new Thread(r);
//		cnt2.start();
//
//		String input =JOptionPane.showInputDialog("아무값이나 입력");
//		System.out.println("입력값은"+ input + " 입니다."); //동작해야 밑에 for문이 실행됨

//		Threadex5 th =new Threadex5(); // |
//		th.start();//스레드는 start메소드사용
//	
//			for(int i=0; i<500;i++) {
//				System.out.print("-"); //실행시 번갈아가면서 동작됨 /동작시간은 균등하지않음/스레드는 여러개있을때는 경합하기떄문에 순서에 따라 작동되는것은 아니다
//			}
		
		Runnable r = new Thread6();
		Thread th1 = new Thread(r,"*");
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r,"***");
		
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000); //현재 자신을 호출한 스레드를 sleep한다(일시정지)
			th1.suspend(); //스레드 일시정지 시키는 메소드
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();//즉시 실행x 스레드를 실행대기상태로 만든다
			Thread.sleep(3000);
			th2.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
