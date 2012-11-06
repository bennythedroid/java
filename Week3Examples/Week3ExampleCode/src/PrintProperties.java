import java.util.Properties;

class PrintProperties {
	public void execute() {
		Properties p = System.getProperties();
		p.list(System.out);
	}
}