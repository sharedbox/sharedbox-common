package com.sharedbox.common.identify;

import java.awt.image.BufferedImage;

import com.google.zxing.aztec.AztecWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;
import com.google.zxing.oned.UPCAWriter;

/**
 * This class generate Barcodes by 
 * 
 * @author Rafael Costi
 * @version 1.0.0
 */
public class Barcode {
	/**
	 * Constructor
	 */
	public Barcode () {
		setWidth(300);
		setHeight(150);
	}
	
	/**
	 * Width barcode
	 */
	private int width;
	
	/**
	 * Set width barcode
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * Height barcode
	 */
	private int height;
	
	/**
	 * Set height barcode
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * 
	 * 
	 * <ul>
	 *   <li>
	 *     For EAN 13 barcode require 12 number character
	 *   </li>
	 * <ul>  
	 * 
	 * @param barcodeText
	 * @return
	 * @throws Exception
	 */
	public BufferedImage generate(String data, CodeType barType) throws Exception {
		BitMatrix barcode = null;
		switch (barType) {
			case AZTEC:
				barcode = new AztecWriter().encode(data, barType.getCodeFormat(), this.width, this.height);
				break;
			case EAN13 :
				barcode = new EAN13Writer()
					.encode(data, barType.getCodeFormat(), this.width, this.height);
				break;
			case UPCA :
				barcode = new UPCAWriter().encode(data, barType.getCodeFormat(), this.width, this.height);
				break;
			default: 
				throw new IllegalArgumentException("Unexpected value: " + barType);
		}
	    return MatrixToImageWriter.toBufferedImage(barcode);
	}

	/**
	 * 
	 * @param data
	 * @param applicationIdentifier
	 * @param barType
	 * @return
	 * @throws BarcodeException
	 * /
	private net.sourceforge.barbecue.Barcode createBarType(String data, String applicationIdentifier, BarcodeType barType) 
			throws BarcodeException {
		net.sourceforge.barbecue.Barcode barcode = null;
		
			case USD4 :
				barcode = BarcodeFactory.createUSD4(data);
				break;
			case USD3RequiresChecksumFalse :
				barcode = BarcodeFactory.createUSD3(data, false);
				break;
			case USD3RequiresChecksumTrue :
				barcode = BarcodeFactory.createUSD3(data, true);
				break;
			case UPCA :
				barcode = BarcodeFactory.createUPCA(data);
				break;
			case UCC128 :
				barcode = BarcodeFactory.createUCC128(applicationIdentifier, data);
				break;
			case Std2of5 :
				barcode = BarcodeFactory.createStd2of5(data);
				break;
			case Std2of5CheckDigitFalse :
				barcode = BarcodeFactory.createStd2of5(data, false);
				break;
			case Std2of5CheckDigitTrue :
				barcode = BarcodeFactory.createStd2of5(data, true);
				break;
			case SSCC18 :
				barcode = BarcodeFactory.createSSCC18(data);
				break;
			case ShipmentIdentificationNumber :
				barcode = BarcodeFactory.createShipmentIdentificationNumber(data);
				break;
			case SCC14ShippingCode :
				barcode = BarcodeFactory.createSCC14ShippingCode(data);
				break;
			case RandomWeightUPCA :
				barcode = BarcodeFactory.createRandomWeightUPCA(data);
				break;
			case PostNet :
				barcode = BarcodeFactory.createPostNet(data);
				break;
			case PDF417 :
				barcode = BarcodeFactory.createPDF417(data);
				break;
			case NW7 :
				barcode = BarcodeFactory.createNW7(data);
				break;
			case Monarch :
				barcode = BarcodeFactory.createMonarch(data);
				break;
			case Int2of5CheckDigitFalse :
				barcode = BarcodeFactory.createInt2of5(data, false);
				break;
			case Int2of5CheckDigitTrue :
				barcode = BarcodeFactory.createInt2of5(data, true);
				break;
			case Int2of5 :
				barcode = BarcodeFactory.createInt2of5(data);
				break;
			case GlobalTradeItemNumber :
				barcode = BarcodeFactory.createGlobalTradeItemNumber(data);
				break;
			case EAN128 :
				barcode = BarcodeFactory.createEAN128(data);
				break;
			case Code39RequiresChecksumFalse :
				barcode = BarcodeFactory.createCode39(data, false);
				break;
			case Code39RequiresChecksumTrue :
				barcode = BarcodeFactory.createCode39(data, true);
				break;
			case Code128 :
				barcode = BarcodeFactory.createCode128(data);
				break;
			case Code128A :
				barcode = BarcodeFactory.createCode128A(data);
				break;
			case Code128B :
				barcode = BarcodeFactory.createCode128B(data);
				break;
			case Code128C :
				barcode = BarcodeFactory.createCode128C(data);
				break;
			case Codabar :
				barcode = BarcodeFactory.createCodabar(data);
				break;
			case Bar3of9RequiresChecksumFalse :
				barcode = BarcodeFactory.create3of9(data, false);
				break;
			case Bar3of9RequiresChecksumTrue :
				barcode = BarcodeFactory.create3of9(data, true);
				break;
			case Bar2of7 :
				barcode = BarcodeFactory.create2of7(data);
				break;
		}
		return barcode;
	}*/
}
