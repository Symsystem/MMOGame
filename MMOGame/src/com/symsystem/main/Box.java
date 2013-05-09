package com.symsystem.main;

import org.lwjgl.opengl.GL11;


public class Box extends Entity{
	//oui !

	private float size;
	private float red, green, blue;
	
	public Box(float x, float y, float z, float rotateX, float rotateY, float rotateZ, float size){
		super(x, y, z, rotateX, rotateY, rotateZ);
		this.size = size;
		red = 128;
		green = 128;
		blue = 128;
	}
	public Box(float x, float y, float z, float rotateX, float rotateY, float rotateZ, float size, float red, float green, float blue){
		this(x, y, z, rotateX, rotateY, rotateZ, size);
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public void render(){
		//Top
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glColor3f(76f/256f, 130f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() + size, coord.getY() + size, coord.getZ() - size);
		GL11.glColor3f(76f/256f, 130f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() - size, coord.getY() + size, coord.getZ() - size);
		GL11.glColor3f(76f/256f, 130f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() - size, coord.getY() + size, coord.getZ() + size);
		GL11.glColor3f(76f/256f, 130f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() + size, coord.getY() + size, coord.getZ() + size);
		// Bottom
		GL11.glColor3f(76f/256f, 130f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() + size, coord.getY() - size, coord.getZ() + size);
		GL11.glColor3f(76f/256f, 130f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() - size, coord.getY() - size, coord.getZ() + size);
		GL11.glColor3f(76f/256f, 130f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() - size, coord.getY() - size, coord.getZ() - size);
		GL11.glColor3f(76f/256f, 130f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() + size, coord.getY() - size, coord.getZ() - size);
		// One side
		GL11.glColor3f(76f/256f, 156f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() + size, coord.getY() + size, coord.getZ() + size);
		GL11.glColor3f(76f/256f, 156f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() - size, coord.getY() + size, coord.getZ() + size);
		GL11.glColor3f(76f/256f, 156f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() - size, coord.getY() - size, coord.getZ() + size);
		GL11.glColor3f(76f/256f, 156f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() + size, coord.getY() - size, coord.getZ() + size);
		// Moar sides
		GL11.glColor3f(76f/256f, 156f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() + size, coord.getY() - size, coord.getZ() - size);
		GL11.glColor3f(76f/256f, 156f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() - size, coord.getY() - size, coord.getZ() - size);
		GL11.glColor3f(76f/256f, 156f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() - size, coord.getY() + size, coord.getZ() - size);
		GL11.glColor3f(76f/256f, 156f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() + size, coord.getY() + size, coord.getZ() - size);
		// Last side
		GL11.glColor3f(76f/256f, 84f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() - size, coord.getY() + size, coord.getZ() + size);
		GL11.glColor3f(76f/256f, 84f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() - size, coord.getY() + size, coord.getZ() - size);
		GL11.glColor3f(76f/256f, 84f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() - size, coord.getY() - size, coord.getZ() - size);
		GL11.glColor3f(76f/256f, 84f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() - size, coord.getY() - size, coord.getZ() + size);
		GL11.glEnd();
		// Real last side
		GL11.glColor3f(76f/256f, 84f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() + size, coord.getY() + size, coord.getZ() - size);
		GL11.glColor3f(76f/256f, 84f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() + size, coord.getY() + size, coord.getZ() + size);
		GL11.glColor3f(76f/256f, 84f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() + size, coord.getY() - size, coord.getZ() + size);
		GL11.glColor3f(76f/256f, 84f/256f, 232f/256f);
		GL11.glVertex3f(coord.getX() + size, coord.getY() - size, coord.getZ() - size);
		GL11.glEnd();
	}
	public void renderT(){
		//Down
		GL11.glBegin(GL11.GL_TRIANGLES);
		GL11.glColor3f(255f/256f, 114f/256f, 104f/256f);
		GL11.glVertex3f(coord.getX() - size/2 , coord.getY() - size/2, coord.getZ() +size/2);
		GL11.glColor3f(255f/256f, 114f/256f, 104f/256f);
		GL11.glVertex3f(coord.getX() - size/2 , coord.getY() - size/2, coord.getZ() -size/2);
		GL11.glColor3f(255f/256f, 114f/256f, 104f/256f);
		GL11.glVertex3f(coord.getX() + size/2 , coord.getY() - size/2, coord.getZ() -size/2);
		//One side
		GL11.glColor3f(255f/256f, 81f/256f, 68f/256f);
		GL11.glVertex3f(coord.getX() - size/2 , coord.getY() - size/2, coord.getZ() +size/2);
		GL11.glColor3f(255f/256f, 81f/256f, 68f/256f);
		GL11.glVertex3f(coord.getX() + size/2 , coord.getY() - size/2, coord.getZ() -size/2);
		GL11.glColor3f(255f/256f, 81f/256f, 68f/256f);
		GL11.glVertex3f(coord.getX(), coord.getY() + size/2, coord.getZ());
		//Left side
		GL11.glColor3f(255f/256f, 50f/256f, 20f/256f);
		GL11.glVertex3f(coord.getX() - size/2 , coord.getY() - size/2, coord.getZ() +size/2);
		GL11.glColor3f(255f/256f, 50f/256f, 20f/256f);
		GL11.glVertex3f(coord.getX() - size/2, coord.getY() - size/2, coord.getZ() - size/2);
		GL11.glColor3f(255f/256f, 50f/256f, 20f/256f);
		GL11.glVertex3f(coord.getX(), coord.getY() + size/2, coord.getZ());
		//last side
		GL11.glColor3f(256f/256f, 0, 0);
		GL11.glVertex3f(coord.getX() + size/2 , coord.getY() - size/2, coord.getZ() -size/2);
		GL11.glColor3f(256f/256f, 0, 0);
		GL11.glVertex3f(coord.getX() - size/2, coord.getY() - size/2, coord.getZ() - size/2);
		GL11.glColor3f(256f/256f, 0, 0);
		GL11.glVertex3f(coord.getX(), coord.getY() + size/2, coord.getZ());
		GL11.glEnd();
	}
	public void renderL(){
		//X
		GL11.glBegin(GL11.GL_LINES);
		GL11.glColor3f(1, 0, 0);
		GL11.glVertex3f(coord.getX(), coord.getY(), coord.getZ());
		GL11.glColor3f(1, 0, 0);
		GL11.glVertex3f(coord.getX() + size, coord.getY(), coord.getZ());
		//Y
		GL11.glColor3f(1, 0, 0);
		GL11.glVertex3f(coord.getX(), coord.getY(), coord.getZ());
		GL11.glColor3f(1, 0, 0);
		GL11.glVertex3f(coord.getX(), coord.getY() + size, coord.getZ());
		//Z
		GL11.glColor3f(1, 0, 0);
		GL11.glVertex3f(coord.getX(), coord.getY(), coord.getZ());
		GL11.glColor3f(1, 0, 0);
		GL11.glVertex3f(coord.getX(), coord.getY(), coord.getZ() + size);
		GL11.glEnd();
	}
	
}
