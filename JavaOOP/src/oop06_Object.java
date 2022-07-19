import kr.ani.oop.Animal;
import kr.ani.oop.Cat;
import kr.ani.oop.Dog;
import kr.ani.oop.*;
public class oop06_Object {

	public static void main(String[] args) {
		// Dog, Cat을 저장 할 [배열]을 선언 , Animal X
		Object[] obj = new Animal[2];
		obj[0] = new Dog();
		obj[1] = new Cat();

		for(int i=0;i<obj.length;i++) {
			((Animal) obj[i]).eat();
			if(obj[i] instanceof Cat) {
				((Cat) obj[i]).night();
			}
		}
		
		

	}

}
