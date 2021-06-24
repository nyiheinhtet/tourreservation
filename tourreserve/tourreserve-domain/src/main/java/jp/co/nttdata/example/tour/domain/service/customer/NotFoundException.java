package jp.co.nttdata.example.tour.domain.service.customer;

import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.gfw.common.message.ResultMessage;
import org.terasoluna.gfw.common.message.ResultMessages;

import ch.qos.logback.core.joran.spi.NoAutoStartUtil;

public class NotFoundException extends BusinessException{

	/**
	 *
	 */
	private static final long serialVersionUID = 6022724000007068186L;

	public NotFoundException(ResultMessages messages) {
		super(messages);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor
	 *
	 * @param code Message code
	 * @param args Message substitution parameter
	 */
	public NotFoundException(String code, Object...args) {
		super(ResultMessages.error().add(ResultMessage.fromCode(code, args)));
	}



}
