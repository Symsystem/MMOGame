package com.symsystem.main;

public class Camera extends Entity{
	
	float speed = 0;
	
	public Camera(float x, float y, float z){
		super(x, y, z, 0, 0, 0);
	}
	
	public Camera(float x, float y, float z, float rX, float rY, float rZ){
		super(x, y, z, rX, rY, rZ);
	}
	
		
}
