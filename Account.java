package object_class;
//은행계좌 클래스 (신한은행) , getter, setter 기능 추가해주세요
public class Account { //'Account'라는 객체
	//멤버변수(필드), 값 저장 변수
	static final String BANKNAME = "신한은행"; //정적멤버변수, 
	String accountNo;	//계좌번호 - 인스턴스멤버변수, new로 생성하며 객체이름을 통해 접근
	String ownerName;	//예금주이름
	int balance;		//잔액
	
	//생성자 객체를 생성과 동시에 초기화
	/*public Account(String accNo, String owName, int bal) {
		accountNo = accNo;
		ownerName = owName;
		balance = bal;
	}*/
	public Account(String accountNo, String ownerName, int balance) { //매개변수 이름 만들기 귀찮으면 멤버변수와 같이해도 괜춘
		this.accountNo = accountNo; //this.멤버변수 = 매개변수
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public Account() { //빈 생성자 - 매개변수로 아무값도 받지않는것
		
	}
	
	//메서드(기능)
	//예금한다 메서드
	void deposit(int amount) { //기능만 수행,return값이 없다(돌려주는게없) 'deposit' 메서드 (매개변수)
		balance = balance + amount; //예금할 금액이 amount에 들어가면 잔액과 더하기
	}
	
	//인출 메서드
	int withdraw(int amount) throws Exception { //타입에 맞는 return기능  ) 예외가 발생하면 던져
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance = balance - amount;
		return amount;
	}

}
