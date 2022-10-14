import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Account {
	private int balance = 1000;
	   
	public /*synchronized*/ void withdraw(int money) {  //����ȭ : ������ ���Ѽ� ����ϰ� �Ѵ�. synchronized(����� �޼ҵ�) ->��ٴ�
		synchronized(this) {
			if(balance >= money) {
		
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				balance -= money;
			}
		}
	}


}