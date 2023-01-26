package com.sharedbox.common.identify;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import com.sharedbox.common.exceptions.SizeException;
import com.sharedbox.common.utils.Extensions;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 08/27/2021 - version 1.0.0
 */
public class QRCode {
	/**
	 * Constructor
	 */
	private QRCode () {
		size(300);
		this.decorators = new ArrayList<CodeDecorator<BufferedImage>>();
	}
	
	/**
	 * 
	 * @return
	 */
	public static QRCode newQRCode() {
		return new QRCode();
	}
	
	/**
	 * QR Code size
	 */
	private int size;
	
	/**
	 * Set QR Code size
	 * @param width
	 */
	public QRCode size(int size) {
		if (size <= 0) {
			throw new SizeException("Width is to small should be > 0 is " + size);
		}

		this.size = size;
		return this;
	}

	/**
	 * QR code decorator
	 */
    private List<CodeDecorator<BufferedImage>> decorators;
	
	/**
	 * 
	 * @param decorator
	 * @return
	 */
	public QRCode decorator(CodeDecorator<BufferedImage> decorator) {
		this.decorators.add(decorator);
		return this;
	}
    
	/**
	 * QR code content 
	 */
	private String content;
	
	/**
	 * 
	 * @param content
	 * @return
	 */
	public QRCode content(String content) {
		this.content = content;
		return this;
	}

	/**
	 * QR Code Charset
	 */
	private Charset charset;
	
	/**
	 * Set charset
	 * @param forName
	 */
	public QRCode charset(Charset charset) {
		this.charset = charset;
		return this;
	}
	
	/**
	 * Create hints
	 * @return
	 */
	private Map<EncodeHintType, Object> hints() {
		Map<EncodeHintType, Object> encodeHints = new HashMap<>();
	    encodeHints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
	    encodeHints.put(EncodeHintType.CHARACTER_SET, this.charset.name());
	    return encodeHints;
	} 

	/**
	 * Generate QR code with BufferedImage format
	 * @return BufferedImage
	 * @throws Exception
	 */
	public BufferedImage generateBufferedImage() throws Exception {
		BufferedImage qrCode = MatrixToImageWriter.toBufferedImage(new QRCodeWriter().encode(this.content
				, BarcodeFormat.QR_CODE
				, this.size
				, this.size
				, hints()));
			
		for(CodeDecorator<BufferedImage> decorator : this.decorators) {
			qrCode = decorator.decorate(qrCode);
		}
			
		return qrCode;
	}

	/**
	 * Generate QR code with ByteArrayOutputStream (OutputStream) format
	 * @return ByteArrayOutputStream (OutputStream)
	 * @throws Exception
	 */
	public ByteArrayOutputStream generateOutputStream(Extensions imageFormat) throws Exception {
		if(!imageFormat.equals(Extensions.PNG) && !imageFormat.equals(Extensions.GIF)) {
			throw new Exception("Is not a valid format");
		}
		
		BufferedImage qrCode = generateBufferedImage();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(qrCode, imageFormat.name().toLowerCase(), baos);
		return baos;
	}

	/**
	 * Generate QR code with byte array format
	 * @return byte[]
	 * @throws Exception
	 */
	public byte[] generateByteArray(Extensions imageFormat) throws Exception {
		return generateOutputStream(imageFormat).toByteArray();
	}

	/**
	 * Generate QR code with byte array format
	 * @return String base 64
	 * @throws Exception
	 */
	public String generateBase64(Extensions imageFormat) throws Exception {
		return Base64.encodeBase64String(generateByteArray(imageFormat));
	}
}