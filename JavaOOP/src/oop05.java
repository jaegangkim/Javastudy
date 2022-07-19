import kr.ani.oop.Animal;
import kr.ani.oop.Cat;
import kr.ani.oop.Dog;

public class oop05 {

	public static void main(String[] args) {
		// 다형성의 활용 - 1
		// Dog, Cat을 저장 할 [배열]을 선언하시오.
		Animal[] ani = new Animal[2];
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		/* 반복문으로
		ani[0].eat();
		ani[1].eat();
		((Cat)ani[1]).night();     
		 */
		for(int i=0;i<ani.length;i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
		}
		
	}
}
