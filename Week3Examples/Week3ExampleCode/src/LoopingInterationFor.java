
public class LoopingInterationFor {
	public void execute() {
		System.out.println ("Entering");
		int temp = 1;
		for (int i = 0,  j=10; i < 10; i++, j--) {
			temp = temp << 1;
			System.out.println("Left:" + temp);
		}
		for (int i = 0; i < 10; i++) {
			temp = temp >> 1;
			System.out.println("Right:" + temp);
		}
		temp = -1;
		for (int i = 0; i < 10; i++) {
			temp = temp >> 1;
			System.out.println("Left zero:" + temp);
		}
		temp = -1;
		for (int i = 0; i < 10; i++) {
			temp = temp >>> 1;
			System.out.println("Left zero2:" + temp);
		}
	}
//	public void execute2() {
//		int temp = 1;
//		exit1:
//			System.out.println("asdf");
//		for (int i = 0,  j=10; i < 10; i++, j--) {
//			temp = temp << 1;
//			System.out.println("Left:" + temp);
//			for (int k = 0; k<10; k++) {
//				if(k==5) break exit1;
//			}
//		}
//	}
}















