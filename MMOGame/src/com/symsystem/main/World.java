package com.symsystem.main;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glRotatef;
import static org.lwjgl.opengl.GL11.glTranslatef;

public class World {

	static float gravity = 0.5f;
	Camera camera = new Camera(0f, -3.5f,-9f);
	Box box = new Box(0,2,0,30,0,0,2);
	Box triangle = new Box(5,5,5,0,0,0,2);
	Box line = new Box(0, 5, 0, 0, 0, 0, 1);
	
	public World(){
		
	}
	
	public void update(){
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		glLoadIdentity();
		glRotatef(camera.getRotateX(), 1, 0, 0);
		glRotatef(camera.getRotateY(), 0, 1, 0);
		glRotatef(camera.getRotateZ(), 0, 0, 1);
		glRotatef(box.getRotateX(), 1, 0, 0);
		glRotatef(box.getRotateY(), 0, 1, 0);
		glRotatef(box.getRotateZ(), 0, 0, 1);
		glTranslatef(camera.getX(), camera.getY(), camera.getZ());

		//camera.update();
		//camera.input();
		triangle.renderT();
		box.render();
		line.renderL();
		
	}

}
