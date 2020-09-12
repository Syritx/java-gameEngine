import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;

public class MainLoop {

	public static void main(String[] args) throws LWJGLException {
		
		Game.createDisplay();
		while (!Display.isCloseRequested()) {
			Game.update();
		}
		Game.close();
	}
}
