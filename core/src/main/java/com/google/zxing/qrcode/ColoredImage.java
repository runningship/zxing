package com.google.zxing.qrcode;

public interface ColoredImage {
	public int getRGB(int x , int y);
	
	public void setRGB(int x , int y, int rgb);
}
