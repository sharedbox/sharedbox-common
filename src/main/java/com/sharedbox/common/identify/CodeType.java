package com.sharedbox.common.identify;

import com.google.zxing.BarcodeFormat;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 08/27/2021 - Project version 1.0.0
 */
public enum CodeType {
	AZTEC(BarcodeFormat.AZTEC),
	QRCode(BarcodeFormat.QR_CODE),
	USPS(null),
	USD4(null),
	USD3RequiresChecksumFalse(null),
	USD3RequiresChecksumTrue(null),
	UPCA(BarcodeFormat.UPC_A),
	UCC128(null),
	Std2of5(null),
	Std2of5CheckDigitFalse(null),
	Std2of5CheckDigitTrue(null),
	SSCC18(null),
	ShipmentIdentificationNumber(null),
	SCC14ShippingCode(null),
	RandomWeightUPCA(null),
	PostNet(null),
	PDF417(null),
	NW7(null),
	Monarch(null),
	Int2of5CheckDigitFalse(null),
	Int2of5CheckDigitTrue(null),
	Int2of5(null),
	GlobalTradeItemNumber(null),
	EAN13(BarcodeFormat.EAN_13),
	EAN128(null),
	Code39RequiresChecksumFalse(null),
	Code39RequiresChecksumTrue(null),
	Code128(null),
	Code128A(null),
	Code128B(null),
	Code128C(null),
	Codabar(null),
	Bar3of9RequiresChecksumFalse(null),
	Bar3of9RequiresChecksumTrue(null),
	Bar2of7(null),
	NotFound(null);
	
	/**
	 * Barcode format
	 */
	private BarcodeFormat format;
	
	/**
	 * Constructor
	 */
	private CodeType(BarcodeFormat format) {
		this.format= format;
	}
	
	/**
	 * Get Barcode format
	 * @return com.google.zxing.BarcodeFormat
	 */
	public BarcodeFormat getCodeFormat() {
		return this.format;
	}
}
