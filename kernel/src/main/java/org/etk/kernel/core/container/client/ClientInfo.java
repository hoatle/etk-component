package org.etk.kernel.core.container.client;

public interface ClientInfo {
	public static ClientInfo DEFAULT = new MockClientInfo();

	public String getClientType();

	public String getRemoteUser();

	public String getIpAddress();

	public String getClientName();
}
