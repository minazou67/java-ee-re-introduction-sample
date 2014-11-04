package org.minazou67.sample.ee7.websocket;

import java.io.IOException;
import java.util.logging.Logger;

import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket")
public class SampleWebSocketEndpoint {

	private static final Logger LOG = Logger.getLogger(SampleWebSocketEndpoint.class.getName());

	@OnOpen
	public void onOpen(final Session session) {
		LOG.info("On open");
	}

	@OnMessage
	public void onMessage(final String message, final Session session) {
		LOG.info("On message [" + message + "]");
		try {
			session.getBasicRemote().sendObject("Received [" + message + "]");
		} catch (IOException | EncodeException e) {
			LOG.severe(e.getMessage());
		}
	}

	@OnClose
	public void onClose(final Session session) {
		LOG.info("On close");
	}
}
