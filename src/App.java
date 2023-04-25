import java.io.IOException;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World");
				String cmd = "";
 
		
		if (args.length > 0)
			cmd = "/c " + args[0];//1
		//	if (args[0]=="dir")//2 
		//if (args[0].equals("dir"))//3
		//		cmd = "/c dir .";//2,3
		//   
		else
			cmd = "/c tasklist";
		
		String[] cmdScript = new String[]{"cmd.exe", cmd}; 
		
		try {
			Process procScript = Runtime.getRuntime().exec(cmdScript);
			System.out.println(procScript.getOutputStream().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
