package com.symsystem.main;

import com.symsystem.utils.Coordinates;

public class Entity {

	protected Coordinates coord;
	protected float rotateX, rotateY, rotateZ;
	
	public Entity(float x, float y, float z, float rotateX, float rotateY, float rotateZ){
		this.coord = new Coordinates(x, y, z);
		this.rotateX = rotateX;
		this.rotateY = rotateY;
		this.rotateZ = rotateZ;
	}
	
	public Coordinates getCoord(){
		return coord;
	}
	public float getX(){
		return coord.getX();
	}
	public float getY(){
		return coord.getY();
	}
	public float getZ(){
		return coord.getZ();
	}
	public float getRotateX(){
		return rotateX;
	}
	public float getRotateY(){
		return rotateY;
	}
	public float getRotateZ(){
		return rotateZ;
	}
	
	public void setCoord(float x, float y, float z){
		coord.setCoordinates(x, y, z);
	}
	public void setX(float x){
		coord.setX(x);
	}
	public void setY(float y){
		coord.setY(y);
	}
	public void setZ(float z){
		coord.setZ(z);
	}
	public void setRotateX(float x){
		rotateX = x;
	}
	public void setRotateY(float y){
		rotateY = y;
	}
	public void setRotateZ(float z){
		rotateZ = z;
	}
	
}
