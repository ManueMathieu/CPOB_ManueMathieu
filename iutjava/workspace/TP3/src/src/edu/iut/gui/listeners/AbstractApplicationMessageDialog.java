package src.edu.iut.gui.listeners;

import src.edu.iut.app.IApplicationLogListener;

public abstract class AbstractApplicationMessageDialog implements
		IApplicationLogListener {

	@Override
	public void newMessage(String level, String message) {
	 showMessage(level, message);

	}
	
	protected abstract void showMessage(String level, String message);

}
