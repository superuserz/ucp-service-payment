package com.nagp.ucp.payment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.nagp.ucp.common.constant.QueueConstants;
//import com.nagp.ucp.common.exception.UCPException;
//import com.nagp.ucp.common.request.NotificationPayload;
//import com.nagp.ucp.common.responses.BaseResponse;

@RestController
@RequestMapping(value = "/")
public class PaymentController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PaymentController.class);

	/*@Autowired
	private RabbitTemplate publisher;

	@PostMapping(value = "/doPayment")
	public BaseResponse<String> doPayment() throws UCPException {

		// process payment logic
		LOGGER.info("Making Payment");
		String message = "Your Payment Has been processed.";
		String subject = "UCP Payment";
		NotificationPayload payload = new NotificationPayload(message, subject, null, null);
		publisher.convertAndSend(QueueConstants.NOTIFICATION_EXCHANGE, QueueConstants.NOTIFICATION_ROUTING, payload);
		return new BaseResponse<>("Your Payment is Successful");
	}*/

	@GetMapping(value = "/")
	public String doPayment(){

		return "Hello From Frontend";
	}

}
