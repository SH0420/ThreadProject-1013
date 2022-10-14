import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Account {
	private int balance = 1000;
	   
	public /*synchronized*/ void withdraw(int money) {  //동기화 : 순서를 지켜서 사용하게 한다. synchronized(대상은 메소드) ->잠근다
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