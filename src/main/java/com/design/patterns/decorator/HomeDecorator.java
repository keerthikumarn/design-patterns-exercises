package com.design.patterns.decorator;

public abstract class HomeDecorator extends Component {

	protected Component component;

	public void setTheComponent(Component component) {
		this.component = component;
	}

	@Override
	public void makeHouse() {
		if (component != null) {
			component.makeHouse();
		}
	}

}
