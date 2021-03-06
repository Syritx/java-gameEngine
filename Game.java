import org.lwjgl.opengl.*;
import org.lwjgl.*;

public class Game {
	
	static final int WIDTH = 1000;
	static final int HEIGHT = 720;
	static final int FPS = 120;
	
	public static void createDisplay() throws LWJGLException {
		
		ContextAttribs attribs = new ContextAttribs(3,2);
		attribs.withForwardCompatible(true);
		attribs.withProfileCore(true);
		
		Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
		Display.create(new PixelFormat(),attribs);
		Display.setTitle("OPENGL TEST");
		
		GL11.glViewport(0, 0, WIDTH, HEIGHT);
		
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		GL11.glClearColor(0, 0, 0, 0);
	}
	
	public static void update() {
		Display.sync(FPS);
		Display.update();
	}
	
	public static void close() {
		Display.destroy();
	}
}
