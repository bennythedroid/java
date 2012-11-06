public class CommandLineDosRun {
	public static void main(String[] args) throws java.io.IOException {
		if (args.length > 0)
			for (int i = 0; i < args.length; i++)
				System.out.println("Parm #" + i + "=" + args[i]);
		else
			System.out.println("No parms Entered");
	}
}
