package com.javaex.ex02;

public class Point {

	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public boolean equals(Object obj) {
		//같다 로직을 다시작성
		//o는 p01의 주소
		//본인의x o의x 같아?를 물어봄
		//     &&
		//본인의y o의y 같아?
		Point p = (Point)obj;
		boolean result;
		
		if(this.x == p.x && this.y == p.y) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}

}
