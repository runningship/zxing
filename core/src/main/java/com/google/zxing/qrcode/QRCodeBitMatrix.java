package com.google.zxing.qrcode;

import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.encoder.QRCode;

public class QRCodeBitMatrix {

	private BitMatrix bitMatrix;
	
	private QRCode qrCode;

	public BitMatrix getBitMatrix() {
		return bitMatrix;
	}

	public void setBitMatrix(BitMatrix bitMatrix) {
		this.bitMatrix = bitMatrix;
	}

	public QRCode getQrCode() {
		return qrCode;
	}

	public void setQrCode(QRCode qrCode) {
		this.qrCode = qrCode;
	}
	
}
