package com.sharedbox.common.http.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.sharedbox.common.messages.Message;
import com.sharedbox.common.messages.MessageType;
import com.sharedbox.common.security.Token;
import com.sharedbox.common.utils.StringUtils;

/**
 * 
 * @author Rafael Costi
 * @version 1.0.0
 * @since 06/11/2022 - Version 1.0.0
 */
public class BadRequestException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public BadRequestException() {
        super();
        this.idTransaction = "DEFAULT";
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param   message   the detail message. The detail message is saved for
     *          later retrieval by the {@link #getMessage()} method.
     */
    public BadRequestException(String message) {
    	this(message, Token.generate());
    }


    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param   message   the detail message. The detail message is saved for
     *          later retrieval by the {@link #getMessage()} method.
     *          
     * @param messge code. The message code is saved on message list
     */
    public BadRequestException(String message, String code) {
        this(message,code, Token.generate());
        setMessages(message, code);
    }


    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param   message   the detail message. The detail message is saved for
     *          later retrieval by the {@link #getMessage()} method.
     *          
     * @param messge code. The message code is saved on message list
     *          
     * @param Transaction id
     */
    public BadRequestException(String message, String code, String idTransaction) {
        super(message + ". CODE: " + code + ". Id transaction: " + idTransaction);
        setMessages(message, code);
        this.idTransaction = idTransaction;
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @param  message the detail message (which is saved for later retrieval
     *         by the {@link #getMessage()} method).
     * 
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).  (A {@code null} value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     * @since  1.4
     */
    public BadRequestException(String message, Throwable cause) {
        this(message, Token.generate(), cause);
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @param  message the detail message (which is saved for later retrieval
     *         by the {@link #getMessage()} method).
     *         
     * @param messge code. The message code is saved on message list
     * 
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).  (A {@code null} value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     * @since  1.4
     */
    public BadRequestException(String message, String code, Throwable cause) {
        this(message, code, Token.generate(), cause);
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @param  message the detail message (which is saved for later retrieval
     *         by the {@link #getMessage()} method).
     *         
     * @param messge code. The message code is saved on message list
     * 
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).  (A {@code null} value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     * @since  1.4
     */
    public BadRequestException(String message, String code, String idTransaction, Throwable cause) {
        super(message + ". CODE: " + code + ". Id transaction: " + idTransaction);
        this.setMessages(message, code);
        this.idTransaction = idTransaction;
    }

    /**
     * Constructs a new exception with the specified cause and a detail
     * message of {@code (cause==null ? null : cause.toString())} (which
     * typically contains the class and detail message of {@code cause}).
     * This constructor is useful for exceptions that are little more than
     * wrappers for other throwables (for example, {@link
     * java.security.PrivilegedActionException}).
     *
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).  (A {@code null} value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     * @since  1.4
     */
    public BadRequestException(Throwable cause) {
        super(cause);
        this.idTransaction = Token.generate();
    }

    /**
     * Constructs a new exception with the specified detail message,
     * cause, suppression enabled or disabled, and writable stack
     * trace enabled or disabled.
     *
     * @param  message the detail message.
     * @param cause the cause.  (A {@code null} value is permitted,
     * and indicates that the cause is nonexistent or unknown.)
     * @param enableSuppression whether or not suppression is enabled
     *                          or disabled
     * @param writableStackTrace whether or not the stack trace should
     *                           be writable
     * @since 1.7
     */
    protected BadRequestException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        setMessages(message, Token.generate());
        this.idTransaction = Token.generate();
    }

    /**
     * 
     * @param messages
     * @param cause
     */
    public BadRequestException(Map<String, Message> messages, String idTransaction) {
    	super(createMessages(messages) + ". Id transaction: " + idTransaction);
        setMessages(messages);
        this.idTransaction = idTransaction;
    }

    /**
     * 
     * @param messages
     * @param cause
     */
    public BadRequestException(Map<String, Message> messages) {
    	this(messages, Token.generate());
    }

    /**
     * 
     * @param messages
     * @param cause
     */
    public BadRequestException(Map<String, Message> messages, Throwable cause) {
    	super(createMessages(messages), cause);
        setMessages(messages);
        this.idTransaction = Token.generate();
    }
    
    /**
     * 
     * @param messages
     * @return
     */
    private static String createMessages(Map<String, Message> messages) {
    	String response = StringUtils.EMPTY;
    	
    	if(messages != null) {
    		for (Message message : messages.values()) {
    			response = response + "[" + message.getMessageType().name() + "]. " 
    					+ message.getCode() + ". " + message.getDescription() + "\\r\\n";
    		}
    	}
    		
    	return response;
    }
    
    /**
     * 
     * @param messages
     */
    private void setMessages(String code, String message) {
    	Map<String, Message> messages = new HashMap<String, Message>();
    	messages.put(code, new Message(message, code, MessageType.Error, null));
    	setMessages(messages);
    }
    
    /**
     * 
     * @param messages
     */
    private void setMessages(Map<String, Message> messages) {
    	this.messages = messages;
    }

    /**
     * 
     */
    private Map<String, Message> messages;
    
    /**
     * 
     * @return
     */
    public Map<String, Message> getMessages() {
    	return this.messages;
    }

	/**
     * 
     */
    private final String idTransaction;
    
    /**
     * 
     * @return
     */
    public HttpStatus status() {
    	return HttpStatus.BAD_REQUEST;
    }
    
    /**
	 * @return the idTransaction
	 */
	public String getIdTransaction() {
		return idTransaction;
	}
}
