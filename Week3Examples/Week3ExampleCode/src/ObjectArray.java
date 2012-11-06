//Lecture 3 - Demonstration of an array of varied Objects

public class ObjectArray {
	Object[] objArray;

	ObjectArray() {
		objArray = new Object[10];
		objArray[0] = new Integer(5);
		objArray[2] = new String("This is a String");
		objArray[3] = new Double(6.6);
		objArray[5] = new Character('c');
		objArray[6] = new Object();
		objArray[7] = new int[5];
		objArray[8] = new Integer[7];
		objArray[9] = new Byte((byte) 0x22);
	}

	public void execute() {
		ObjectArray o = new ObjectArray();
		for (int i = 0; i < 10; i++)
			if (o.objArray[i] != null)
				System.out.println("i = " + i + ' ' + ": " + o.objArray[i]);
	}
}