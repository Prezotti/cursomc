package com.prezotti.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.prezotti.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
