import javax.swing.JOptionPane;

public class ThreadTest {

	public static void main(String[] args) {
//		//���α׷� -> ���μ��� -> ������(��Ƽ������)
//		//������α׷��� �⺻������ �����尡 ����(1�� �̻��� �����尡 �ִ�)
//		//������ ����� ���
		//1.ThreadŬ������ ���
		//2.Runnable�������̽� ���
		
//		for(int i = 0;i<10;i++) {
//			System.out.println(i);
//		}
//		
//		for(int j = 0;j<10;j++) {
//			System.out.println(j);
//		}
		
		//Thread Ŭ������ ��ӹ������
//		Count cnt = new Count(); //��Ƽ ������ �ڵ���
//		cnt.start();
		
		//�������̽� Runnable�� ��ӹ��� ���
//		Runnable r/*Count2 cnt2*/ = new Count2();
//		Thread cnt2 = new Thread(r);
//		cnt2.start();
//
//		String input =JOptionPane.showInputDialog("�ƹ����̳� �Է�");
//		System.out.println("�Է°���"+ input + " �Դϴ�."); //�����ؾ� �ؿ� for���� �����

//		Threadex5 th =new Threadex5(); // |
//		th.start();//������� start�޼ҵ���
//	
//			for(int i=0; i<500;i++) {
//				System.out.print("-"); //����� �����ư��鼭 ���۵� /���۽ð��� �յ���������/������� �������������� �����ϱ⋚���� ������ ���� �۵��Ǵ°��� �ƴϴ�
//			}
		
		Runnable r = new Thread6();
		Thread th1 = new Thread(r,"*");
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r,"***");
		
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000); //���� �ڽ��� ȣ���� �����带 sleep�Ѵ�(�Ͻ�����)
			th1.suspend(); //������ �Ͻ����� ��Ű�� �޼ҵ�
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();//��� ����x �����带 ��������·� �����
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
